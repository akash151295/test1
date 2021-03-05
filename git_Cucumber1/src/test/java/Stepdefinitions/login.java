package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browserFactory.browserSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.loginPage;

public class login {
	
	WebDriver driver;
	loginPage P_login;
		
	@Before
	public void tearUp() {
		driver = browserSetup.Open_browser("Edge");
	}
	
	@After
	public void tearDown() {
		driver = browserSetup.tearDown();
	}
	
	@Given("^User is at login page and enter (.*)$")
	public void user_is_at_login_page_and_enter_URL(String URL) {
		//browserSetup.navigate_URL();
		P_login = PageFactory.initElements(driver, loginPage.class);
		P_login.navigate_URL(URL);
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_Username_and_Password(String Username, String Password) {
		
	    P_login.enter_UsernameAndPassword_login(Username, Password);
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    P_login.click_On_LoginButton();
	}

	@And("User should be able to navigates to homepage")
	public void user_should_be_able_to_navigates_to_homepage() {
	    P_login.validate_Valid_Response();
	}

	@Then("User should not be able to navigates to homepage")
	public void user_should_not_be_able_to_navigates_to_homepage() {
	    P_login.validate_Invalid_Response();
	}

}
