package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;

public class SliderAndKeyboardActions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement slider = driver.findElement(By.id("slider-range"));

        System.out.println(slider.getLocation());

        Actions action = new Actions(driver);

        action.moveToElement(slider).perform();

        WebElement sliderX = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));

        action.dragAndDropBy(sliderX, 100, 0).perform();

//        driver.close();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://text-compare.com/");

        driver.findElement(By.name("text1")).sendKeys("KeyboardActions");

        //Ctrl + A
        action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //Ctrl + C
        action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //Tab
        action.keyDown(Keys.TAB);

        //Ctrl + V
        action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Compare!']"))).click();

        System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='messageForUser']"))).getText());

        driver.navigate().to("https://demo.nopcommerce.com");

        WebElement link = driver.findElement(By.xpath("//a[text()='Register']"));

        action.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();


        //driver.quit();
    }
}
