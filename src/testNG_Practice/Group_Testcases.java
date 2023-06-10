package testNG_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Testcases {
	@Test(groups = "Regression")
	public void Test1() {
		Reporter.log("hello");
	}

	@Test(groups = { "Regression", "Integration" })
	public void Test2() {
		Reporter.log("hello...");
	}

	@Test(groups = { "unit", "Integration" })
	public void Test3() {
		Reporter.log("hello");
	}
}
