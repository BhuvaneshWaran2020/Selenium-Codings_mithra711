package Locatorstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxexg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
          
		// 1. Select any one Option :-
		  WebElement java = driver.findElement(By.
				  xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		  java.click();
		  
	  //  2. Confirm checkbox is selected :-
		  WebElement selenium = driver.findElement(By.
				  xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
          
		  boolean seleniumSelected = selenium.isSelected();
		  System.out.println(seleniumSelected);
		  
	 //  3.  Deselect Only Checked :-
		   WebElement firstElement = driver.findElement(By
				   .xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]")); 
           
		   if(firstElement.isSelected()) {
			   firstElement.click();
		   }
		   
		   WebElement secondElement = driver.findElement(By
				   .xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		   
		   if(secondElement.isSelected()) {
			   secondElement.click();
		   }
		   
    // 4.  Select All box :-
		   WebElement firstOption = driver.findElement(By.
				   xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]"));
		   firstOption.click();
		   
		   WebElement secOption = driver.findElement(By.
				   xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]"));
		   secOption.click();
		   
		   }

		  
	}

