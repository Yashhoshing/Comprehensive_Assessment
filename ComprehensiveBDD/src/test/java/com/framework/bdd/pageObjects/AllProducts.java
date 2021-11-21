package com.framework.bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class AllProducts {

	public WebDriver driver;
	public ExtentTest test;
		public AllProducts(WebDriver driver,ExtentTest test) {
			this.driver=driver;
			this.test=test;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//a[contains(text(), 'All of it')]")
		WebElement All;
		
		
		@FindBy(xpath="//a[@href='/collections/allofit?page=2'][1]")
		WebElement next_page;
	
		@FindBy(xpath="	//div[contains(text(),'Bonsai Tree LED Lamp')]")
		WebElement product_visibility;
		
		public WebElement AllTab() {
			return All;
		}
		
		public WebElement Next_navigation() {
			return next_page;
		}
		
		public WebElement Product_visibility() {
			return product_visibility;
		}
		
		
}
