package com.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class AllproductTab {
	
public WebDriver driver;
public ExtentTest test;
	public AllproductTab(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(), 'All of it')]")
	WebElement All_tab_click;
	
	
	@FindBy(xpath="//a[@href='/collections/allofit?page=2'][1]")
	WebElement next_page;
	//div[contains(text(),'Santa Earrings')]
	@FindBy(xpath="	//div[contains(text(),'Santa Earrings')]")
	WebElement product_visibility;
	
	public WebElement AllTab() {
		return All_tab_click;
	}
	
	public WebElement Next_navigation() {
		return next_page;
	}
	
	public WebElement Product_visibility() {
		return product_visibility;
	}
	
	
}
