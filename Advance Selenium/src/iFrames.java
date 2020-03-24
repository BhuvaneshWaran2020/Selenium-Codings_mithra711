

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
       
	  //  To Open A Link :-  
	    c.get("http://www.leafground.com/pages/frame.html");
	    
	 //  To Choose Iframe :-
	    c.switchTo().frame(0);
	       
	 // 1. First Frame :-
	   WebElement clickButton1 = c.findElement(By.id("Click"));
	   clickButton1.click();
	 
	//  To Get Text inside the button after Click:- getText() method is used.
	//  to get Attribute getAttribute method is Used. 
	   String Text =c.findElement(By.id("click")).getText();
	   System.out.println(Text);
       Thread.sleep(3000);	
	   
	//  2.Second Frame :-
	   
	// Move to Main content From Frame :-   
	   c.switchTo().defaultContent();
   //  For Selection Of Second Iframe:-	  
	   c.switchTo().frame(1);
   //  Inside A Frame 1 Again one Frame is there we Have to Switch to that Frame
	   c.switchTo().frame("frame2");
   //   To Click Button 1 :-
	   WebElement clickButton2 = c.findElement(By.id("Click1"));
	   clickButton2.click();
	   Thread.sleep(3000);
	   
	   
	// 3. Find Total NUmber Of Frames :-
	   
	// Move to Main content From Frame :-   
	   c.switchTo().defaultContent();   
	 
	//  findelements is used to find total no of tagename present in html page   
	   List<WebElement> NoOfFrames= c.findElements(By.tagName("iframe"));
	   int size = NoOfFrames.size();
	   System.out.println("No Of Frames :" +size);
	}

}
