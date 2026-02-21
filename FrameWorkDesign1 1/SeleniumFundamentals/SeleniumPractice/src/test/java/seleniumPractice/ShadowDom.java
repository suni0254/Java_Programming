package seleniumPractice;

//Use only CSS selectors to find Shadow elements

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShadowDom {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://dev.automationtesting.in/shadow-dom");

        //1st Shadow element
        SearchContext shadowRoot = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        System.out.println(shadowRoot.findElement(By.cssSelector("#shadow-element")).getText());


        //2nd(Nested Shadow element)
        SearchContext outerShadowRoot = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();

        SearchContext innerShadowRoot = outerShadowRoot.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        System.out.println(innerShadowRoot.findElement(By.cssSelector("#nested-shadow-element")).getText());


        //3rd(Multi-nested Shadow element)
        SearchContext outerRoot = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
        SearchContext innerRoot = outerRoot.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        SearchContext nestedInnerRoot = innerRoot.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();

        System.out.println(nestedInnerRoot.findElement(By.cssSelector("#multi-nested-shadow-element")).getText());


        //SVG elements xpath - name() attribute is must in xpath.
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement time = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[name()='path' and contains(@d,'M422,332H9')]")));
        time.click();

        //driver.quit();
    }
}
