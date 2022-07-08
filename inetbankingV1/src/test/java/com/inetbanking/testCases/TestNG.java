package com.inetbanking.testCases;

import org.testng.annotations.Test;

public class TestNG {
	
	
	@Test(priority = 1)
	public void TC_001()
	{
		
		System.out.println("Test Case 1");
	}

	
	@Test(priority = 3)
	public void TC_003()
	{
		
		System.out.println("Test Case 3");
	}
	
	
	@Test(priority = 1)
	public void TC_002()
	{
		
		System.out.println("Test Case 2");
	}
	
	@Test(priority = 4)
	public void TC_004()
	{
		
		System.out.println("Test Case 4");
	}
}
