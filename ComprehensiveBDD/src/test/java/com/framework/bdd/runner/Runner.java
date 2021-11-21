package com.framework.bdd.runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features",
		glue="com.framework.bdd.stepDefination",
		dryRun=false,
		monochrome = true
		
		
		)

public class Runner extends AbstractTestNGCucumberTests{

}
