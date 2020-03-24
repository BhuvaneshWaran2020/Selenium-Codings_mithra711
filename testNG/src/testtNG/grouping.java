package testtNG;

import org.testng.annotations.Test;

// For Grouping process - groups, run, include, exclude attribute is must........
// By Using Groups , Run tags we can call the grouped test case..
// By using Include tag we can call that particular 2 groups and run...
// By using Exclude tag we can omit or except this test case all should run condition will do...

public class grouping {

	@Test (groups= {"Apple"})   // groups tag is used to give a name for that test case.
	public void Apple1() {
		System.out.println("Apple Testing");
	}
	
	@Test (groups= {"Apple"})
	public void Apple2() {
		System.out.println("Apple Testing");
	}
	
	@Test (groups= {"Moto"})
	public void Moto1() {
		System.out.println("Moto Testing");
	}
	
	@Test(groups= {"Moto"})
	public void Moto2() {
		System.out.println("Moto Testing");
	}
	
	@Test (groups= {"Vivo"})
	public void Vivo1() {
		System.out.println("Vivo Testing");
	}
	
	@Test (groups= {"Vivo"})
	public void vivo2() {
		System.out.println("Vivo Testing");
	}
	
	@Test (groups= {"Lenovo"})
	public void Lenovo1() {
		System.out.println("lenovo Testing");
	}
	
	@Test (groups= {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo Testing");
	}
}
