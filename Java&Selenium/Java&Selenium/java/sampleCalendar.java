import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class sampleCalendar {

    WebDriver driver;
    JavascriptExecutor jse;

    @Test
    public void selectTheDate() {
        driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        jse = (JavascriptExecutor) driver;

        WebElement departureDate = driver.findElement(By.cssSelector("[data-cy='departureDate']"));
        departureDate.click();

        selectDate("2025", "March","5");
    }

    public void selectDate(String year, String month,String Date) {
        // Select year
        while (!isYearVisible(year)) {
            driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
            conditionBasedDelay();
        }

        // Select month
        while (!isMonthVisible(month)) {
            driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
            conditionBasedDelay();
        }
       WebElement element= driver.findElement(By.xpath("//*[@class='DayPicker-Month']/div/div[starts-with(text(),'March')]/../../descendant::div[starts-with(@class,'DayPicker-Day')]/div/p[text()='"+Date+"']"));
        element.click();
        driver.quit();
    }

     public boolean isYearVisible(String year) {
        return !driver.findElements(By.xpath("//*[@class='DayPicker-Month']/div/div[contains(text(),'" + year + "')]")).isEmpty();
    }

    public boolean isMonthVisible(String month) {
        return !driver.findElements(By.xpath("//*[@class='DayPicker-Month']/div/div[contains(text(),'" + month + "')]")).isEmpty();
    }

    private void conditionBasedDelay() {
        try {
            // Customize the delay time based on your condition, e.g., wait longer after a few clicks
            Thread.sleep(500); // Delay in milliseconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}




