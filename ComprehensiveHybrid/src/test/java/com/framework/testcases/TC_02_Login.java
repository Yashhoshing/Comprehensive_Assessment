package com.framework.testcases;




import static org.testng.Assert.assertTrue;

import java.io.IOException;

import javax.sound.sampled.TargetDataLine;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.UserDataHandler;

import com.framework.pageobjects.Login;
import com.framework.reusablecomponent.BaseClass;
import com.framework.utilities.XLUtils;


public class TC_02_Login extends BaseClass{

	@Test(dataProvider = "loginData")
	public void validLogin(String username,String password) {
		
		Login l1=new Login(driver);
		
		
		l1.signIn().click();
		logger.info("Clicked on sign in");
		l1.getEmail().sendKeys(username);
		logger.info("Entered email address");
		
		l1.getPassword().sendKeys(password);
		logger.debug(" enter the password ");
		
		l1.submit().click();
		logger.warn("Clicking on  signin the button");
		
		if(driver.getPageSource().contains("Challenge– Bigsmall.in")) {
			assertTrue(true);
			logger.info("Login successful");
			
		}
		else {
			logger.error("Login failed");
			
			Assert.assertTrue(false);
		}
		
	}
	



	@DataProvider(name="loginData")
String[][] getData() throws IOException{

		String pathString="C:\\Users\\Lenovo\\Desktop\\LoginData.xlsx";
		
		int rowCount=XLUtils.getRowCount(pathString,"Sheet1");
		int cellCount=XLUtils.getCellCount(pathString,"Sheet1", rowCount);
		
		String logindata[][]=new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(pathString,"Sheet1", i, j);
			}
			
		}
		return logindata;
	}
	
	
}
