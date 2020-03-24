package Locatorstesting;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		// 1. Simple Alert Box :-
		WebElement alertBox = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));

		alertBox.click();  // To Click the Alertbox
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();  //  Driver controls switched to alert...
		alert.accept();
        
		// 2. Confirm Box :-
	   WebElement confirmButton = driver.findElement(By.
			   xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
	   
	   confirmButton.click();
	   
	   Thread.sleep(3000);
	   
	   Alert confirmAlert = driver.switchTo().alert();
	   confirmAlert.dismiss();
	   
	   // 3. Prompt Box :-
	   WebElement promptBox = driver.findElement(By.
			   xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
	   
	   promptBox.click();
	   
	   Thread.sleep(3000);
	   
	   Alert promptAlert = driver.switchTo().alert();
	   promptAlert.sendKeys("Mithra");
	    
	   promptAlert.accept();
	   
	   
	}

}
