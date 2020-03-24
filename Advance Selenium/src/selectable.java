import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
       
	  //  To Open A Link :-  
	    c.get("http://www.leafground.com/pages/selectable.html");
	  
	    
	  //   To Select First 3 Options Of List :-  
	 //  To Select Whole List we use X path And Also U should Add list class for taking whole list:-    
	 List <WebElement> selectable = c.findElements(By.xpath("//*[@id=\'selectable\']/li"));
	 
	 // To Check How Many List are Present In file:-
	   int size = selectable.size();
	   System.out.println(size);  
	   
	// To Control Mouse Or Keyboard Actions Class Is Used :-  2 Ways To Acheive   
	   
	 /* 1. Actions actions = new Actions(c);
	       actions.keyDown(Keys.CONTROL).click(selectable.get(0))
	                                    .click(selectable.get(1))
	                                    .click(selectable.get(2)).build().perform();    */
	   
	//  2. Way is using clickAndHold Method:-
	// If we use only click() method instead of clickAndHold it will select single values
	 //  and deselect immediately.
	   
	   Actions actions = new Actions(c);
	   actions.clickAndHold(selectable.get(0));
	   actions.clickAndHold(selectable.get(1));
	   actions.clickAndHold(selectable.get(2));
	   actions.build().perform();
	}

}
