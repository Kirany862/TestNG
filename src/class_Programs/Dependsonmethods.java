package class_Programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {
	@Test
	public void login() {
		Reporter.log("Running Login Test Case", true);
	}

	@Test(dependsOnMethods = { "login" })
	public void logout() {
		Reporter.log("Running Logout Test Case", true);
	}
}
