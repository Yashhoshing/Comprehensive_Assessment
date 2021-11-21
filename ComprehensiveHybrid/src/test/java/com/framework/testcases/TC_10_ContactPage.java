package com.framework.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobjects.Contactpage;
import com.framework.reusablecomponent.BaseClass;



public class TC_10_ContactPage extends BaseClass{

	@Test
	public void ContactPage() throws InterruptedException
	{
		
		
		Contactpage cp=new Contactpage(driver);
		cp.Contact_us().click();
		logger.info("contact page loaded successfully");
		//test.info("contact page loaded successfully");
		cp.Name().sendKeys("YASH");
		cp.EmailID().sendKeys("yashhoshing2@gmail.com");
		cp.MessageBox().sendKeys("Vaidatiing the contact page");
		//test.info("detailed entered successfully");
		Thread.sleep(2000);
		cp.Send().click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		logger.info("message sent successfully");
		//test.info("message sent successfully");
	}
}
