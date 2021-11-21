package com.framework.testcases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.framework.pageobjects.Search;
import com.framework.reusablecomponent.BaseClass;


public class TC_03_Search extends BaseClass {
	
	@Test
	public void search() {
		
		Search s1=new Search(driver);
		s1.search().sendKeys("Cricket",Keys.ENTER);
		
		logger.info("Search Cricket in Search box");
		logger.info("Click enter");
		
		String string=s1.product().getText();
		
		
	System.out.println("-------------------------------------");
	System.out.println(string);
	
	
	
	s1.product().click();
	logger.info("Click on product");
	
	
	String string2=s1.getTitle().getText();
	
	if(string.equals(string2)) {
		logger.info("Title matched on both pages");
		System.out.println("Title matched on both pages");
		Assert.assertTrue(true);
		
	}
	
	s1.addItems().click();
	s1.addItems().click();
	logger.info("Adding two items by clicking + icon");
	
	
	}
	
	
	
	
}
