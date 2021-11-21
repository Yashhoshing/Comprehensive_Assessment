package com.framework.bdd.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.bdd.pageObjects.GiftCard;
import com.framework.bdd.reusablecomponent.BaseClass;


public class TC_04_GiftCard extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void gift() {
		driver.get(baseURL);
		GiftCard c1=new GiftCard(driver,test);
		
		c1.clickGiftCard().click();
		
		c1.clickPrice().click();
		
		c1.clickAddTOCart().click();
		
	boolean ans=c1.clickCart().isDisplayed();
	
			Assert.assertEquals(ans, true);
	}
}

