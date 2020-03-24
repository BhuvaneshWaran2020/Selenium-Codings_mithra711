package loginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Data Provider Which is  used to reduce the code line...and reusable...
// @Parameter also fails....because we have to write n num of lines for executions....

public class loginTestCase {
	
  String [][] data = {
		  {"Admin","admin123"},     // BothCorrect
		  {"Admin1","admin"},      // Both Incorrect
		  {"Adminn","admin123"},   // Wrong UserName
		  {"Admin","admin1234"}    // Wrong Password
             };
		  
	
	@DataProvider(name="loginData")         // Used to Get Collection of Data  
	public String[][] loginDataProvider() {
		return data;
	}
	
	@Test(dataProvider = "loginData")      // By Giving Dataprovider Name to Test declares here...
	public void loginTestCase (String uname, String pwrd) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		
	// To Open a Link:-	
		b.get("https://opensource-demo.orangehrmlive.com/");
		
	// Find Elements for   UserName:-	
		WebElement username = b.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		
	// Find Elements for Password:-	
		WebElement password =  b.findElement(By.id("txtPassword"));
		password.sendKeys(pwrd);
		
	// Find Elements for Login Button:-	
		b.findElement(By.id("btnLogin")).click();
		b.quit();
		
	}
	
}
