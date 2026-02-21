import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class calenderTest {

        WebDriver driver;
        JavascriptExecutor jse;

        @Test
        public void selectTheDate() {
            driver = new ChromeDriver();

            driver.get("https://www.makemytrip.com/");
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().window().maximize();
            jse = (JavascriptExecutor) driver;

            WebElement departureDate = driver.findElement(By.cssSelector("[data-cy='departureDate']"));
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        String script = "arguments[0].click()";
//        jse.executeScript(script, departureDate);
            departureDate.click();

            List<WebElement> monthAndYear = driver.findElements(By.cssSelector(".DayPicker-Month > .DayPicker-Caption > div"));
            List<String> monthAndYearData = getListOfItems(monthAndYear);

            for (int i = 0; i < monthAndYearData.size(); i++) {
                monthAndYearData.get(i).split(" ");
            }

            selectDate("2025", "March");
            selectADate("March", "1");
        }

        public void selectDate(String year, String month) {
            //List<WebElement> years = driver.findElements(By.xpath("//*[@class='DayPicker-Month']/div/div[contains(text(),'" + year + "')]"));
            for (int i = 0; i < 12; i++) {

                if (driver.findElements(By.xpath("//*[@class='DayPicker-Month']/div/div[contains(text(),'" + year + "')]")).size() > 0) {
                    //break;
                } else {
                    driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
                }
            }

            // List<WebElement> months = driver.findElements(By.xpath("//*[@class='DayPicker-Month']/div/div[contains(text(),'" + month + "')]"));
            for (int i = 0; i < 12; i++) {
                if (driver.findElements(By.xpath("//*[@class='DayPicker-Month']/div/div[contains(text(),'" + month + "')]")).size() > 0) {
                   // break;
                } else {
                    driver.findElement(By.cssSelector("[aria-label='Next Month']")).click();
                }
            }
        }

        public List<String> getListOfItems(List<WebElement> elements) {
            List<String> itemsList = new ArrayList<>();
            for (int i = 0; i < elements.size(); i++) {
                itemsList.add(elements.get(i).getText());
            }
            System.out.println("itemsList :: " + itemsList);
            return itemsList;
        }

        public void selectADate(String month, String date) {
            WebElement element = driver
                    .findElement(By
                            .xpath("//*[@class='DayPicker-Month']/div/div[starts-with(text(),'" + month + "')]/../../descendant::div[starts-with(@class,'DayPicker-Day')]/div/p[text()='" + date + "']"));
            jse.executeScript("arguments[0].scrollIntoView(true);", element);

            Actions actions = new Actions(driver);
            actions.moveToElement(element)
                    .perform();

            element.click();
        }


    }

