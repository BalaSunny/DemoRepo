package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.AddCustomerPage;
import com.inetbanking.PageObject.LoginPage;

public class AddNewCustometTest extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException
	{
	//	driver.get(baseURL);
		AddCustomerPage cust = new AddCustomerPage(driver) ;
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
	//	Thread.sleep(1000);
		
	//	driver.wait(1000);
		
		System.out.println(driver.getTitle());
		
		
		cust.clickAddNewCustomer();
		
			
		Thread.sleep(1000);
		
		
		//Guru99 Bank Manager HomePage
		
	}

}
