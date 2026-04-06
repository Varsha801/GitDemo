package test;

import org.testng.annotations.*;

public class day1 {

	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Executes before all methods in suite");
		System.out.println("Executes before all methods in suite");
	}
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Executes before all methods in class");
		System.out.println("develop code");
		System.out.println("develop code");
	}
	
	@Test(groups= {"Smoke"})
	
	public void Demo() {
		System.out.println("Hello");
	}
	
	@Test(enabled =false)
	public void test1() {
		System.out.println("test1");
	}
	
	@Test//(dependsOnMethods = {"test1","Demo"})
	public void Atest2() {
		System.out.println("test2");
	}
	
	@AfterClass
	public void Afterclass() {
		System.out.println("Executes After all methods in class");
	}
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("Executes after all methods in suite");
	}
}
