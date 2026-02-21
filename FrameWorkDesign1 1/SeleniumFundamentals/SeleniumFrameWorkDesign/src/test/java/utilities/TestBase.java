package utilities;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }

    public String randomAlphabet() {
        String randAlphabet = RandomStringUtils.randomAlphabetic(5);

        return randAlphabet;
    }

    public String randomNumeric() {
        String randNumeric = RandomStringUtils.randomNumeric(10);

        return randNumeric;
    }

    public String randomAlphaNumeric() {
        String randAlphaNumeric = RandomStringUtils.randomAlphanumeric(8);

        return randAlphaNumeric;
    }
}
