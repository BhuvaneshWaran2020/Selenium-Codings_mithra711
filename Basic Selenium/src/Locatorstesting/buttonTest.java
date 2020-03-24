package Locatorstesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonTest {

	public static void main(String[] args) {
	    
		System.setProperty("webdriver.chrome.driver","D:\\\\Selenium Jars\\\\chromedriver.exe");
		WebDriver s = new ChromeDriver();
		
		s.get("http://www.leafground.com/pages/Button.html");
		
		// 1. Get The Position...
		WebElement getPositionButton = s.findElement(By.id("position"));
		
		Point xypoint = getPositionButton.getLocation();   // To Get Position Of Button...
	//  By Using Point class(Inbuild class) we can store location value...	
		
		int xValue = xypoint.getX(); // By hover Get method types will display...
	    int yValue = xypoint.getY();
	    System.out.println("X Value is :" +xValue + "Y Value is :" +yValue);

	    // 2. Find The Color...
	   WebElement colorButton = s.findElement(By.id("color"));
	   String color =  colorButton.getCssValue("background-color");  // by hover method type will display as string.....css value to find color & style etc...
	   System.out.println("Button Color id :" +color);
	  
	   // 3. Find The Size...
	   WebElement sizeButton = s.findElement(By.id("size"));
	   int height = sizeButton.getSize().getHeight();
	   int width = sizeButton.getSize().getWidth();
	   System.out.println("Height is :" +height + "Width is :" + width);
	   
	   
	   // 4. Go To Home Button...
	   WebElement homeButton = s.findElement(By.id("home"));
	   homeButton.click();
	   
	   
	   
			   
	}

}
