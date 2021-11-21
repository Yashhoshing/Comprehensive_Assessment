package com.framework.bdd.utilities;



import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReporterNG {

static ExtentReports extent;


public static ExtentReports extentReportGenerator() {
	
String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
String reportPath=System.getProperty("user.dir")+"\\reports\\MyReports-"+timeStamp+".html";
ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);

extent = new ExtentReports();
extent.attachReporter(spark);

extent.setSystemInfo("Host name", "local Host");
extent.setSystemInfo("Envirnmont", "QA");
extent.setSystemInfo("user", "YASH");

spark.config().setDocumentTitle("BIG SMALL Automation Testing");
spark.config().setReportName("Functional Test Report");
spark.config().setTheme(Theme.DARK);


return extent;
}
}