package com.framework.bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Wishlist {

public WebDriver driver;
public ExtentTest test;

	public  Wishlist(WebDriver rdriver,ExtentTest test) {
		driver=rdriver;
		this.test=test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@title='Home Decor']/div")
	WebElement ele;
	
	@FindBy(xpath = "//*[@id='CollectionAjaxContent']/div[1]/div[2]/div/a/div[2]/div[1]")
	WebElement product;
	
	@FindBy(xpath = "//span[@class='swym-wishlist-cta']")
	WebElement WishList;
	
	
	@FindBy(xpath="//a[@class='swym-link']")
	WebElement Product_visibility;
	
	public WebElement element() {
		return ele;
	}

	public WebElement product() {
		return product;
	}

	public WebElement wisList() {
		return WishList;
	}

	public WebElement Product_visibility() {
		return Product_visibility;
	}
	
	
}
