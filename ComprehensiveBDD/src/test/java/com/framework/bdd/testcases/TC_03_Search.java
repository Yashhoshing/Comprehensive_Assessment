package com.framework.bdd.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.framework.bdd.pageObjects.Search;
import com.framework.bdd.reusablecomponent.BaseClass;



public class TC_03_Search extends BaseClass {
	
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test
	public void search() {
		driver.get(baseURL);
		Search s1=new Search(driver,test);
		s1.search().sendKeys("Cricket",Keys.ENTER);
		
		log.info("Search Cricket in Search box");
		log.info("Click enter");
		
		String string=s1.product().getText();
		
		
	System.out.println("-------------------------------------");
	System.out.println(string);
	
	
	
	s1.product().click();
	log.info("Click on product");
	
	
	String string2=s1.getTitle().getText();
	
	if(string.equals(string2)) {
		log.info("Title matched on both pages");
		System.out.println("Title matched on both pages");
		Assert.assertTrue(true);
		
	}
	
	s1.addItems().click();
	s1.addItems().click();
	log.info("Adding two items by clicking + icon");
	
	
	}
	
	
	
	
}
