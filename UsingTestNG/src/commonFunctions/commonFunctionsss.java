package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class commonFunctionsss {

	// Declare properties as global variables.
	public static WebDriver driver = null;
	public static Properties property= null;
	
	
	// To Load values from Config Properties
	// change void as Properties to return values.
	public Properties loadPropertyFile() throws IOException {
		
		FileInputStream input = new FileInputStream("config.properties");
	    property = new Properties();
		property.load(input);
		
		return property;
	}
	
	// To launch Browser
	@BeforeSuite
	public void launchBrowser() throws IOException {
		// Calling Loadfile to load
		loadPropertyFile();
		
		String browser = property.getProperty("browser");
		String url = property.getProperty("Url");
		String location = property.getProperty("driverLocation");

	   if(browser.equalsIgnoreCase("chrome")) {
		   System.setProperty("webdriver.chrome.driver", "D://Selenium Jars//chromedriver.exe");
		   driver = new ChromeDriver();
	   }
	   else if(browser.equalsIgnoreCase("firefox")){
		   System.setProperty("Webdriver.gecko.driver", "D://Selenium Jars//geckodriver.exe");
		   driver = new FirefoxDriver();
	   }
	      
	   // Maximize the window
	     driver.manage().window().maximize();
	     driver.get("Url");
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	// To quit Browser
	@AfterSuite
	public void teardown() {
		
	}
	
	
}
