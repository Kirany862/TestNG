package class_Programs;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("Open Browser", true);
	}

	@BeforeMethod
	public void loginToApp() {
		Reporter.log("Login to App", true);
	}

	@Test
	public void verifyText() {
		Reporter.log("Running Actual Test Case", true);
	}

	@AfterMethod
	public void logOutApp() {
		Reporter.log("Logout from App", true);
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close Browser", true);
	}
}
