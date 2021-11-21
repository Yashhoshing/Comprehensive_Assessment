package com.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="//a[@class='site-nav__link site-nav__link--icon signinlink']")
	WebElement signIN;
	
	@FindBy(id="CustomerEmail")
	WebElement emailElement;
	
	@FindBy(id = "CustomerPassword")
	WebElement password;
	
	
	@FindBy(xpath ="//input[@class='btn btn--full']")
	WebElement submit;
	
	public WebElement signIn() {
		return signIN;
	}

	
	public WebElement getEmail() {
		return emailElement;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement submit() {
		return submit;
	}
	
}
