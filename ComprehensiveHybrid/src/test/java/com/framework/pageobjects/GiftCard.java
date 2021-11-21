package com.framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard {

	
	WebDriver driver;
	
	public GiftCard(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@class='site-nav__link site-nav__link--icon giftcardlink']")
	WebElement giftcard;
	
	@FindBy(xpath = "//label[@for='ProductSelect-738195636312-option-title-Rs.+2000']")
	WebElement price;
	
	@FindBy(xpath = "//form[@id='AddToCartForm-738195636312']//button[@type='submit']")
	WebElement addtocartElement;
	
	@FindBy(xpath = "//div[@id='CartDrawer']")
	WebElement cart;
	
	
	public WebElement clickGiftCard() {
		return giftcard;
	}
	
	public WebElement clickPrice() {
		return price;
	}
	
	public WebElement clickAddTOCart() {
		return addtocartElement;
	}
	
	public WebElement clickCart() {
		return cart;
	}
}
