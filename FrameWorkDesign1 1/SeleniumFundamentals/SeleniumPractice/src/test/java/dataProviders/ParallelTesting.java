package dataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTesting {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    @Parameters({"browser", "url"})
    public void launchBrowser(String browser, String url) {

        switch (browser.toLowerCase()) {
            case ("chrome") :
                driver = new ChromeDriver();
                break;

            case("edge") :
                driver = new EdgeDriver();
                break;

            case("firefox") :
                driver = new FirefoxDriver();
                break;

            default:
                System.out.println("Invalid browser");
                return;
        }

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(url);
    }

    @Test
    public void login() {
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        username.sendKeys("admin");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        password.sendKeys("admin123");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

        boolean logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='client brand banner']"))).isDisplayed();

        Assert.assertEquals(logo, true);
    }

    @AfterClass
    public void quitBrowser() {
        driver.quit();
    }
}
