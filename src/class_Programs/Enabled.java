package class_Programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
		public void TC1() {
		Reporter.log("It's my First program in TestNG",true);
	}
	@Test(enabled=false)
	public void TC2() {
		Reporter.log("It's my Second program in TestNG",true);
	}
}
