package com.framework.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobjects.AllproductTab;
import com.framework.reusablecomponent.BaseClass;



public class TC_07_AllProducts extends BaseClass{
	

	
	@Test
	public void AllTab() throws IOException, InterruptedException{
		
		AllproductTab Apt=new AllproductTab(driver);
		Apt.AllTab().click();
		logger.info("All tab  section is clicked and page load succssfully");
		//test.info("All tab clicked and page loaded");
		Apt.Next_navigation().click();
		logger.info("navigated to 2nd page");
		Assert.assertTrue(Apt.Product_visibility().isDisplayed());
		logger.info("Product is successfully displayed");
		//test.info("Product is successfully displayed");
	
	}
}
