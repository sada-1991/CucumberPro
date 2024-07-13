package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverfactory.DriverFac;
import io.cucumber.java.en.*;

public class Search {
	
	WebDriver driver;
	
	@Given("User opens the application")
	public void User_opens_the_application() {
		
		driver=DriverFac.getDriver();
		
	} 
	
	@When("User enters valid product {string} into Search field")
	public void user_enters_valid_product_into_search_field(String string) {
	    driver.findElement(By.name("search")).sendKeys("HP");
	}
	
	@And("User clicks on Search button")
	public void User_clicks_on_Search_button() {
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default btn-lg')]")).click();
		
	    
	}
	

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
	    
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}

	

	@When("User enters invalid product {string} into search box field")
	public void user_enters_invalid_product_into_search_box_field(String invalidProduct) {
	   
		driver.findElement(By.name("search")).sendKeys(invalidProduct);
	}
	
	

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	   
		Assert.assertEquals("There is no product that matches the search criteria.", driver.findElement(By.xpath("//input[@id='button-search']/following-sibling::p")).getText());
	}

	@When("User dont enter any product name into search box field")
	public void user_dont_enter_any_product_name_into_search_box_field() {
	    
	}

	@Then("User should get a message about no product match")
	public void user_should_get_a_message_about_no_product_match() {
	   
	}


}
