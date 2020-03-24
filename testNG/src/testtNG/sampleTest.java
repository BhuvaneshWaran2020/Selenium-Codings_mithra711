package testtNG;

// TestNG used for unit Testing, Functional, integration, end to end ...
// TestNG is a Framework It has Multiple Build in's  present...
// The OUTSTANDING FEATURES ARE DETAILED INDEX REPORT & EMAILABLE REPORT...
// @Test Which is used to change every method as TestCases...
// TestNG is used to  Run multiple classes of package at same time....
// In XML file verbose attribute is used to listOut the timings of every Methods in each class of Package...

import org.testng.annotations.Test;

public class sampleTest {
  @Test                        
  public void firstCase() {
	  System.out.println("hai");
  }
  @Test
  public void secondCase() {
	  
	  System.out.println("This Is my 2nd TestCase");
  }
  @Test
  public void thirdTestcase() {
	  System.out.println("this is 3rd case");
  }
}
