package com.framework.utilities;




import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.framework.reusablecomponent.BaseClass;




public class Listeners extends ExtentReport implements ITestListener{
	
Screenshot s1=new Screenshot();
	
	 public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getName());
		test.createNode(result.getName());
		 
	}

	public void onTestSuccess(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
	 test.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));
		 test.log(Status.PASS,"passed test case is:"+result.getName());
		}
	
	}

	public void onTestFailure(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE)
		 test.log(Status.FAIL,"Failed test case is:"+result.getName());
			try {
				String imgString=Screenshot.capture(BaseClass.driver, result.getName());
				test.log(Status.FAIL, "ScreenShot is Attached",MediaEntityBuilder.createScreenCaptureFromPath(imgString).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//captureScreenShot(driver, "login");
		
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
		System.out.println("TEST1.1------END HERE");
		extent.flush();
	
	}

}
