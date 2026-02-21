package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;


//We can also run tests using Listeners from class apart from xml file

public class testListeners {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void launchBrowser(ITestContext context) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        context.setAttribute("WebDriver", driver);
    }

    @Test(priority = 1)
    public void login() {
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        username.sendKeys("admin");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        password.sendKeys("admin123");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

        boolean logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='client brand banner']"))).isDisplayed();

        Assert.assertEquals(logo, true);
    }

    @Test(priority = 2, dependsOnMethods = "login")
    public void currURL() {

        wait.until(ExpectedConditions.urlContains("dashboard"));
        String currURL = driver.getCurrentUrl();
        System.out.println(currURL);
        Assert.assertEquals(currURL,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index" );
    }

    @Test(priority = 3, dependsOnMethods = "currURL")
    public void titleOfPage() {

        String title = "Orangehrm";
        String currTitle = driver.getTitle();
        System.out.println(title);

        Assert.assertEquals(currTitle, title);
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
