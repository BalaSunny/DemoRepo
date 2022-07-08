package com.inetbanking.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testCases.TestBase;

public class LoginPage extends TestBase {
	
		
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Managerhomepage login(String un, String pwd)
	{
		txtUserName.sendKeys(un);
		txtPassword.sendKeys(pwd);
		btnLogin.click();
		return new Managerhomepage();
		
		
	}
	
	
	}
