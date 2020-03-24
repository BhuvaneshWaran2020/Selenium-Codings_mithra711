import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
    WebDriver c = new ChromeDriver();
    
    // To Open a Link :-
    c.get("http://www.leafground.com/pages/upload.html");
    
    // To Click the UploadButton :-
   //  c.findElement(By.className("filename")).click();
       c.findElement(By.xpath("/html/body/div/div/div[3]/input")).click();
    Thread.sleep(3000);
    
    // Now Control Moves To Window :-
    
    String file = "C:\\Users\\DELL\\Downloads\\testleaf.xlsx";
    
    //String Selection class have a capacity to Transfer normal java string to plain text format 
   
    StringSelection selection = new StringSelection(file); // selection process
    
    
    // To Take the copied or cut values from clipboard Toolkit Class is used (For copy Process)
    // To paste the content to ClipBoard setcontent is used
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
    
    
    // In Web Based App Keyboard R mouse Actions are Performed by Actions Class...
    // For Windows Based Application Robot Class Is used ...
    
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_CONTROL);      // VK is a virtual Keyboard - pressing control button
    robot.keyPress(KeyEvent.VK_V);           // pressing cntrl + v Button
    robot.keyRelease(KeyEvent.VK_V);         // Releasing cntrl + v Button
    robot.keyRelease(KeyEvent.VK_CONTROL);   // Releasing cntrl Button 
    Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_ENTER);       // Pressing Enter Button
    robot.keyRelease(KeyEvent.VK_ENTER);     // Releasing Enter Button
    
    
    }

}
