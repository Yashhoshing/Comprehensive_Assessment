package com.framework.bdd.pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Title {

public 	WebDriver driver;
public ExtentTest test;

	public Title(WebDriver rdriver,ExtentTest test) {
		driver=rdriver;
		this.test=test;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@class='showindesktop grid-product__image lazyautosizes lazyloaded']")
	WebElement page;
	
	public WebElement pageElement() {
		return page;
	}
		
	
}
