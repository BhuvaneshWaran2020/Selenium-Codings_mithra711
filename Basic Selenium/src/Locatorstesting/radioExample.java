 package Locatorstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement unchecked = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
        
		WebElement checked = driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		
		
	    boolean	status1 = unchecked.isSelected();  // To check the radio button is selected or not.
		boolean status2 = checked.isSelected();
		
		System.out.println(status1);     // By printing the status of selected button we can check the condition.
		System.out.println(status2);
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
	}

}
