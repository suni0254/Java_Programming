package Day7_TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	public ExtentSparkReporter sparkReporter;		//Responsible for UI of the report
	public ExtentReports extent;					//Populating common information on the report
	public ExtentTest test;							//Creating TC entries in the project & update the status of the test methods
	
	public void onStart(ITestContext context)
	{
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		sparkReporter.config().setDocumentTitle("Automation Report"); 		//Title of the Report
		sparkReporter.config().setReportName("Functional Testing"); 		//Name of the Report
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Sunil");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Browser Name", "Chrome");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());					//Creating a new entry in the report
		test.log(Status.PASS, "Test Case Passed is: "+result.getName());		//Update status whether it is pass/fail/skip
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());					
		test.log(Status.FAIL, "Test Case Failed is: "+result.getName());	
		test.log(Status.FAIL, "Test Case Failed cause is: "+result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());					//Creating a new entry in the report
		test.log(Status.SKIP, "Test Case Skipped is: "+result.getName());		//Update status whether it is pass/fail/skip
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

	
	

}
