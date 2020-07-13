package com.qa.stepdefinition;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageSteps extends TestBase {
	LoginPage login;
	HomePage homePage;

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		login = new LoginPage();
		String title=login.validateLoginPageTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^user enters username and password and click on login button")
	public void user_enters_username_and_password() throws Throwable {
      homePage =  login.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
       String title=homePage.verifyHomepageTitle();
       Assert.assertEquals("Cogmento CRM", title);
	}

	/*@Then("^validate home page title$")
	public void validate_home_page_title() throws Throwable {

	}*/
}
