package Dynamic_Tables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesss {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D://Selenium Jars//Chromedriver.exe");
		WebDriver b = new ChromeDriver();
		
		// To Open a link
		b.navigate().to("http://www.leafground.com/pages/table.html");
		
		// To Take Column count
	    List<WebElement> Columns = b.findElements(By.tagName("th"));	
	    int columnCount = Columns.size();
	    System.out.println("No of Columns: " +columnCount);
	     
	    // To Take Row Count
	    List<WebElement> Rows = b.findElements(By.tagName("tr"));
	    int rowCount = Rows.size();
	    System.out.println("No of Rows: " +rowCount);
	     
	    // To Take cell Value Nearby particular Column
	    WebElement cellValue = b.findElement
	    		(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
	     String Percent = cellValue.getText();
	     System.out.println("Value Present near elements is : " +Percent);
	     
	    // To select any percent and click
	     
	     List<WebElement> Select = b.findElements(By.xpath("//td[2]"));
	 
	     WebElement Click = b.findElement(By.xpath("//td[normalize-space()='80%']//following::td"));
	     Click.click();
	     
	   /*  List<Integer> PercentageList = new ArrayList<Integer>();
	     
	     for (WebElement webElement : Select) {
	    	 String individualValue = webElement.getText().replace("%", "");
	    	 PercentageList.add(Integer.parseInt(individualValue));
	    	 		
		}

	     System.out.println("finalList is :"+PercentageList);
	}
*/	    
	}	    
}
