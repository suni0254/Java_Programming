package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNG1 {
    WebDriver driver;
    WebDriverWait wait;

    @Test(priority = 1)
    public void launchBrowser() {
        driver = new ChromeDriver();

        driver.get("https://beta.leonardo247.com");
        driver.manage().window().maximize();
    }

    @Test(priority = 2)
    public void login() {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@name='email']/descendant::input"))).sendKeys("admin@pms.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wrapper-checkbox']//icon"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Continue']"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='value' and @type='password']"))).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='value' and @type='password']"))).sendKeys("12345678q");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(normalize-space(text()),'Sign In')]"))).click();
    }

    @Test(priority = 3)
    public void quitBrowser() {
        driver.quit();
    }
}
