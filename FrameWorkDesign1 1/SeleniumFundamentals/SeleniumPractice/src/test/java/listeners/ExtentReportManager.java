package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.*;
import org.testng.*;

import java.io.File;
import java.nio.file.Files;

public class ExtentReportManager implements ITestListener {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    // Create report only once
    private static ExtentReports createInstance() {
        String path = System.getProperty("user.dir") + "/reports/ExecutionReport.html";

        ExtentSparkReporter spark = new ExtentSparkReporter(path);
        spark.config().setReportName("Automation Report");
        spark.config().setDocumentTitle("Test Execution Report");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Imran");
        extent.setSystemInfo("Environment", "QA");

        return extent;
    }

    @Override
    public void onStart(ITestContext context) {
        if (extent == null)
            extent = createInstance();
        System.out.println("===== Execution Started =====");
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.get().log(Status.FAIL, result.getThrowable());

        Object driverObj = result.getTestContext().getAttribute("WebDriver");
        if (driverObj != null) {
            WebDriver driver = (WebDriver) driverObj;
            String screenshotPath = takeScreenshot(driver, result.getMethod().getMethodName());

            try {
                test.get().addScreenCaptureFromPath(screenshotPath);
                test.get().log(Status.INFO, "Screenshot Attached");
            } catch (Exception e) {
                test.get().log(Status.WARNING, "Failed to attach screenshot");
            }
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        test.remove();   // prevent memory leak
        System.out.println("===== Execution Finished =====");
    }

    // Screenshot Utility
    private String takeScreenshot(WebDriver driver, String fileName) {
        try {
            fileName = fileName.replace(" ", "_"); // safe filename
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String path = System.getProperty("user.dir") +
                    "/reports/screenshots/" + fileName + ".png";

            File dest = new File(path);
            dest.getParentFile().mkdirs();
            Files.copy(src.toPath(), dest.toPath());

            return path;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
