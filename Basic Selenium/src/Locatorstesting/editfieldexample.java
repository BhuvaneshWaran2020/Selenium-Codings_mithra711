package Locatorstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editfieldexample {


	public static void main(String[] args) {
           
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
		 
	    c.get("http://www.leafground.com/pages/Edit.html");       //   To open a link. findelement = webElement(particular method returns values & store in web element.
         
	    WebElement emailBox = c.findElement(By.id("email"));   // To print EmailId.
	    emailBox.sendKeys("sangamitra71@gmail.com");
		
	 // To Add Additional text in Field. 
        WebElement appendBox = c.findElement(By.
        		xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));  
        
        appendBox.sendKeys("Mithra");
        
         // ( // indicates Relative In x-Path , whereas / indicates absolute . 
		// if i have a text box which is already filled with text. I'm giving sendKeys it append (print filled text + new text)...does'nt override....
        
        // if u want to override, first u should clear() the field and sendKeys...
    
        /*   WebElement appendBox = c.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));   // To Add Additional text in Field. 
	     appendBox.clear();
	     appendBox.sendKeys("Mithra");
	     */
	     
	     
		 WebElement getTextBox = c.findElement(By.name("username"));    //  To get the default value in field. 
		 String value = getTextBox.getAttribute("value");    // Method type will taken by hover the by.name method or else...
         System.out.println(value);

         WebElement clearBox = c.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));   // To clear the text field...
         clearBox.clear();
	
         WebElement disableBox = c.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));  // To Test the Disabled Field
         boolean enabled = disableBox.isEnabled();
	     System.out.println(enabled);
	     
	    
	}

}
