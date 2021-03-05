package pageFactory;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement txt_Username_login;

	@FindBy(xpath="//input[@id='password']")
	WebElement txt_Password_login;

	@FindBy(xpath="//button[@id='login']")
	WebElement btn_Login_login;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enter_UsernameAndPassword_login(String Username, String Password) {
		txt_Username_login.sendKeys(Username);
		txt_Password_login.sendKeys(Password);		
	}

	public void click_On_LoginButton() {
		btn_Login_login.click();
	}

	public void validate_Valid_Response() {
		String Expected = "TestProject Demo";
		System.out.println("Actual"+driver.getTitle());
		assertEquals(Expected,driver.getTitle());
	}

	public void validate_Invalid_Response() {
		String Actual = driver.findElement(By.xpath("//div[text()='Password is invalid']")).getText();
		String Expected = "Password is invalid";
		System.out.println("Actual"+driver.getTitle());
		assertEquals(Expected, Actual);
	}

	public void navigate_URL(String URL) {
	    driver.navigate().to(URL);
	}
	
}

