package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	//Pagefactory
	@FindBy(name= "email")
	WebElement username;
	
	@FindBy(name= "password")
	WebElement password;
	
	@FindBy(xpath= "//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath= "button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath= "img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//Initializing page object
	public 	LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String validateLoginPageTitle() {
		return driver.getTitle();		
	}
	
	public HomePage login(String userName, String pword) {
		username.sendKeys(userName);
		password.sendKeys(pword);
		loginBtn.click();
		
		/*JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("argument[0].click();", loginBtn);*/
		
		return new HomePage();
	}
	

}
