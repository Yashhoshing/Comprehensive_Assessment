package com.framework.bdd.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.framework.bdd.pageObjects.Contact;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class ContactDefination extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());

	@When("click contact us tab in footer")
	public void click_contact_us_tab_in_footer() {
	  
		Contact c1=new Contact(driver, test);
		
		c1.Contact_us().click();
		log.info("contact page loaded successfully");
		test.info("contact page loaded successfully");
	}

	@When("Enter the name {string} email {string} and message {string} and click on send")
	public void enter_the_name_email_and_message_and_click_on_send(String string, String string2, String string3) throws InterruptedException {
	   
		Contact cp=new Contact(driver,test);
		cp.Name().sendKeys(string);
		log.info("Entered the name");
		cp.EmailID().sendKeys(string2);
		log.info("Entered the email address");
		cp.MessageBox().sendKeys(string3);
		test.info("detailed entered successfully");
		Thread.sleep(2000);
		cp.Send().click();
		Thread.sleep(3000);
		
	}

	@Then("Thankyou message displayed")
	public void thankyou_message_displayed() {
		Contact cp=new Contact(driver,test);
		Assert.assertTrue(cp.Sending_confirmation().isDisplayed());
		log.info("message sent successfully");
		test.info("message sent successfully");
		
	}
	
}
