package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.PageObject.LoginPage;
import com.inetbanking.PageObject.Managerhomepage;

public class LoginTest extends TestBase {
	
	LoginPage loginPage;
	Managerhomepage homePage;
	public LoginTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginPage = new LoginPage();
	} 
	
	@Test
	public void verifyLogin()
	{
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	
}
