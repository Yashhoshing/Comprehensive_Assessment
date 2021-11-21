package com.framework.bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Login {

	WebDriver driver;
	public ExtentTest test;
	public Login(WebDriver rdriver,ExtentTest test) {
		driver=rdriver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath ="//a[@class='site-nav__link site-nav__link--icon signinlink']")
	WebElement signIN;
	
	@FindBy(id="CustomerEmail")
	WebElement emailElement;
	
	@FindBy(xpath = "//input[@id='CustomerPassword']")
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
