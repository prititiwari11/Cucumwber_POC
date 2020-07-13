package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/Study_Docs/cucumber/src/main/java/com/qa/features/freeCrm.feature",
                 glue = {"com/qa/stepdefinition"},
		/*
		 * format={"pretty", "html:test-output",
		 * "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		 */
		monochrome = true,
		dryRun = false

)
public class TestRunner {

}
