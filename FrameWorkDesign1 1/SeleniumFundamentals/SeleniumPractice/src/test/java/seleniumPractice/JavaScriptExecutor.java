package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement sendKeys = driver.findElement(By.xpath("//input[@id='name']"));

        JavascriptExecutor js = (JavascriptExecutor)driver;

        js.executeScript("arguments[0].setAttribute('value', 'Imran')",sendKeys);

        WebElement gender = driver.findElement(By.id("male"));

        js.executeScript("arguments[0].click();", gender);

        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,500)","");
        System.out.println(js.executeScript("return window.pageYOffset;"));

        Thread.sleep(3000);

        WebElement uploadFile = driver.findElement(By.xpath("//input[@id='singleFileInput']"));

        js.executeScript("arguments[0].scrollIntoView();", uploadFile);
        System.out.println(js.executeScript("return window.pageYOffset;"));

        js.executeScript("arguments[0].click();", uploadFile);

        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
    }
}
