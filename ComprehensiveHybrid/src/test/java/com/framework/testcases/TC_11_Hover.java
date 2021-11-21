package com.framework.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.pageobjects.HoverAction;
import com.framework.reusablecomponent.BaseClass;



public class TC_11_Hover extends BaseClass {
	

	
	@Test
	public void Hover() throws IOException, InterruptedException{
		
		HoverAction ha=new HoverAction(driver);
		Actions a=new Actions(driver);
		WebElement move=ha.Hover_select();
		a.moveToElement(move).build().perform();
		logger.info("Hover performed successfully");
		//test.info("Hover performed successfully");
		Thread.sleep(3000);
		ha.Select_Item().click();
		Thread.sleep(3000);
		Assert.assertTrue(ha.Page_Loaded().isDisplayed());
		logger.info("desired page loaded successfully");
		//test.info("desired page loaded successfully");
  }
}
