package com.inetbanking.testCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\inetbankingV1\\Configuration\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
	  	}
		else if(browserName.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
			 driver =new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));  
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

}                                               
