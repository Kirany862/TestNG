package class_Programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationCount=3)
	public void test() {
	Reporter.log("Hey...",true);
}
}
