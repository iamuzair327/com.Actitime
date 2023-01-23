package com.crm.Actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Actitime.objectRepository.Homepage;
import com.crm.Actitime.objectRepository.TaskPage;
import com.crm.acttime.generic_library.BaseClass;
import com.crm.acttime.generic_library.Listener_implementation;
@Listeners(Listener_implementation.class)
public class CreateCustomer extends BaseClass{
	
	@Test
	public void CreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	Homepage hp=new Homepage(driver);
	  Thread.sleep(4000);
	  
	hp.clickonTasktab();
	TaskPage Tp=new TaskPage(driver);
	Tp.CreateCustomer();
	
	
	}
}