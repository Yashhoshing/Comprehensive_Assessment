package com.framework.bdd.stepDefination;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.framework.bdd.pageObjects.HoverAction;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class HoverActionDefination extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	
	@Given("User navigated to Home Page")
	public void user_navigated_to_home_page() throws InterruptedException {
		driver=setup();
		driver.get(baseURL);
		
		HoverAction ha=new HoverAction(driver,test);
		Actions a=new Actions(driver);
		WebElement move=ha.Hover_select();
		a.moveToElement(move).build().perform();
		log.info("Hover on the Birthday section");
		test.info("Hover on the Birthday section");
		Thread.sleep(3000);
		
	}

	@When("moved to birthday gift section")
	public void moved_to_birthday_gift_section() throws InterruptedException {
		HoverAction h1=new HoverAction(driver,test);
		h1.Select_Item().click();
		Thread.sleep(3000);
		test.info("Element selected from the Hover tab");
	}

	@When("select 1st Birthday Gifts")
	public void select_1st_birthday_gifts() {
		HoverAction h1=new HoverAction(driver,test);
	
		h1.Select_Item();
		log.info("Select 1st Birthday gift");
		test.info("1st birthday gifts selected");
	}
	

	@Then("checks if correct product is selected")
	public void checks_if_correct_product_is_selected() {
HoverAction ha=new HoverAction(driver,test);
		Assert.assertTrue(ha.Page_Loaded().isDisplayed());
		log.info("desired page loaded successfully");
		test.info("page loaded successfully");
		
	}
}

