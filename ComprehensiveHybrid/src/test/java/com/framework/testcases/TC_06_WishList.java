package com.framework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobjects.Wishlist;
import com.framework.reusablecomponent.BaseClass;

public class TC_06_WishList extends BaseClass {

	@Test
	public void wishList() {
		
		Wishlist wishlist=new Wishlist(driver);
		
		wishlist.element().click();
		logger.info("User clicked on Home decore");
		
		wishlist.product().click();
		logger.info("user clicked on Metalic cage product");
		
		wishlist.wisList().click();
		logger.info("User clicked on wishlist");
		logger.info("User navigated to Wishlist page");
		
		
			Assert.assertEquals((driver.getPageSource().contains("Metallic Cage Cosmetic Organizer")), true);
			logger.info("Product Matched ");
		
	}
}
