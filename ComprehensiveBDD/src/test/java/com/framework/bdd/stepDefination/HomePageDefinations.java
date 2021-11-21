package com.framework.bdd.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.framework.bdd.pageObjects.Homepage;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class HomePageDefinations extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Given("User lands on Home Page")
	public void user_lands_on_home_page() {
		driver=setup();
		driver.get(baseURL);
	  
		log.info("BaseURL loaded successfully");
	}

	@Then("BigSmall Website logo should be displayed")
	public void big_small_website_logo_should_be_displayed() {
	  Homepage hp=new Homepage(driver,test);
		log.info("Homepage loaded successfully");
		test.info("Homepage loaded successfully");
		Assert.assertTrue(hp.Homepage_logo().isDisplayed());
	}
}
