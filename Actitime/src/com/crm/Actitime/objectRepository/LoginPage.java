package com.crm.Actitime.objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.acttime.generic_library.readDatafromproperty;

public class LoginPage {
	@FindBy(id = "username")
	private WebElement untbx;

	@FindBy(name = "pwd")
	private WebElement pwtbx;

	@FindBy(xpath = "//div[.='Login ']")
	private WebElement lgnbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	 public WebElement getUntbx() {
		return untbx;
		 
	 }
	 public WebElement getPwtbx() {
		return pwtbx;
	 }
	 
	 public WebElement getLgnbtn() {
			return lgnbtn;
		
	}
	
	 public void logintoActitime() throws IOException {
		readDatafromproperty R=new readDatafromproperty();
		 String UN = R.readdatafromproperty("username");
		 String PW = R.readdatafromproperty("password");
		 untbx.sendKeys(UN);
		 pwtbx.sendKeys(PW);
		 lgnbtn.click();
	 }
}








