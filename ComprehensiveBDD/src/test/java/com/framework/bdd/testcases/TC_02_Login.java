package com.framework.bdd.testcases;




import java.io.IOException;

import javax.sound.sampled.TargetDataLine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.UserDataHandler;

import com.framework.bdd.pageObjects.Login;
import com.framework.bdd.reusablecomponent.BaseClass;
import com.framework.bdd.utilities.XLUtils;



public class TC_02_Login extends BaseClass{

	public static Logger log= LogManager.getLogger(BaseClass.class.getName());
	@Test(dataProvider = "loginData")
	public void validLogin(String username,String password) {
		
		driver.get(baseURL);
		Login l1=new Login(driver, test);
		
		
		l1.signIn().click();
		log.info("Clicked on sign in");
		l1.getEmail().sendKeys(username);
		log.info("Entered email address");
		
		l1.getPassword().sendKeys(password);
		log.debug(" enter the password ");
		
		l1.submit().click();
		log.warn("Clicking on the button");
		
		
	}
	

	public void inValidLogin() throws InterruptedException {
		
     Login l1=new Login(driver,test);
		
		l1.signIn().click();
		
		l1.getEmail().sendKeys("yash1@gmail.com00000");
		
		l1.getPassword().sendKeys("23000000");
		l1.submit().click();
	
		Thread.sleep(200);
	}

	@DataProvider(name="loginData")
String[][] getData() throws IOException{

		String pathString=excelPath;
		
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
