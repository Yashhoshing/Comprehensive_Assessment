package com.framework.utilities;



import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	 public static ExtentReports extent;
    public static ExtentHtmlReporter reporter;
	  ExtentTest test;
	
	public static void start() {
//		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
//		System.out.println(timeStamp+"-----------");
//		String repName="Test-Report-"+timeStamp+".html";
//		System.out.println(repName);
		
		String repName="MYReport.html";

		reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/"+repName);
		reporter.loadConfig(System.getProperty("user.dir")+"/extent-config.xml");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host name", "local Host");
		extent.setSystemInfo("Envirnmont", "QA");
		extent.setSystemInfo("user", "YASH");
		
		reporter.config().setDocumentTitle("BIG SMALL Automation Testing");
		reporter.config().setReportName("Functional Test Report");
		reporter.config().setTheme(Theme.DARK);
		

	}
	
	public static void  end() {
		extent.flush();
		
	}
}
