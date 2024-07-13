package stepdefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverfactory.DriverFac;
import io.cucumber.java.en.*;

public class Register {
	
	WebDriver driver;

@Given("User  navigates to Register Account page")
public void user_navigates_to_register_account_page() {
	
	driver=DriverFac.getDriver();
	driver.findElement(By.xpath("//span[text()='My Account']")).click();
	driver.findElement(By.linkText("Register")).click();

    
}

@When("User enters below fields")
public void user_enters_below_fields(io.cucumber.datatable.DataTable dataTable) {
	Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
	driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstName"));
	driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastName"));
	driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email "));
	driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
	driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
	driver.findElement(By.id("Password Confirm")).sendKeys(dataMap.get("password"));
	
}
 @And("User selects privacy policy")
public void User_selects_privacy_policy() {
	 driver.findElement(By.name("agree")).click();
	
	driver.findElement(By.linkText("agree")).click();
}

@When("User clicks on Continue button")
public void user_clicks_on_continue_button() {
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
    
}

@Then("User account should get created successfully")
public void user_account_should_get_created_successfully() {
	
	Assert.assertEquals("Your Account Has Been Created!", driver.findElement(By.xpath("//div[@id='content']/h1")));
	
    
}

@When("User selects Yes for Newsletter")
public void user_selects_yes_for_newsletter() {
   driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
}

@And("User selects Privacy policy")
public void User_selects_Privacy_policy() {
	
	
	
}

@Then("User should get a proper warning about duplicate email")
public void user_should_get_a_proper_warning_about_duplicate_email() {
    Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText().contains("Warning: E-Mail Address is already registered!"));
}

@When("User dont enter any details inti fields")
public void user_dont_enter_any_details_inti_fields() {
  
}

@Then("User should get a proper warning messages for every mandatory fields")
public void user_should_get_a_proper_warning_messages_for_every_mandatory_fields() {
    Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible")).getText().contains("Warning: You must agree to the Privacy Policy!"));
    
}


}