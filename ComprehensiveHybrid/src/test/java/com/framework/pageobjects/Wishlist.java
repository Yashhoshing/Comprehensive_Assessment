package com.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {

WebDriver driver;
	
	public  Wishlist(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@title='Home Decor']/div")
	WebElement ele;
	
	@FindBy(xpath = "//*[@id='CollectionAjaxContent']/div[1]/div[2]/div/a/div[2]/div[1]")
	WebElement product;
	
	@FindBy(xpath = "//span[@class='swym-wishlist-cta']")
	WebElement WishList;
	
	public WebElement element() {
		return ele;
	}

	public WebElement product() {
		return product;
	}

	public WebElement wisList() {
		return WishList;
	}

	
	
}
