package pomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POCwithoutPageFactory {

    WebDriver driver;
    WebDriverWait wait;

    POCwithoutPageFactory(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    By usernameField = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@type='submit']");

    public void setUserName(String userName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(userName);
    }

    public void setPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }
}
