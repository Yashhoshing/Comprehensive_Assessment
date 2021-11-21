package com.framework.testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.reusablecomponent.BaseClass;

@Test
public class TC_09_Footer extends BaseClass {

	public void footElemets() {
		
		logger.info("Iteraiing through footer elements");
		List<WebElement> elementName = driver.findElements(By.xpath("//div[@class='grid footersecond']"));
		int i=0;
		for (Iterator iterator = elementName.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
	
		System.out.println(webElement.getText());
		
		if(driver.getPageSource().contains("OUR COMPANY")) {
			logger.info("footer elements verified");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		}
	
	}
}
