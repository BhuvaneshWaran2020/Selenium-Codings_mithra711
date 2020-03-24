import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
		    WebDriver c = new ChromeDriver();
      
	// To Open A Link :- 
		    c.navigate().to("http://www.leafground.com/pages/sortable.html");
		   
	//  Find Elements for Sortable list:-	    
		    List<WebElement> elements = c.findElements(By.xpath("//*[@id=\'sortable\']/li"));
	/// Finding Index of Elements:-
		   WebElement fromElement = elements.get(6);
		    WebElement toElement = elements.get(0);
		    
		   Actions actions = new Actions(c);
		   actions.clickAndHold(fromElement);
		   actions.moveToElement(toElement);
		   actions.release(toElement);
		   actions.build().perform();
		   
		   Thread.sleep(3000);
		   
		   WebElement fromElement5 = elements.get(5);
		    WebElement toElement0 = elements.get(0);
		    
		   Actions actions1 = new Actions(c);
		   actions1.clickAndHold(fromElement5);
		   actions1.moveToElement(toElement0);
		   actions1.release(toElement0);
		   actions1.build().perform();
		   
           Thread.sleep(3000);
		   
		   WebElement fromElement4 = elements.get(4);
		    WebElement toElement1 = elements.get(0);
		    
		   Actions actions2 = new Actions(c);
		   actions1.clickAndHold(fromElement5);
		   actions1.moveToElement(toElement0);
		   actions1.release(toElement0);
		   actions1.build().perform();
		    
	}

}
