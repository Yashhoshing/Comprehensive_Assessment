package com.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {

       WebDriver driver;
	
      public Search(WebDriver rdriver) {
		driver=rdriver;
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
