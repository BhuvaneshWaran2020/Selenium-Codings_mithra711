package testtNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

// Passing Parameter from XML file to Test Case Methods...
// User inputs given By testNG XML File...
// Used for ALM Process...
// Parameter value should same of XML Parameter = Name Value....

public class paraMeterization {
    
	@Test
	@Parameters("Name")       // Annotation Which is used to pass Parameter from XML file to here...
	public void printName(String name) {
		System.out.println("Name Is"+ name);
	}
	
}
