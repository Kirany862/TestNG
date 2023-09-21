package testNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void loginTest() {
		Reporter.log("Login is successful", true);
	}
	@Test
	public void logOutTest() {
		Reporter.log("Logout is successful", true);
	}
}
