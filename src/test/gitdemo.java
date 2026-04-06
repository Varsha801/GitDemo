package test;

import org.testng.annotations.Test;

public class gitdemo {
	
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

}
