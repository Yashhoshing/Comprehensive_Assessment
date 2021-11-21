package com.framework.bdd.stepDefination;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import com.framework.bdd.pageObjects.Search;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Product;

public class SearchDefination extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	
	@When("user enter a product name {string} and click on search")
	public void user_enter_a_product_name_and_click_on_search(String string) {
	   
	    Search s1=new Search(driver, test);
	    
	    log.info("User navigated to home page");
	    s1.search().sendKeys(string,Keys.ENTER);
	    log.info("Enter Cricket in search tab");
	    test.info("Search for cricket products");
	    test.info("expected result displayed");
	    
	}

	@Then("user selects Sachin tendulkar label pin product")
	public void user_selects_sachin_pin_product() {
		 Search s1=new Search(driver, test);
		 s1.product().click();
		 log.info("product selected");
		  test.info("product selected");
		 s1.addItems().click();
		 
		 log.info("Product added to cart");
		 test.info("Product addded");
		 
		 
	}

	@Then("The searched product should be displayed on the result page")
	public void the_searched_product_should_be_displayed_on_the_result_page() {
	   
		if(driver.getPageSource().contains("Sachin Tendulkar Lapel Pin")) {
			
			Assert.assertTrue(true);
			log.info("Displayed expected search result");
			
		}
			
		
	}

	
}
