package com.framework.bdd.stepDefination;

import org.testng.Assert;

import com.framework.bdd.pageObjects.Wishlist;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishListDefination extends BaseClass {


	
	@When("click on a product and click on add to cart")
	public void click_on_a_product_and_click_on_add_to_cart() {
	    
		Wishlist wishlist=new Wishlist(driver, test);
		
		wishlist.element().click();
		
		wishlist.product().click();
	}

	@When("click on wishlist tab on the page")
	public void click_on_wishlist_tab_on_the_page() {
		Wishlist wishlist=new Wishlist(driver, test);
		
		wishlist.wisList().click();
	}

	@Then("validate that the product is available in wishlist or not")
	public void validate_that_the_product_is_available_in_wishlist_or_not() {
		Assert.assertEquals((driver.getPageSource().contains("Metallic Cage Cosmetic Organizer")), true);
		//logger.info("Product Matched ");
	}

}
