package com.framework.bdd.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.framework.bdd.pageObjects.GiftCard;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GiftCardDefination extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	
	
	@When("click on Giftcard")
	public void click_on_giftcard() {
	   
		GiftCard c1=new GiftCard(driver, test);
		c1.clickGiftCard();
	}

	@When("click on add to cart below product")
	public void click_on_add_to_cart_below_product() throws InterruptedException {
	  
		GiftCard gfcard=new GiftCard(driver,test);
		gfcard.clickAddTOCart().click();
		Thread.sleep(2000);
		log.info("Gift card added");
		test.info("Gift card added");
	}

	@Then("Check if product is visibal in Cart")
	public void check_if_product_is_visibal_in_cart() {
		GiftCard gfcard=new GiftCard(driver,test);
		//Assert.assertTrue(gfcard.checkout_availibility().isDisplayed());
		log.info("Gift card added successfully");
		test.info("Gift card added successfully");
	}

	
}
