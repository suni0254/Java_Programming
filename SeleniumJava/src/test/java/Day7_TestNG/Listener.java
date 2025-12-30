package Day7_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	public void onTest(ITestResult result)
	{
		System.out.println("Test Execution is started");
	}
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test is started");	
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed");	
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test is finished");
	}

}
