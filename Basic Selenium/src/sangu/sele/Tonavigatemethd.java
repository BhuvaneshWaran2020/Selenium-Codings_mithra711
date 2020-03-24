package sangu.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tonavigatemethd {

	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe" );
		 WebDriver d = new ChromeDriver();
		 
		 
		// Navigate Methods :-
	    // Navigate :-  In Browser ArrowSymbol ( front page, back page ) & Reload Symbols...
	    // Methods :- Back , Forward, Refresh , to , to ...
	    // d.get and d.navigate gives the same o/p. 
	    // but difference is :- in get methods it does'nt goes to back (or) forward page.   *************  
	    // In Navigate.to method it is possible.  Take Browser History for back & forward.
	      
	      d.get("https://www.javatpoint.com/java-tutorial");
	      System.out.println(d.getTitle());
	              
	       d.get("http://google.com");
	       System.out.println(d.getTitle());
	       
	       d.navigate().back();
	       System.out.println("After Back" + d.getTitle());
	       
	       d.navigate().forward();
	       System.out.println("After Forward" + d.getTitle());
	       
	       d.navigate().refresh();
	       System.out.println("At Last" + d.getTitle());
	       
	      d.navigate().to("https://www.w3schools.com");
	      
	      d.navigate().refresh();
	      System.out.println("At Last" + d.getTitle());
	      

	}

}
