package com.framework.bdd.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig1 {

	Properties properties;
	
	public ReadConfig1() {
		
		File src=new File("./Configuration\\config.properties");
		
		try {
			FileInputStream fs=new FileInputStream(src);
			properties=new Properties();
			properties.load(fs);
		} catch (Exception e) {
			System.out.println("Error is"+ e.getMessage());
		}
	}
	
	
	public String getBrowser() {
		return properties.getProperty("browser");
	}
	
	public String getBaseUrl() {
		return properties.getProperty("baseUrl");
	}
	
	public String getChroPath() {
		return properties.getProperty("chropath");
	}
	
	public String getIePath() {
		return properties.getProperty("ieDriver");
	}

	public String excelPath() {
		return properties.getProperty("Excel_Location");
	}

	
}
