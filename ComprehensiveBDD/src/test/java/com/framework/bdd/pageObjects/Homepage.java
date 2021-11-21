package com.framework.bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
public class Homepage {

		public WebDriver driver;
		public ExtentTest test;
		public Homepage(WebDriver driver,ExtentTest test) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			this.test=test;
			PageFactory.initElements(driver, this);
		}
		
		//footer//span[contains(text(),'Powder')]
		@FindBy(xpath="//div[@class='cta'][1]")
		WebElement Logo;
		
	
		public WebElement Homepage_logo()
		{
			return Logo;
		}

}

