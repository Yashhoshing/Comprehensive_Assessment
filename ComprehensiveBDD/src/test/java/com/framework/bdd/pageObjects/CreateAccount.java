package com.framework.bdd.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class CreateAccount {

	WebDriver driver;
	public ExtentTest test;
	
public CreateAccount(WebDriver rdriver,ExtentTest test) {
	
	driver=rdriver;
	this.test=test;
	PageFactory.initElements(driver,this);
}


@FindBy(xpath ="//a[@class='site-nav__link site-nav__link--icon signinlink']")
WebElement signIN;


@FindBy(id = "customer_register_link")
WebElement link;

@FindBy(id = "FirstName")
WebElement fname;

@FindBy(id = "LastName")
WebElement lname;

@FindBy(id="Email")
WebElement email;

@FindBy(id ="CreatePassword")
WebElement pass;

@FindBy(xpath = "//input[@type='submit']")
WebElement submit;

@FindBy(xpath = "//div[@class='grid__item medium-up--one-third']//p[@class='h5']")
WebElement accountElement;


@FindBy(xpath = "//a[@class='site-nav__link site-nav__link--icon signinlink']")
WebElement myAccount;

public WebElement signIn() {
	return signIN;
}


public WebElement userName() {
	return fname;
}

public WebElement userLname() {
	return lname;
}

public WebElement userEmail() {
	return email;
}

public WebElement userPass() {
	return pass;
}


public WebElement submit() {
	return submit;
}


public WebElement clickCreateAccount() {
	return link;
}

public WebElement myAccount() {
	return myAccount;
}


public WebElement account() {
	return accountElement;
}







}
