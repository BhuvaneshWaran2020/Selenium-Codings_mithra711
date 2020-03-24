package sangu.sele;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaSeli {

	public static void main(String[] args) {
	
		      System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe" );
		   // selenium webdriver - implementing classes
				// Key - Unique (webdriver.chrome.driver), Value - duplicate (location)
		      
      WebDriver d = new ChromeDriver();
    //Dynamic Binding - To Create New Object For Class refer webdriver
      // webdriver - interface which represents chrome action (webdriver methods).
      //d = object used for chrome
      
      // important methods - close, findelement, findelements,get, getcurrent url, getpagesource,
      // gettittle, getwindowhandle, getwindowhandles, manage, navigate, quit, switchto . 
      // Explain Methods either - Abstract, Static, return data, arguments, Class, usage.
      
      d.get("https://www.javatpoint.com/java-tutorial");  // abstract method - type url - enter.  Search Engine.
      // Object(d) Above Object(url) is placed.
      
      //Common  Methods :-
      String url = d.getCurrentUrl();
      String pageSource = d.getPageSource();  // Locators - id, X-Path etc.
      String pageTitle = d.getTitle();  // Title present in Browser.
      String windowHandle = d.getWindowHandle();  // Unique Alphanumeric ID - ""Current Tabs Id in Browser""
      Set window = d.getWindowHandles();    //      Unique Alphanumeric ID - "all Tabs in Browser" as Strings.  (Set - used to store unique object)
      d.close();  //   To Close the browser.. 
   //   d.quit();    to close the browser.
        
      
      System.out.println("URL is" + url);
      System.out.println("PageTitle is" + pageTitle);
      System.out.println("WindowHandle is " + windowHandle);
      System.out.println("windowHandles is " + window);
      
      
	
	}

}
