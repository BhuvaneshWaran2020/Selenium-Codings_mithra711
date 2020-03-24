import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Difference b/n get & Navigate.
// Without Clicking a link where the page is going on..
// Stale Element Reference Exception...
// Find Total Number Of links Present in this Page....

public class hyperLink {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
       
	  //  To Open A Link :-  
	  // In get() Method we cannot do Forward, Backward, refresh Options...
	  // But in Navigate().to It is Possible.....  
	    c.navigate().to("http://www.leafground.com/pages/Link.html");

	    
	 // 1. To Open A First Link :-
	    WebElement homePage = c.findElement(By.linkText("Go to Home Page"));
	    homePage.click();
     
	// To move Backward for home page:-
	    c.navigate().back();
	    
//********************************************************************************************//    
	    
	// 2. Find Where to go without clicking me:-
	// Without clicking the link we have to find the page....
	// Attribute Method is used to how many attribute present in current page...    
	    
	    WebElement whereToGo = c.findElement(By.partialLinkText("Find where am"));
	    String link =  whereToGo.getAttribute("href");    // String denotes Last Method Type.
        System.out.println("This Link Goes To:" + link);
        
//**********************************************************************************************//
    
   // 3. Verify I'm Broken :-
        WebElement Broken = c.findElement(By.linkText("Verify am I broken?"));
        Broken.click();
        String title = c.getTitle();   // String denotes Last Method Type.
        
        if(title.contains("404")) {    // To Get Title Of The Page contains() Method is used.
        	System.out.println("Link Is Broken");
        }
        else {
        	System.out.println("Link Is Opened");
        }
        c.navigate().back();
        
//**********************************************************************************************//
        
   // 4. Go to Home Page Interact with same Page:-
   // Stale Element Reference Exception :- is Occurred Because we just click the home page - 
   // - without finding the element again it cause this type of exception. 
   // if the page redirect to other page...may also cause this type of exceptions.
   // We Need To find elements again...
        WebElement homePage1 = c.findElement(By.linkText("Go to Home Page")); 
        homePage1.click();
        
     // To Back for Hyperlink Page :- 
        c.navigate().back();
        
 //********************************************************************************************//
        
    // 5. How Many links Present In Page :-
      // to Identify Multiple Elements we can use ""findElements""
      // Links all present in anchor Tag Only...<a>...
      // More Than One Elements are stored in List....
      // By using TagName we can find links,images counts...  
        
         List <WebElement> totalLinks =  c.findElements(By.tagName("a"));  
         int size =  totalLinks.size();
         System.out.println("The Total Links Present In This Page Is :" +size);
                 
	}

}