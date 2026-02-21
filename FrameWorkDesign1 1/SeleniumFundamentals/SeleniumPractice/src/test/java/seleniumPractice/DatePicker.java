package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        String departureCountry = "Austria";
        String arrivalCountry = "Atlanta";
        String monthToSelect = "Apr";
        String yearToSelect = "2026";
        String dateToSelect = "11";

        driver.get("https://dummy-tickets.com/");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='flight_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='source[]']"))).sendKeys(departureCountry);

        List<WebElement> departureList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='source[]']/following::div/p[@class='heading']")));

        for (WebElement country : departureList) {
            if(country.getText().contains(departureCountry)) {
                country.click();
                break;
            }
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='flight_oneway']//div[@class='col-sm-12 p-0 suggestion-container']//input[@name='destination[]']"))).sendKeys(arrivalCountry);
        List<WebElement> arrivalList = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@name='destination[]']/following::div/p[@class='heading']")));

        for (WebElement country : arrivalList) {
            if(country.getText().contains(arrivalCountry)) {
                country.click();
                break;
            }
        }

        driver.findElement(By.xpath("//form[@id='flight_oneway']//input[@name='departure[]']")).click();

        WebElement monthxpath = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-month")));
        monthxpath.click();
        Select month = new Select(monthxpath);
        month.selectByVisibleText(monthToSelect);

        WebElement yearxpath = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-year")));
        Select year = new Select(yearxpath);
        year.selectByValue(yearToSelect);

        List<WebElement> dates = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table//tr/td/a")));

        for(WebElement date : dates) {
            if(date.getText().equals(dateToSelect)) {
                wait.until(ExpectedConditions.elementToBeClickable(date)).click();
            }
        }

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ui-datepicker-div")));

        WebElement buyButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flight_oneway_btn")));

        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",buyButton);

        wait.until(ExpectedConditions.elementToBeClickable(buyButton));

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",buyButton);





        driver.quit();

    }
}
