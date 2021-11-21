package com.framework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobjects.GiftCard;
import com.framework.reusablecomponent.BaseClass;

public class TC_04_GiftCard extends BaseClass {

	@Test
	public void gift() {
		
		GiftCard c1=new GiftCard(driver);
		
		c1.clickGiftCard().click();
		
		logger.info("user navigated to home page");
		logger.info("Click on gift card from uupper section");
		c1.clickPrice().click();
		
		logger.info("change the price to 2000");
		
		c1.clickAddTOCart().click();
		
		logger.info("click on Add to cart");
		
	if(driver.getPageSource().contains("Subtotal")) {
		logger.info("Gift card added successfully");
		Assert.assertTrue(true);
	}
		
	else {
		logger.info("Gift card add action failed");
		Assert.assertTrue(false);
	}
	}
}

