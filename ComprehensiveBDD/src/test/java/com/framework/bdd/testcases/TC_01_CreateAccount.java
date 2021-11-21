package com.framework.bdd.testcases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.framework.bdd.pageObjects.CreateAccount;
import com.framework.bdd.reusablecomponent.BaseClass;





public class TC_01_CreateAccount extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void createAccount() {

		driver.get(baseURL);
CreateAccount c1=new CreateAccount(driver,test);
//	Report12 report12=new Report12();
//	report12.start("HOME PAGE");

	try {
		c1.signIn().click();;
		log.info("Clicked on SignIn");
	
		
		
		c1.clickCreateAccount().click();
		log.info("Clicked on create account");
	
		
		c1.userName().sendKeys("Yash");
		log.info("Entered Name");
	
		
		c1.userLname().sendKeys("Hoshing");
		log.info("Entered last Name");
	
		c1.userEmail().sendKeys("adf@gmail.com");
		log.info("Entered Email");
		
		c1.userPass().sendKeys("pass@123");
		log.info("Entered Password");
		
		c1.submit().click();
		log.info("Clicked on create account");
		
		
		Thread.sleep(200);
		c1.myAccount().click();
		log.info("Clicked on MY Account");
		
	   }catch (Exception e) {
		System.out.println("Error is"+e.getMessage());
     	}
	
	
	
	
	//System.out.println("...................."+c1.account().getText());
	
	
}
}
