package test;

import org.testng.annotations.*;

public class day2 {
	
	@BeforeTest
	public void Beforetest() {
		System.out.println("Executes before all methods in test folder");
	}
	
	
	@Test(groups= {"Smoke"})
	public void HomeLoanLogin() {
		System.out.println("HomeLogin");
		System.out.println("develop code");
		System.out.println("develop code");
	}
	
	@AfterTest
	public void Aftertest() {
		System.out.println("Executes after all methods in test folder");
	}
}
