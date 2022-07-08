package com.inetbanking.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.PageObject.Managerhomepage;
import com.inetbanking.PageObject.NewToursPage;

import junit.framework.Assert;

public class ManagerhomepageTest extends TestBase{
	
	LoginPage loginPage ;
	Managerhomepage homepage;
	
	
	
	public ManagerhomepageTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginPage = new LoginPage();
		 homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	} 
	
		
	@Test(priority = 1)
	public void verifyIdisDispaly()
	{
		Assert.assertTrue(homepage.verifymgrLink());		
	}
	
	@Test(priority = 2)
	public void clickOnAddNewCustomer()
	{
		homepage.clickNewCustomer();
	}

	@Test(priority = 3)
	public void clickLogOut()
	{
		
		homepage.clickOnLogOut();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
    








}
