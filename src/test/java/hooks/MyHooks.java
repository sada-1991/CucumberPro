package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import driverfactory.DriverFac;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		DriverFac.initializeBrowser("Chrome");
		driver=DriverFac.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		
	}
}
