package DataDrivenTesting;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;
import java.time.Duration;

public class CalculateInterestUsingUtilityFile {
    static WebDriverWait wait;

    public static void clearAndType(WebElement element, String value) throws InterruptedException {
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(Keys.DELETE);
        for(char c : value.toCharArray()) {
            Thread.sleep(1000);
            element.sendKeys(Character.toString(c));
        }
    }

//    public static void JSClearAndType(WebDriver driver, WebElement element, String value) {
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//
//        js.executeScript("arguments[0].scrollIntoView(true)", element);
//
//        js.executeScript("arguments[0].value = '';", element);
//        js.executeScript("arguments[0].value= arguments[1];", element, value);
//
//        js.executeScript("arguments[0].dispatchEvent(new Event('input',{bubbles: true}));", element);
//        js.executeScript("arguments[0].dispatchEvent(new Event('change',{bubbles : true}))", element);
//    }

    public static void scrollIntoViewAndType(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
    }

    public static void dropdownSelect(WebDriver driver, WebElement element) throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String file = System.getProperty("user.dir") + "\\testdata\\InterestFromUtility.xlsx";

        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");

        int rowCount = UtilityFile.getRowCount(file, "Sheet1");
        int colCount = UtilityFile.colCount(file , "Sheet1", 0);

        driver.findElement(By.xpath("//button[contains(@class,'onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon')]")).click();

        for(int r=1; r<=rowCount; r++) {

            String DepositAmount = UtilityFile.getCellData(file, "Sheet1", r, 0);
            String Duration = UtilityFile.getCellData(file, "Sheet1", r, 1);
            String InterestPer = UtilityFile.getCellData(file, "Sheet1", r, 2);
            String CompoundType = UtilityFile.getCellData(file, "Sheet1", r, 3);
            String expectedValue = UtilityFile.getCellData(file, "Sheet1", r, 4);

            WebElement depositAmount = driver.findElement(By.id("mat-input-0"));
                       scrollIntoViewAndType(driver, depositAmount);
                       clearAndType(depositAmount,DepositAmount);
//                       JSClearAndType(driver,depositAmount, DepositAmount);

            WebElement duration = driver.findElement(By.id("mat-input-1"));
                       scrollIntoViewAndType(driver, duration);
                       clearAndType(duration,Duration);
//                       JSClearAndType(driver,duration, Duration);

            WebElement interestPer = driver.findElement(By.id("mat-input-2"));
                       scrollIntoViewAndType(driver, interestPer);
                       clearAndType(interestPer,InterestPer);
//                       JSClearAndType(driver,interestPer, InterestPer);

            WebElement dropdown = driver.findElement(By.xpath("//div[@id='mat-select-value-1']"));
                       scrollIntoViewAndType(driver, dropdown);
                       dropdownSelect(driver, dropdown);

            WebElement compoundType = driver.findElement(By.xpath("//span[normalize-space()='"+CompoundType+"']"));
                       scrollIntoViewAndType(driver, compoundType);
                       dropdownSelect(driver, compoundType);

            WebElement run = driver.findElement(By.id("CIT-chart-submit"));
                       scrollIntoViewAndType(driver, run);
                       dropdownSelect(driver, run);

            String actualValue = driver.findElement(By.id("displayTotalValue")).getText();

            if(expectedValue.equals(actualValue)) {
                UtilityFile.setCellData(file, "Sheet1", r, 5, "Passed");
            }
            else
                UtilityFile.setCellData(file, "Sheet1", r, 5, "Failed");
        }
    }
}
