package testcases;

import org.testng.annotations.Test;

public class TestA {

	@Test(priority=1) // annotation
	public void doLogin() {
	System.out.println("Do Login Test");
	}
	
	@Test(priority=3) // annotation
	public void dopasswordchangs() {
	System.out.println("Changing password");
	}
	@Test(priority=2)
	public void logout() {
	System.out.println("Do logout");
}
}
