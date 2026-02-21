package dataProviders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class DataProviders {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    @Test(dataProvider = "testdata")
    public void dP(String email, String password) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        emailField.clear();
        emailField.sendKeys(email);
        System.out.println(email);

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        passwordField.clear();
        passwordField.sendKeys(password);
        System.out.println(password);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']"))).click();

        String alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-danger alert-dismissible']"))).getText();

        System.out.println(alert);
        Assert.assertEquals(alert, "Warning: No match for E-Mail Address and/or Password.");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

//    @DataProvider(name = "testdata")
    @DataProvider(name = "testdata", indices = {3,4})
    public Object[][] loginData() {
        Object data[][] = {
                {"imrankhans10151@gmail.com", "imrankhans1"},
                {"imrankhans10152@gmail.com", "imrankhans2"},
                {"imrankhans10153@gmail.com", "imrankhans3"},
                {"imrankhans10154@gmail.com", "imrankhans4"},
                {"imrankhans10155@gmail.com", "imrankhans5"}
        };

        return data;
    }
}
