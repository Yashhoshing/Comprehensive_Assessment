package com.framework.bdd.testcases;

import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.bdd.reusablecomponent.BaseClass;



@Test
public class FooterElements extends BaseClass {
	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	public void footElemets() {
		
		log.info("Iteraiing through footer elements");
		List<WebElement> elementName = driver.findElements(By.xpath("//div[@class='grid footersecond']"));
		int i=0;
		for (Iterator iterator = elementName.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());
		}
		Assert.assertTrue(true);
	}
}
