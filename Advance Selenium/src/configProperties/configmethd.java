package configProperties;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class configmethd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	// config property can be achieved by key = value pair.	
		WebDriver c = null;
		
		FileInputStream stream = new FileInputStream("same.properties");
	// Use properties class to get property & load	
		Properties properties = new Properties();
		properties.load(stream);
	// get property by giving key name	
		String browser = properties.getProperty("browser");
		String location = properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", location);
		     c = new ChromeDriver();	
		} 
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", location);
		     c = new FirefoxDriver();
			//make Web driver as global variable.
			
		}
		
		c.get("http://www.google.co.in");
	}

}
