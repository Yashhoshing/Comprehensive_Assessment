package com.framework.bdd.reusablecomponent;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.framework.bdd.utilities.ReadConfig1;






public class BaseClass {


	ReadConfig1 readconfig=new ReadConfig1();
	public static ExtentTest test;
	public String baseURL=readconfig.getBaseUrl();
	public static WebDriver driver;
	public String browser=readconfig.getBrowser();
	public String excelPath=readconfig.excelPath();
	
	@BeforeTest
	public WebDriver setup()
	{			
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChroPath());
			driver=new ChromeDriver();
		}
		
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getIePath());
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	

		public static String getscreenshotpath(String TestCaseName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String target = (System.getProperty("user.dir") + "/Screenshots/" + TestCaseName +"-"+System.currentTimeMillis() + ".png");
		File file=new File(target);
		FileUtils.copyFile(source, file);
		return target;
	}
	

	

	
}

