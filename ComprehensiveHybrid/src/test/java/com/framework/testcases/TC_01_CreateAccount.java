package com.framework.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.framework.pageobjects.CreateAccount;
import com.framework.reusablecomponent.BaseClass;


public class TC_01_CreateAccount extends BaseClass{

	@Test
	public void createAccount() {

CreateAccount c1=new CreateAccount(driver);
//	Report12 report12=new Report12();
//	report12.start("HOME PAGE");

	try {
		
		logger.info("Navigated to Home page");
		c1.signIn().click();
		
		logger.info("Clicked on signin Button");
	
		
		c1.clickCreateAccount().click();
		logger.info("Clicked on create account");
	
		
		c1.userName().sendKeys("Yash");
		logger.info("First name entered in the text box");
	
		
		c1.userLname().sendKeys("Hoshing");
		logger.info("Last name entered");
	
		c1.userEmail().sendKeys("adf@gmail.com");
		logger.info("Email id entered");
		
		c1.userPass().sendKeys("pass@123");
		logger.info("password entered");
		
		c1.submit().click();
		logger.info("Clicked on create account");
		
		
		if(driver.getPageSource().contains("This email address is already associated with an account.")) {
			logger.info("Account already exists");
			Assert.assertTrue(false);
		}
		else {
			logger.info("Account created Successfully");
			Assert.assertTrue(true);
		}
		
		
		
	   }catch (Exception e) {
		System.out.println("Error is"+e.getMessage());
     	}
	
	
	
	
	System.out.println("...................."+c1.account().getText());
	
	
}
}
