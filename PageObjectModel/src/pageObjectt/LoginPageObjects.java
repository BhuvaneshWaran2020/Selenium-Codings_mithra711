package pageObjectt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
	
// UserName. Password. Submit Button
	
	
 // Instead of void.... WebElement to return the value:-
 // By Using Static Method We Don't Want To create Object for WebElement....
 // We Can use directly......	
 // For code Reusable.......
// To get WebElement We must Use Static methods only....	

//*******************************************************************************//	
	
  // By Creating WebElements.......	
	
 /*	public static WebElement userName(WebDriver b) {
		 return b.findElement(By.name("username"));
	}

	
	public static WebElement password(WebDriver b) {
		return b.findElement(By.id("password"));
	}
	
	public static WebElement button(WebDriver b) {
		return b.findElement(By.xpath("//*[@id=\'loginfrm\']/button"));
	*/

//************************************************************************************//
	
// Without declaring Methods We Can Find Elements by Using @FindBy Annotation....
// We Can Declare by Two ways..by Indepth way and simple ways.....
// @FindBy will find the web elements..........
// Null Pointer Exception will occured....because of not giving webdriver object	
// We can find by id, name, xpath....
	
	//  Using Page Factory........
	
	@FindBy(how=How.NAME , using="username")
	public static WebElement userName;
	
	@FindBy(name="password")
	public static WebElement password;
	
	@FindBy(xpath="//*[@id=\\'loginfrm\\']/button")
	public static WebElement submit;
	
	}

