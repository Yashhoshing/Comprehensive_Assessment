package com.framework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobjects.Title;
import com.framework.reusablecomponent.BaseClass;


public class TC_05_Title extends BaseClass {

	@Test
	public void verifyTitle() {
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle()+"...................");
		String dataString="Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in";
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals(dataString)) {	
			logger.info("Title Matched");
			Assert.assertTrue(true);
		}
			else {
				logger.error("Title Match Failed");
				Assert.assertTrue(false);
			}
		}
	
	@Test(priority = 1)
		public void pageContains() {
			
			Title t1=new Title(driver);
			if(t1.pageElement().isDisplayed()) {
				logger.info("Component displayed on page");
				Assert.assertTrue(true);
				
			}
			else {
				
				logger.error("Element not visible");
				Assert.assertTrue(false);
			}
		}
	}


