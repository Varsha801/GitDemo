package test;

import org.testng.Assert;
import org.testng.annotations.*;

public class day3 {
	
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("Executes before every methods in class");
	}
	
	
	@Test(timeOut = 4000)
	public void WebLogin() {
		System.out.println("weblogin");
		Assert.assertTrue(false);
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileDashboard(String url) {
		System.out.println("Mobile Dashboard");
		System.out.println(url);
	}
	@Test
	public void MobileSigout() {
		System.out.println("Mobile signout");
	}
	@Test(dataProvider = "getData")
	public void MobileLogin(String user , String password) {
		System.out.println("Mobilelogin");
		System.out.println(user +"\n"+ password);
	}
	
	@Test
	public void APILogin() {
		System.out.println("APIlogin");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]= "user1";
		data[0][1]= "password1";
		
		data[1][0]= "user2";
		data[1][1]= "password2";
		
		data[2][0]= "user3";
		data[2][1]= "password3";
		
		return data;
	}
	
	@AfterMethod
	public void Aftermethod() {
		System.out.println("Executes after every methods in class");
	}
}
