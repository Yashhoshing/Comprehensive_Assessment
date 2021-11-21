package com.framework.bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortBy {

	WebDriver driver;
	public SortBy(WebDriver rDriver) {
		driver=rDriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-dropdown-rel='all-of-it']")
	WebElement allElement;
	
	
}
