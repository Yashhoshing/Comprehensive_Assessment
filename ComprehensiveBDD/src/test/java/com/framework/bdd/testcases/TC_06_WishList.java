package com.framework.bdd.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.bdd.pageObjects.Wishlist;
import com.framework.bdd.reusablecomponent.BaseClass;


public class TC_06_WishList extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void wishList() {
		driver.get(baseURL);
		Wishlist wishlist=new Wishlist(driver,test);
		
		wishlist.element().click();
		log.info("User clicked on Home decore");
		
		wishlist.product().click();
		log.info("user clicked on Metalic cage product");
		
		wishlist.wisList().click();
		log.info("User clicked on wishlist");
		log.info("User navigated to Wishlist page");
		
		
			Assert.assertEquals((driver.getPageSource().contains("Metallic Cage Cosmetic Organizer")), true);
			log.info("Product Matched ");
		
	}
}
