
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class intractWithImages {

	public static void main(String[] args) {
    
			System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
		    WebDriver c = new ChromeDriver();
		    
    // To Open a Link :-
		    c.navigate().to("http://www.leafground.com/pages/Image.html");
		    
	
    // 1. To Click the Image to Open a Link		    
    	 WebElement image = c.findElement(
    			 By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
         image.click();
         c.navigate().back();
//	*****************************************************************************************//	    
  
   //  2. Is Broken Image :-
    	 WebElement BrokenImage = c.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
    	    
   //  naturalWidth = 0 is a css property to check the image is broken or clear...
   // To check the condition ifelse statement is used here...
    	    
    	    if(BrokenImage.getAttribute("naturalWidth").equals("0")) {
    	    	System.out.println("This Image is Broken");
    	    }
    	    else {
    	    	System.out.println("This Image is Not Brroken");
    	    }
    	    
	}

}
