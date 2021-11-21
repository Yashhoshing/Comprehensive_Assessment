package com.framework.bdd.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.framework.bdd.pageObjects.AllProducts;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.lu.a;

public class AllProductsDefination extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
   public AllProducts Apt;
	
	@Given("User opens Browser")
	public void user_opens_browser() {
		driver=setup();
		driver.get(baseURL);
		//AllProducts all=new AllProducts(driver,test);
		//all.AllTab();
		log.info("User navigated to all product tab");

	
	
	}

	@When("click on all of it tab in header")
	public void click_on_all_of_it_tab_in_header() {
		Apt=new AllProducts(driver,test);
		Apt.AllTab().click();
		
		log.info("User clicked on all of it on header tab");

	}

	@When("navigate to second page")
	public void navigate_to_second_page() {
	 
		//AllProducts Apt=new AllProducts(driver,test);
		Apt.Next_navigation().click();
		log.info("navigated to 2nd page using next arrow");
		
	}

	@Then("validate a product on the loaded page")
	public void validate_a_product_on_the_loaded_page() {
		//AllProducts Apt=new AllProducts(driver,test);
		Assert.assertTrue(Apt.Product_visibility().isDisplayed());
		log.info("Product is successfully displayed");
		test.info("Product is successfully displayed");
	}

	
}
