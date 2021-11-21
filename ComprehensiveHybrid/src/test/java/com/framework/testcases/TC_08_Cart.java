package com.framework.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobjects.Cart_Checkout;
import com.framework.reusablecomponent.BaseClass;



public class TC_08_Cart extends BaseClass{
	

	
	@Test
	public void cartcheckout() throws IOException, InterruptedException{
	
		Cart_Checkout cart=new Cart_Checkout(driver);
		cart.product_selection().click();
		cart.Add_cart().click();
		logger.info("Astronaut USB Night Light product selected");
		logger.info("product added to cart");
		//test.info("Product added to cart");
		cart.Continue_shop().click();
		cart.Cart().click();
		logger.info("Navigated to cart");
		//test.info("Navigated to cart");
		//cart.product_selection().click();
		//cart.Add_cart().click();
		logger.info("Product added to cart successfully");
		//test.info("Product added to cart successfully");
		cart.Go_Checkout().click();
		cart.Remove_whatsappimg().click();
		Assert.assertTrue(cart.continuebutton().isDisplayed());
		logger.info("successfully navigated to the checkout page");
		//test.info("successfully navigated to the checkout page");
	}
	}
