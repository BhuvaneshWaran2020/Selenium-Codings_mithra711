import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadFiles {

		public static void main(String[] args) throws InterruptedException{
			
	System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
    WebDriver c = new ChromeDriver();
    // Selenium Always interacts with Web Application Only.

    //  To Open A Link :-  
    c.get("http://www.leafground.com/pages/download.html");
	
   // For A  link take linkText as Element:- 
    WebElement Firstfile = c.findElement(By.linkText("Download Excel"));
    Firstfile.click();
    Thread.sleep(3000);
    
  // Now We Want to take the Location Of File By Using File Class
    File fileLocation = new File("C:\\Users\\DELL\\Downloads");
 //  Last Method type will store the files
    File[] totalFiles = fileLocation.listFiles();
    
    for (File file : totalFiles) {
		if(file.getName().equals("testleaf.xlsx")) {
			System.out.println("File Is Downloaded");
			break;
		}
	}
                                
	   	   

	}

}
