package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverfactory.DriverFac;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login {
	WebDriver driver;
	
	
	@Given("User  navigates to login page")
	public void user_navigates_to_login_page() {
		driver=DriverFac.getDriver();
	    driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
	}
	@When("User has enterd Valid email address {string} into the email field")
	public void user_has_enterd_valid_email_address_into_the_email_field(String emailText) {
	    driver.findElement(By.id("input-email")).sendKeys(emailText);
		
	}

	@And("User has enter valid passworg {string} into password field")
	public void user_has_enter_valid_passworg_into_password_field(String passwordText) {
	    driver.findElement(By.id("input-password")).sendKeys(passwordText);
		
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	    Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	}

	@When("User enters invalid email address {string}into email field")
	public void user_enters_invalid_email_address_sadashiva123_gmail_com_into_email_field(String invalidemail) {
	   driver.findElement(By.id("input-email")).sendKeys(invalidemail);
		
	}

	@When("User enters invalid password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidpassword) {
	   
		driver.findElement(By.id("input-password")).sendKeys(invalidpassword);
	}

	@Then("User should get a proper warning message about credentials mismatch")
	public void user_should_get_a_proper_warning_message_about_credentials_mismatch() {
	   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText().contains("Warning: No match for E-Mail Address and/or Password."));
		
	}

	@When("User dont enter any email address  into the email field")
	public void user_dont_enter_any_email_address_into_the_email_field() {
	   
		driver.findElement(By.id("input-email")).sendKeys(" ");
	}

	@When("User dont enter password into password field")
	public void user_dont_enter_password_into_password_field() {
	   
		driver.findElement(By.id("input-password")).sendKeys(" ");
	}
}
