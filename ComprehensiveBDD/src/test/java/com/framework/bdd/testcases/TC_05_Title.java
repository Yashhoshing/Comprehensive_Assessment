package com.framework.bdd.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.bdd.pageObjects.Title;
import com.framework.bdd.reusablecomponent.BaseClass;



public class TC_05_Title extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void verifyTitle() throws InterruptedException {
		
		driver.get(baseURL);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle()+"...................");
		String dataString="Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in";
		System.out.println(driver.getTitle());
		Thread.sleep(200);
		if(driver.getTitle().equals(dataString)) {	
			log.info("Title Matched");
			System.out.println("11111111");
			Assert.assertTrue(true);
		}
			else {
				log.error("Title Match Failed");
				Assert.assertTrue(false);
			}
		}
	
	@Test(priority = 1)
		public void pageContains() {
			
			Title t1=new Title(driver,test);
			if(t1.pageElement().isDisplayed()) {
				log.info("Component displayed on page");
				Assert.assertTrue(true);
				
			}
			else {
				
				log.error("Element not visible");
				Assert.assertTrue(false);
			}
		}
	}


