package testtNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// In Suite Attribute Parallel="Methods or class" & thread-count = "2" (no of methods)...
// Selenium Grid Which is very usefull for this method...
// Assert which is  used in unit level of Testing...
// Assert to check conditions like boolean , equal or not, by some methods....

public class parallelRunProcess {

	@Test
	public void openGoogle() {
 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.google.co.in");
		driver.quit();
	}
	
	@Test
	public void openBing() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.get("http://www.bing.com");
		driver.quit();
	}
}

