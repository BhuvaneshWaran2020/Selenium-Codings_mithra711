package testtNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

// BeforeSuite - It is a Collection of TestCase....
// AfterSuite - After completing all Test cases it Executes...

public class suiteExample {
	WebDriver driver;   // By Declaring driver in class it works for whole part..
	long StartTime;    // Declare Start Time Calculated For Whole Class...
	long EndTime;     // Declare End Time Calculates for Whole Class
	
	// If we declare in single method it activates only in that particular method...
	
	@BeforeSuite
	public void launchBrowser() {
	
   	// To Calculate the Starting Time :-
	   StartTime = System.currentTimeMillis();
  
	    //  To Open A Browser :-
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		 driver = new ChromeDriver();  
	    
	}

//************************************************************************************************//	

	@Test
	public void openGoogle() {
		
		driver.get("http://www.google.co.in");
		   
	}
	
	@Test
	public void openBing() {
			
		driver.get("http://www.bing.com");
		
   	}	
	
	@Test
	public void openYahoo() {
		
		driver.get("http://www.yahoo.com");
			
	}
//*******************************************************************************************//	
	@AfterSuite
  //  Process has to be done after test case Execution:- After suite	
	public void closeBrowser() {
	// To Calculate  End & Final Time Of Process:- 
		
		 EndTime = System.currentTimeMillis();
		
		long TotalTime = StartTime-EndTime;
		System.out.println("Total Time Taken:"+TotalTime);
		driver.quit();
		
	}
	
}
