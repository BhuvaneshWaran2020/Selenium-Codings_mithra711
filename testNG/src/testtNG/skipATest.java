package testtNG;

// To Skip a Test Case Use enabled KeyWord which is a Boolean type Keyword...
// -to skip give False as Value.....

import org.testng.annotations.Test;

public class skipATest {
  
  @Test(priority=0)
  public void startACar() {
	  System.out.println("Start the Car");
  }
  
  @Test(priority=1)
  public void putFirstGear() {
	  System.out.println("Put First Gear");
  }
  
  @Test(priority=5,enabled=false)
  public void startMusic() {
	  System.out.println("Start the Music");
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