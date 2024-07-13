package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFac {

	static WebDriver driver=null;
	
	public static void initializeBrowser(String browserName)  {
		
		
		
		if(browserName.equals("chrome")) {
			
			 driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			
			 driver = new FirefoxDriver();
		}
		
	}
	
	public static WebDriver getDriver() {
		
		return driver;
	}
}
