package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("Execution started");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("Test case execution started : ");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case Failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case Skipped");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Execution finished");
    }

}
