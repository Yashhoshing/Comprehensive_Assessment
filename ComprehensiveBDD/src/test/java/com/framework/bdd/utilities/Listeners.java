package com.framework.bdd.utilities;



import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.framework.bdd.reusablecomponent.BaseClass;



public class Listeners extends BaseClass implements ITestListener {

	ExtentReports extent = ExtentReporterNG.extentReportGenerator();
	String screenshotPath = null;
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName());
		
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		driver.close();
	}
	public void onTestFailure(ITestResult result) {
		try {
			screenshotPath = getscreenshotpath(result.getName());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		test.fail(result.getClass().getName() + " test failed",
				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

		driver.close();

		
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

	
}