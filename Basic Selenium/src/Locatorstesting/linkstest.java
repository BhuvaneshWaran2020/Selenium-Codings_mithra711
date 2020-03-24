package Locatorstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkstest {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
		 WebDriver b = new ChromeDriver();
		 b.get("http://www.leafground.com/pages/Link.html");
		 
	//	 To Test Links :-
		 
	//   1. By giving LinkText
	//	 b.findElement(By.linkText("Go to Home Page")).click();
		 
	//   2. By Giving Partial Linktext :-
		 b.findElement(By.partialLinkText("Home Page")).click();
		 
	// 	 If the Same Name of link will identify first link and perform.

	}

}
