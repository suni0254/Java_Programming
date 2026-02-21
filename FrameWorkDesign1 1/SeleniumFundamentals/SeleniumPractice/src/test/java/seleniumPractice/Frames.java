package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ui.vision/demo/webtest/frames/");

        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));

        driver.switchTo().frame(frame1);
        driver.findElement(By.name("mytext1")).sendKeys("frame1");

        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));

        driver.switchTo().frame(frame2);
        driver.findElement(By.name("mytext2")).sendKeys("frame2");

        driver.switchTo().defaultContent();

        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));

        driver.switchTo().frame(frame3);
        driver.findElement(By.name("mytext3")).sendKeys("frame3");

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();

        driver.switchTo().defaultContent();

        WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
        driver.switchTo().frame(frame4);

        driver.findElement(By.name("mytext4")).sendKeys("frame4");

        driver.switchTo().defaultContent();

        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);

        driver.findElement(By.name("mytext5")).sendKeys("frame5");
        driver.findElement(By.xpath("//a[text()='https://a9t9.com']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='logo']")));
        System.out.println(logo.isDisplayed());

        driver.close();
    }
}
