package sangu.sele;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setcookies {

	public static void main(String[] args) {
		
   	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
      WebDriver d = new ChromeDriver();
      d.get("https://payilagam.com");
      Set<Cookie> cookies = d.manage().getCookies();  // Manage Method - To Get Browser Specific options..
        
        for (Cookie cookie : cookies) {
        	System.out.println(cookie);
        }
        
        // To Delete All Cookies :-
        d.manage().deleteAllCookies();
        		
	}

}
