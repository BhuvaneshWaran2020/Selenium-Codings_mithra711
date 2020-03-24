package pageObjectt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// How to find WebElement without using findElements....
// Using @FindBy.....

public class UpdatePageObjects {
	
/*	public static WebElement myProfile(WebDriver b) {
		 return b.findElement(
				By.xpath("//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a"));
	}
	
	public static WebElement updateNumber(WebDriver b) {
		return b.findElement(By.name("phone"));
	}
	
	

	public static WebElement updateCity(WebDriver b) {
		 return b.findElement(
					By.xpath("//*[@id='profilefrm']/div/div[3]/div[3]/button"));
		
	}  
	
	public static WebElement submit(WebDriver b) {
		return b.findElement(
				By.xpath("//*[@id='profilefrm']/div/div[3]/div[3]/button"));
	
	}  */
//***********************************************************************************//			
	
  // Without declaring Methods We Can Find Elements by Using @FindBy Annotation....
 // We Can Declare by Two ways..by Indepth way and simple ways.....
// @FindBy will find the web elements..........	
// initelements is a static methood so we using....
	
	// Using Page Factory...
	
	@FindBy(xpath = "//*[@id='body-section']/div[2]/div[2]/div/div[1]/ul/li[2]/a")
	public static WebElement myProfile;
	
	@FindBy(name="phone")
	public static WebElement updateNumber;
	
	@FindBy(xpath = "//*[@id='profilefrm']/div/div[3]/div[3]/button" )
	public static WebElement updateCity;
	
	@FindBy(xpath = "//*[@id='profilefrm']/div/div[3]/div[3]/button" )
	public static WebElement Submit;
	
	
	
}
