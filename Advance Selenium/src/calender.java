import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
	    WebDriver c = new ChromeDriver();
	    
	 // To Open A New Link :-   
	    c.navigate().to("http://www.leafground.com/pages/Calendar.html");
	    
	//  To Type in Calendar Field:-
	     WebElement calendar = c.findElement(By.id("datepicker"));
	     calendar.click();
	 //    calendar.sendKeys("02/10/2020"+ Keys.ENTER);
	  
//********************************************************************************************//
	     
    // To Click Next Button :-
   //  Here the Xpath is written by our own Identity...in <a> tag with title next...
  //   Compare with copying it is more Convinient to understand...
	     
	     WebElement nextButton = c.findElement(By.xpath("//a[@title='Next']"));
	     nextButton.click();
	     
	// To Click Date 10 of Next Month:-
	    
	     WebElement dateToBeGiven = c.findElement(By.xpath("//a[contains(text(),'10')]"));
	     dateToBeGiven.click();
	     
	}

}
