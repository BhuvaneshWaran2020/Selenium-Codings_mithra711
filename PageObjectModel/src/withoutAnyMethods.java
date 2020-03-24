import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class withoutAnyMethods {
	
 // Without using findElelments , @FindBy methods... LOCATORS values are called directly
	
	public static WebElement txtUsername;
	public static WebElement txtPassword;
	public static WebElement btnLogin;
	
	
// By identifying id or name of webelement & declaring pageFactory ... we can give
// -sendkey and more methods.......instead of name & id it is not possible...	 
	
	@Test
	public void newMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		WebDriver b = new ChromeDriver();
		b.get("https://opensource-demo.orangehrmlive.com/");

		
		PageFactory.initElements(b, withoutAnyMethods.class);
		
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin");
		btnLogin.click();
	
	
	}

}
