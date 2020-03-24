import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class reSizeable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/resizable/");
		
		WebElement resizable=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(resizable).dragAndDropBy(resizable, 100, 100).build().perform();

	}


	}


