package testtNG;

// Based on Situation We Have to Give Priority value & dependency Condition...
// if the first condition fails it does'nt execute next process...
// Here we using Depends on methods Method....

import org.testng.annotations.Test;

public class dependancyManage {

	@Test(enabled=true)
	public void highSchool() {
		System.out.println("10-STD Passed");
	}
	
	@Test(dependsOnMethods="highSchool")
	public void secondarySchool() {
		System.out.println("12-STD Passed");
	}
	
	@Test(dependsOnMethods="secondarySchool")
	public void engineering() {
		System.out.println("Engineering Joined");
	}
}
