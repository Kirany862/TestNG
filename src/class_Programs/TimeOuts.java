package class_Programs;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOuts {
	@Test
		public void TC1() {
		Reporter.log("It's my first TestNG program",true);
	}
	@Test(timeOut=1000)
	public void TC2() {
		Reporter.log("It's my second TestNG program",true);
		Assert.fail();
	}
}
