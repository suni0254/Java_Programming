package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement uploadFile = wait.until(ExpectedConditions.elementToBeClickable(By.id("singleFileInput")));

        uploadFile.sendKeys("C:\\Users\\Imranullah\\Documents\\manualQuestions\\APIManual.pdf");

        WebElement multipleFiles = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("multipleFilesInput")));

        String file1 = "C:\\Users\\Imranullah\\Documents\\manualQuestions\\Testingprinciples.pdf";
        String file2 = "C:\\Users\\Imranullah\\Documents\\manualQuestions\\Software_Testing_Principles_QA.pdf";
        multipleFiles.sendKeys(file1 + "\n" + file2);
    }
}
