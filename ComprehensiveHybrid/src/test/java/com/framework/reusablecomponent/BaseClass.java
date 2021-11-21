package com.framework.reusablecomponent;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import com.framework.utilities.ReadConfig1;
import com.framework.utilities.ExtentReport;



public class BaseClass {

ReadConfig1 readConfig=new ReadConfig1();
	
	public String baseUrl=readConfig.getBaseUrl();

	
	public static WebDriver driver;
	public static Logger logger;
	public ExtentReports extent;
    public ExtentTest test;

	
	@BeforeSuite
	public void Before() {
		ExtentReport.start();
	}
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		
		logger=LogManager.getLogger(BaseClass.class);
	
		System.out.println(baseUrl);
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readConfig.getChroPath());
		logger.info("iN CHROME Browser");
		System.out.println("chrome browser");
		driver=new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver",readConfig.getIePath());
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(baseUrl);
		driver.get(baseUrl);
		
		
		
	}
	
	
	@AfterClass
	public void tearDown() {
	
		driver.quit();
		
	}
	
	@AfterSuite
	public void after() {
		ExtentReport.end();
	}
	

	
	

	
}

