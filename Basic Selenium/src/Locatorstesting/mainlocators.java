package Locatorstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainlocators {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
	      WebDriver d = new ChromeDriver();
	      d.get("https://www.google.com/");    // To Open a Link...
	      
	      // To Find Elements :-
	      d.findElement(By.name("q")).sendKeys("Tirupur"+Keys.ENTER);   // To get o/p of Search...


	}

}
