import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
	    
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
       
	  //  To Open A Link :-  
	    c.get("http://www.leafground.com/pages/drop.html");
       
	  // Finding Elements For Drag & Drop :-
	    WebElement From = c.findElement(By.id("draggable"));
	    WebElement To = c.findElement(By.id("droppable"));
	    
	 // For Mouse Related Activities   Actions Class Is Used (like select  class ):-
	    Actions actions = new Actions(c);
	 
	//  There are Two Ways to Drag And Drop. They Are :-   
	// 1.   actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
	    actions.dragAndDrop(From, To).build().perform();
	    
	  
	    
	}

}
