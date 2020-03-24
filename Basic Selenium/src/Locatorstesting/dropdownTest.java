 package Locatorstesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownTest {

	public static void main(String[] args)  {
      
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
		WebDriver s = new ChromeDriver();
		
		s.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropDown1 = s.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropDown1);     // Select class is used to select the Dropdown...
		
		
	 // 1. Section done by Index Value:-
		select.selectByIndex(1);      // Select the Value by index of 0, 1, 2, 3...
		
	//	Thread.sleep(3000);          
		// This Command is Used to see the Continous Operation with little Break...
		
	//  2. Selection Done by its Value :-
		select.selectByValue("2");  // Select value by value...0, 1, 2, 3....
	
   //	Thread.sleep(3000);
	
     // 3. Selection done by Visible Text:-
		select.selectByVisibleText("Selenium");  
		// Select by Visible Part of Dropdown List.....
		
	//  4. Get the Number of Options:-
		List <WebElement> listOfOptions = select.getOptions(); 
		// list - to store several elements...<webelement> = generics to store other than web elements..
        int size = listOfOptions.size();
        System.out.println("Number of Elements is :" + size);
        
   //   5. sendKeys to select Dropdown....
        dropDown1.sendKeys("Loadrunner");  
        // Using SendKeys For Dropdown As Well Text Box..
   
   //   6. For Multiple Selections...
        WebElement multiSelect = s.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
        
     // Create object for multiselect...
        Select multiSelectBox = new Select(multiSelect);  
        
        
        multiSelectBox.selectByIndex(1);   // Commands for Selections...
        multiSelectBox.selectByIndex(2);
        multiSelectBox.selectByIndex(3);
        
        
	}

}
