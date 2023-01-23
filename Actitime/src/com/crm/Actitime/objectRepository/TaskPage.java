package com.crm.Actitime.objectRepository;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.acttime.generic_library.ReaddatafromExcel;



public class TaskPage {
	
@FindBy(xpath = "//div[.='Add New']")
private WebElement addnewbtn;


@FindBy(xpath = "//div[.='+ New Customer']")
private WebElement addnewcustbtn;


@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custnametext;

@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement descriptiontext;

@FindBy(xpath = "(//div[.='- Select Customer -'])[2]")
private WebElement dropdown;


@FindBy(xpath = "(//div[@class='itemRow cpItemRow '])[2]")
private WebElement companyname;


@FindBy(xpath = "//div[.='Create Customer']")
private WebElement createbtn;

public TaskPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this );
//(//div[.='- Select Customer -'])[2]

}
public WebElement getAddnewbtn() {
	return addnewbtn;
}


public WebElement getAddnewcustbtn() {
	return addnewcustbtn;
}


public WebElement getCustnametext() {
	return custnametext;
}


public WebElement getDescriptiontext() {
	return descriptiontext;
}


public WebElement getDropdown() {
	return dropdown;
}


public WebElement getCompanyname() {
	return companyname;
}


public WebElement getCreatebtn() {
	return createbtn;
}

//===============business logic=====================
public void CreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	addnewbtn.click();
	Thread.sleep(4000);
	addnewcustbtn.click();
	Thread.sleep(4000);
	ReaddatafromExcel rd=new ReaddatafromExcel();
	String uzair = rd.readdatafromexcel("sheet1", 1, 1);
	custnametext.sendKeys(uzair);
	Thread.sleep(4000);
    String uzair1 = rd.readdatafromexcel("sheet1", 1, 2);
	descriptiontext.sendKeys("uzair1");
	dropdown.click();
	Thread.sleep(4000);
	companyname.click();
	Thread.sleep(4000);
	createbtn.click();
	Thread.sleep(4000);
	
	
}
}



