package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestAddNew {
	WebDriver driver;
	
	@Test(dataProvider="testdata")
	public void addNewCust(String username,String password) throws IOException 	{
		
           System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
           
		
           ChromeOptions chrome = new ChromeOptions();
		driver =new ChromeDriver(chrome);
		driver.manage().window().maximize();
	
		driver.get("http://www.demo.guru99.com/V4/");
		
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		
		
		TakesScreenshot src = ((TakesScreenshot) driver);
		File srcfile=src.getScreenshotAs(OutputType.FILE);
		File desfile=new File("C:\\Users\\Admin\\eclipse-workspace\\inetbankingV1\\Screenshots\\src.png");
		FileUtils.copyFile(srcfile, desfile);
		
		String expectedUrl="Guru99 Bank Manager HomePage";
	    Assert.assertEquals(expectedUrl, driver.getTitle());
	
		
	
		//Alert alt = driver.switchTo().alert();
		//String actualBoxtitle = alt.getText(); // get content of the Alter Message
		//alt.accept();
		//System.out.println(actualBoxtitle);
		
	}
	


@DataProvider(name="testdata")
public Object[][] tData()
{
	return new Object[][] {
		
		{"mngr416478","hhh"},
		{"pqr","ezYdArU"},
		{"mngr416478","ezYdArU"}
		
	};
	
}

@AfterMethod
public void teardown()
{
	driver.close();
	
}
}

