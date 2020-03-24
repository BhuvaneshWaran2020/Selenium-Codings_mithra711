import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelectable {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
       
	  //  To Open A Link :-  
	    c.get("http://www.leafground.com/pages/autoComplete.html");
	 
	 //  Name Field  
	    WebElement name = c.findElement(By.id("tags"));
	      name.sendKeys("s");
	      Thread.sleep(4000);
	   
	 // List Class is used here to take all values     
	   List<WebElement> listOfOptions = c.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	   
	   // To check The list are interface Correctly
	   System.out.println(listOfOptions.size());
	   
	  // To find elements for condition is used 
	   for (WebElement webElement : listOfOptions) {
		   if(webElement.getText().equals("Selenium")) {
		   webElement.click();
		   System.out.println("Selecting"+webElement.getText());
		  break;
		} else {
           System.out.println("Else part"); 
	}
	   }
}
}