package com.framework.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Title {

public 	WebDriver driver;
	public Title(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@class='showindesktop grid-product__image lazyautosizes lazyloaded']")
	WebElement page;
	
	public WebElement pageElement() {
		return page;
	}
		
	
}
