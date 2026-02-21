package trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor to initiate WebDriver and WebDriverWait
    Utility(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Waits for visibility of element
    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Waits for element to be clickable
    public WebElement waitForClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Send text to an element after clearing its previous value
    public void sendKey(By locator, String value) {
        WebElement element = waitForVisibility(locator);
        element.clear();
        element.sendKeys(value);
    }

    // Clicks on the element after waiting for it to be clickable
    public void click(By locator) {
        WebElement element = waitForClickable(locator);
        element.click();
    }
}
