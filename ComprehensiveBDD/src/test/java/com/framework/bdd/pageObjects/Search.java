package com.framework.bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Search {

	  public WebDriver driver;
       public ExtentTest test;
	
      public Search(WebDriver rdriver,ExtentTest test) {
		driver=rdriver;
		this.test=test;
		PageFactory.initElements(driver, this);
	    }
	
      @FindBy(xpath = "//input[@type='search']")
      WebElement search;
      
      @FindBy(xpath = "//li[@id='snize-product-4673922334808']//a/div/span/span[1]")
      WebElement element;
      
      
      @FindBy(xpath = "//h1[@class='h1 product-single__title']")
      WebElement titlElement;
      
      @FindBy(xpath = "//span[@class='js--qty-adjuster js--add']")
      WebElement add;
      
      public WebElement search() {
  		return search;
  	}

  	
  	public WebElement product() {
  		return element;
  	}


	public WebElement getTitle() {
		return titlElement;	
	}
	
	public WebElement addItems() {
		return add ;	
	}
}
