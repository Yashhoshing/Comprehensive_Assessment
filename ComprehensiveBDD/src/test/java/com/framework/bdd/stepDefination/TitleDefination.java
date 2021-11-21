package com.framework.bdd.stepDefination;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.framework.bdd.pageObjects.Title;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TitleDefination extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	
	@Then("Validate if the the title is \"Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts� Bigsmall.in\"")
	public void validate_if_the_the_title_is_gifts_online_send_unique_unusual_gifts_in_india_buy_gifts_bigsmall_in() {
	 
		Title t1=new Title(driver, test);
		String dataString="Gifts Online - Send Unique, Unusual Gifts in India, Buy Gifts– Bigsmall.in";
		if(driver.getTitle().equals(dataString)) {		
		log.info("Title Matched");
			test.info("Title verified");
			Assert.assertTrue(true);
		}else {
				log.error("Title Match Failed");
				Assert.assertTrue(false);
			}
		}
		
	}



