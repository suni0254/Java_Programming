package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class TestAutomationPractice {
    static WebDriver driver;
    static WebDriverWait wait;


    public static void performAction(By locator, String action, String value) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element;
        if(action.toLowerCase().equals("click")) {
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        }
        else {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        switch(action.toLowerCase()) {
            case("click"):
                element.click();
                break;

            case("sendkeys"):
                element.sendKeys(value);
                break;

            case("gettext"):
                element.getText();
                break;

            default:
                System.out.println("invalid action : " + action);
                break;
        }
    }
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://testautomationpractice.blogspot.com");
        String mainWindow = driver.getWindowHandle();

        performAction(By.partialLinkText("GUI Elements"), "click", null);
        performAction(By.id("Wikipedia1_wikipedia-search-input"), "sendkeys", "Selenium");
        performAction(By.className("wikipedia-search-button"), "click", null);

        String xPath = "(//div[@id='wikipedia-search-result-link']/a)";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));

        List<WebElement> links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));

        for (int i = 1; i <= links.size(); i++) {
            performAction(By.xpath(xPath + "[" + i + "]"), "click", null);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

            wait.until(driver -> driver.getWindowHandles().size() > 1);

            Set<String> windows = driver.getWindowHandles();

        for (String handle : windows) {
            driver.switchTo().window(handle);

            System.out.println("Current URL : " + driver.getCurrentUrl());
            System.out.println("Current window Title : " + driver.getTitle());
            System.out.println("Current Window handle : " + handle);

            driver.switchTo().window(mainWindow);

        }
        driver.quit();
        }
}
