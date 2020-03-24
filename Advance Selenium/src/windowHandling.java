import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
       
	  //  To Open A Link :-  
	    c.get("http://www.leafground.com/pages/Window.html");
	    
	  // To Identify A old Window Id & Store :-
	   String oldWindow = c.getWindowHandle();

	   
  // 1. Open New Home Page :-
	    WebElement firstButton = c.findElement(By.id("home"));
	    firstButton.click();
	   
	 //  To identify n No of Window will be open further and store id in handles.
	    Set<String> handles = c.getWindowHandles();
	 //  In Handle Old window + New window are control here.   
	    
	 // For loop used to  Moves control From Old Window To New Window,  to read all windows :-   
	    for (String newWindow : handles) {
			c.switchTo().window(newWindow);
		}
	   
	    
  // 2. Find No Of Opened Windows :-
	   WebElement editBox = c.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a")) ;
	   editBox.click();
	   
	   // To Close Current Opened Page :-
	   c.close();
	   Thread.sleep(3000);
	   
	// Switch Control From New Window To Old Window (Default Window) :-
	   c.switchTo().window(oldWindow);  // .defaultcontent() method also used here.( come to old window)
	
	   
  // 3. Open Multiple Window & find No of Opened Windows :-
	   WebElement openMultiple = c.findElement(
			   By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
	   openMultiple.click();
	   
   // To Fine How Many No Of Windows Opened :-
	   int noOfWindows = c.getWindowHandles().size();	   
	   System.out.println("Number Of Windows Opened :" + noOfWindows);
	   Thread.sleep(3000);
	   
   // 4. Close all Window Except Parent :-
	   WebElement dontCloseMe = c.findElement(By.xpath("//*[@id=\'color\']"));
	   dontCloseMe.click();
	   Thread.sleep(3000);
	   
	   Set<String> newWindlowHandles = c.getWindowHandles();
	   
	//  If Not Parent Window Than Close It Condition Executed Here.
	   
	   for (String allwindows : newWindlowHandles) {
		    if(!allwindows.equals(oldWindow)) {
		    	c.switchTo().window(allwindows);
		    	c.close();
		    }
	}
	// To Close All Windows Performed :-   
	  c.quit();     

	}

}
