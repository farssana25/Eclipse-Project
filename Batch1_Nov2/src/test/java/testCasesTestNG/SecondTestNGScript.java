package testCasesTestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SecondTestNGScript {

	@Test
	public void method2() {
		System.out.println("Method 2");
	}
	
	@BeforeClass
	public void class2() {
		System.out.println("Class 2");
	}

}
