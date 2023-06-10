package iTestListener_Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test case is failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test case skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getName()+"Failed but within Success Percentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println(result.getName()+"failed with Timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"On start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+"test case Finished");
	}
}
