package loginTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class usingDatadriven {
	
	String[][] data = null; // used to store excel value.
	WebDriver b;  // Web driver Common Declaration to all methods...
	
	
	@DataProvider(name="loginData")         // Used to Get Collection of Data  
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws IOException, BiffException {
		
	// FileStream Class is used to read file location:-	
		FileInputStream excel = new FileInputStream("D:\\AceMoney\\MithraXL\\login.xls");

	// Workbook to get excel sheet here...	
		Workbook workbook = Workbook.getWorkbook(excel);

	// To get Sheet Value and to count rows and columns:-	
		Sheet sheet = workbook.getSheet(0);
	
	// To get no of row & column	
		int Rowcount = sheet.getRows();
		int columnCount = sheet.getColumns();
		
		String testData[][] = new String [Rowcount-1][columnCount];  
		//to give location which we giving to take values
		

		for(int i=1;i<Rowcount;i++) {
			for(int j=0;j<columnCount;j++) {
				testData[i-1][j] = sheet.getCell(j,i).getContents();
			}
		}
		
		return testData;
		
		
	}
 
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chromedriver.exe");
		 b = new ChromeDriver();
		
	// To Open a Link:-	
		b.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	
	// After perform all input it quit finally...
	 @AfterTest
		public void afterTest() {
			b.quit();
		}
	
	 
	@Test(dataProvider = "loginData")      // By Giving Data provider Name to Test declares here...
	public void loginTestCase (String uname, String pwrd) {
		
		
	// Find Elements for UserName:-	
		WebElement username = b.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		
	// Find Elements for Password:-	
		WebElement password =  b.findElement(By.id("txtPassword"));
		password.sendKeys(pwrd);
		
	// Find Elements for Login Button:-	
		b.findElement(By.id("btnLogin")).click();
		
		
		}
}
