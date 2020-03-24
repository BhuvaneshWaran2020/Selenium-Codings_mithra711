import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolTip {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
       
	  //  To Open A Link :-  
	    c.get("http://www.leafground.com/pages/tooltip.html");
	
	 // Find The Element :-   
		WebElement Name = c.findElement(By.id("age"));
		
	// Find The Attribute Values: Max Title is the Attribute for Tool tip) 
	// Get Attribute VAlue And Store In String Values.
	String toolTip = 	Name.getAttribute("Title");
		System.out.println("ToolTip Text is :" + toolTip);
		
		
		
		
		// 

	}

}
