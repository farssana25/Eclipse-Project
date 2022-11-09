package testCasesTestNG;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestNGScript {

	@Test
	public void firstScript() {
		System.out.println("Test Sample");
	}

//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("Before Method");
//	}
//
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("After Method");
//	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}


//	@AfterClass
//	public void afterClass() {
//		System.out.println("After Class");
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("Before Suite");
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("After Suite");
//	}
//
}
