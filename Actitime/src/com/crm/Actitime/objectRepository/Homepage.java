package com.crm.Actitime.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(xpath = "//div[.='Tasks']")
private WebElement tasklink;

@FindBy(xpath = "//div[.='Reports']")
private WebElement reportslink;

@FindBy(xpath = "//div[.='Users']")
private WebElement userslink;

@FindBy(xpath = "//a[.='Logout']")
private WebElement logoutlink;

public Homepage(WebDriver driver) {
	PageFactory.initElements(driver, this );
}

public WebElement getTasklink() {
	return tasklink;
}

public WebElement getReportslink() {
	return reportslink;
}

public WebElement getUserslink() {
	return userslink;
}

public WebElement getLogoutlink() {
	return logoutlink;
}
//business logic
 public void clickonTasktab() {
	 tasklink.click();
 }

}
