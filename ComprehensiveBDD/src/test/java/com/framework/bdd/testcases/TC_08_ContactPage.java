package com.framework.bdd.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.framework.bdd.pageObjects.Contact;
import com.framework.bdd.reusablecomponent.BaseClass;



public class TC_08_ContactPage extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	
	public void contact() throws InterruptedException {
		
		driver.get(baseURL);
		Contact cp=new Contact(driver,test);
		cp.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
		cp.Name().sendKeys("Raj");
		cp.EmailID().sendKeys("s4romitraj@gmail.com");
		cp.MessageBox().sendKeys("issue with the product");
		test.info("detailed entered successfully");
		Thread.sleep(2000);
		cp.Send().click();
		Thread.sleep(3000);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");
		
	}
	
}
