package testtNG;

import org.testng.annotations.Test;

// Order Of Execution Controlled By Priority Value...
// By Giving Priority Value we Can run the test case By our wish..order.....

public class priorityExample {
  @Test(priority=0)
  public void startACar() {
	  System.out.println("Start the Car");
  }
  
  @Test(priority=1)	
  public void putFirstGear() {
	  System.out.println("Put First Gear");
  }
  
  @Test(priority=2)
  public void putSecondGear() {
	  System.out.println("Put Second Gear");
  }
  
  @Test(priority=3)
  public void putThirdGear() {
	  System.out.println("Put Third Gear");
  }
  
  @Test(priority=4)
  public void putFourthGear() {
	  System.out.println("Fourth Gear");
  }
}
