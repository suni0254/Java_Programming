import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Test1 {
    WebDriver driver;
    JavascriptExecutor jse;

    @Test
    public void selectTheDate() {
        driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        jse = (JavascriptExecutor) driver;

        WebElement departureDate = driver.findElement(By.cssSelector("[data-cy='departureDate']"));
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        String script = "arguments[0].click()";
//        jse.executeScript(script, departureDate);
        departureDate.click();
        selectDate("June", "2025", "1");


    }

    public void selectDate(String month, String year, String date) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds wait time
        // WebElement Date= driver.findElement(By.xpath("//div[text()='" + month + " " + year + "']/../../descendant::div[starts-with(@class,'DayPicker-Day')]/div/p[text()='" + date + "']"));
        for (int i = 0; i < 12; i++) {
            List<WebElement> desiredDate = driver.findElements(By.xpath(
                    "//div[text()='" + month + " " + year + "']/../../descendant::div[starts-with(@class,'DayPicker-Day')]/div/p[text()='" + date + "']"
            ));
            if (desiredDate.size() > 0) {
                desiredDate.get(0).click();
                break;
            } else {
                driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
                wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Next Month']")));
            }
        }
    }
}


