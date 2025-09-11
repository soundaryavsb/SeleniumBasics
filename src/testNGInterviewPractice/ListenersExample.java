package testNGInterviewPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenersExample implements ITestListener{

	@Test
	public void onTestStart(ITestResult result) {
		System.out.println("--On Test Start--");
	}
	@Test
	public void onTestSuccess(ITestResult result) {
		System.out.println("--On Test Success--");
	}
	@Test
	public void onTestFailure(ITestResult result) {
		System.out.println("--On Test Failure--");
	}
	@Test
	public void onTestSkipped(ITestResult result) {
		System.out.println("--On Test Skipped--");
	}
	@Test
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("--On Test Failed But Within Success Percentage--");
	}
	@Test
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("--On Test Failed With Timeout--");
	}
	@Test
	public void onStart(ITestContext context) {
		System.out.println("--On Start--");
	}
	@Test
	public void onFinish(ITestContext context) {
		System.out.println("--On Finish--");
	}

}
