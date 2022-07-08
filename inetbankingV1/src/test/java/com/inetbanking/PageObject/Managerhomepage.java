package com.inetbanking.PageObject;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.inetbanking.testCases.TestBase;

public class Managerhomepage extends TestBase {

	AddCustomerPage addcustomerpage;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")
	WebElement mgrLink;
	
	@FindBy(xpath = "//a[contains(text(),'New Customer')]")
	WebElement linkNewCustmor;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	WebElement linklogOut;

	public Managerhomepage()
	{
		PageFactory.initElements(driver, this);	
	
	}
	
	
	public boolean verifymgrLink()
	{
	  return mgrLink.isDisplayed();
		
	}
	
	public AddCustomerPage clickNewCustomer()
	{
		linkNewCustmor.click();
		driver.switchTo().alert().dismiss();
		return new AddCustomerPage();
		
	}
	
	public LoginPage clickOnLogOut()
	{
		linklogOut.click();
		return new LoginPage();
		
	}
	
	
}