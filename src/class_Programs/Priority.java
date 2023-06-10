package class_Programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test(priority=3)
	public void Tc1() {
		Reporter.log("Running TC1", true);
	}

	@Test(priority=2)
	public void Tc2() {
		Reporter.log("Running TC2", true);
	}

	@Test(priority=1)
	public void Tc3() {
		Reporter.log("Running TC3", true);
	}
}