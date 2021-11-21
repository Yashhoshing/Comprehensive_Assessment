package com.framework.bdd.stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.framework.bdd.pageObjects.AllProducts;
import com.framework.bdd.pageObjects.Login;
import com.framework.bdd.reusablecomponent.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefination extends BaseClass {

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	
	
	@Given("User lands on home Page")
	public void user_lands_on_home_page() {
	   driver=setup();
	   driver.get(baseURL);
	}

	@When("click on sigin")
	public void click_on_sigin() {
	   
		Login l1=new Login(driver, test);
		l1.signIn().click();
	}

	@When("Enter the email and password from excel")
	public void enter_the_email_and_password_from_excel() throws IOException, InterruptedException {
	    
		Login l1=new Login(driver, test);
		
		l1.getEmail().sendKeys("yashhosh@gmail.com");
		l1.getPassword().sendKeys("passe");
		
		l1.submit().click();
	}

	@Then("Login verification page title is verified")
	public void login_verification_page_title_is_verified() {
	   
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Challenge– Bigsmall.in";
		assertEquals(expectedTitle,actualTitle);
		log.info("login Successful");
		test.info("user login Successful");
	}

	
	
}
