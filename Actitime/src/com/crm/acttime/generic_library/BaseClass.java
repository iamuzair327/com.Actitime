


package com.crm.acttime.generic_library;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	readDatafromproperty r=new readDatafromproperty();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database is connected",true);	
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("database is disconnected",true);	
	
	}
	@BeforeTest
	public void launchbrowser() throws IOException {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String URL = r.readdatafromproperty("url");
		driver.get(URL);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("browser close");
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
	  String UN = r.readdatafromproperty("username");
	  String PW = r.readdatafromproperty("password");
	  driver.findElement(By.id("username")).sendKeys(UN);
	  driver.findElement(By.name("pwd")).sendKeys(PW);
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  Thread.sleep(4000);
	  
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

