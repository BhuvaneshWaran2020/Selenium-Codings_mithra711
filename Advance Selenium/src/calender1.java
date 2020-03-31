import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender1 {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	
	String Month="Jun 2021";
	String Date="19";
	
	driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
	
	while(true)
	{
		 String text=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
		
		 if(text.equals(Month))
		 {
			 break;
		 }
		 else
		 {
			
			 driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		 }
		 
		 
	}
	
	
	
	driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr/td[contains(text(),"+Date+")]")).click();
	
	
	
		
	} 

}
