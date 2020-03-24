import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
// Using PageFactory.....by using @FindBy annotation with detailed description or
// - by single word locators...
// Using initElements Methods....... 

import pageObjectt.LoginPageObjects;
import pageObjectt.UpdatePageObjects;

// To Wg ithStand our coding with Small Modification POM is used.
// For Changes of UI Application which is not constant...
// Extract Find elements from testCases To Outside...

public class pomTestCase {

	@Test
	// For Login :- 1
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver b = new ChromeDriver();

//*******************************************************************************//
		
	// Create New Object To interact with loginPage:-
	// using static method we don't want to create object..it access directly...	
	
   //	LoginPageObjects objects = new LoginPageObjects();
	
		// Login Page Using Page Objects....... 
		
	/*	LoginPageObjects.userName(b).sendKeys("user@phptravel.com");
		LoginPageObjects.password(b).sendKeys("demouser");
		LoginPageObjects.button(b).click();
		
		*/
		
//*****************************************************************************//		
		
		
	// For Update Part....using......page Objects......
/*	   UpdatePageObjects.myProfile(b).click();
	   UpdatePageObjects.updateNumber(b).sendKeys("9876543210");
	   UpdatePageObjects.updateCity(b).sendKeys("chennai");
	   UpdatePageObjects.submit(b).click();
	   
	  */ 
//************************************************************************************//		
	//  Normal Coding for Login New Page:-
		
/*		b.get("https://www.phptravels.net/login");
		Thread.sleep(3000);
		
	// WebElement for user Id:-	
		WebElement email = b.findElement(By.name("username"));
		email.sendKeys("user@phptravels.com");
		
	// WebElement for Password:-
		WebElement paswd = b.findElement(By.id("password"));
		paswd.sendKeys("demouser");
		
	// For Login Button :-
		WebElement login = b.findElement(By.xpath("//*[@id=\'loginfrm\']/button"));
		login.click();
	*/	
		
   		
//**********************************************************************************//	
		
	
		 // To Click another Option & Update The Details:-
		 // Normal Methods................ 
		  
	/*	WebElement myProfile = b.findElement(
				By.xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a"));
		myProfile.click();
		
		WebElement Number = b.findElement(By.name("phone"));
		Number.sendKeys("12345555765");
		
		WebElement city = b.findElement(By.name("city"));
		city.sendKeys("Chennai");
		
		WebElement Submit = b.findElement(
				By.xpath("//*[@id='profilefrm']/div/div[3]/div[3]/button"));
		Submit.click();
		
		*/ 
		//devikapawar@indusvcs.com
	   
//************************************************************************************//
	   
// Login Page Using Page Factory......
//	instead of UpdatePageObjects.myProfile(b).click(); b calling.
//we can write simple line. By Passing single time of Webdriver object we can achieve it.
		
// Null Pointer Exception will occurred....because of not giving Page FActory elements....

// By webdriver obj only WebElements identifies the element.....		
// By Using initElement method........
		
	   PageFactory.initElements(b, LoginPageObjects.class);
		
	   LoginPageObjects.userName.sendKeys("user@phptravel.com");
	   LoginPageObjects.password.sendKeys("demouser");
	   LoginPageObjects.submit.click();
	   
	   
//****************************************************************************************//
	   
	//  Update Profile use Page Factory..
	// InitElements is a static method...   
	   
	   PageFactory.initElements(b, UpdatePageObjects.class);
	
	   UpdatePageObjects.myProfile.click();
	   UpdatePageObjects.updateNumber.sendKeys("9876543210");
	   UpdatePageObjects.updateCity.sendKeys("chennai");
	   UpdatePageObjects.Submit.click();
	   
		
	}
}
