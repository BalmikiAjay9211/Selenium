package com.actitime.test;

 
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomeModule {
	  @BeforeMethod
	  public void login() {
		 Reporter.log("login",true);
	  }
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test
	public void createCustomer()
	{
	Reporter.log("CreateCustomer",true);
	}
	@Test
	public void deletCustomer()
	{
		Reporter.log("deletCustomer",true);
	}
}
