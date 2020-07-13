package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	//Initializing page object
		public 	HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomepageTitle() {
			return driver.getTitle();
		}

}
