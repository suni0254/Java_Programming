package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/*
1. get methods
2. conditional Methods
3. wait methods
4. navigation method
5. browser methods
 */

/* Get Methods
1. getTitle()
2. get(URL)
3. getCurrentURL()
4. getPageSource()
5. getWindowHandle()
6. getWindowHandles()
 */

/* Conditional Methods
1. isDisplayed()
2. isEnabled()
3. isSelected()
 */

/* Wait methods
1. Thread.sleep (Not a selenium method, this is provided by Java)
2. implicit wait
3. Explicit wait
4. Fluent wait(similar to explicit wait, few additions)
 */

/* Browser & Navigation methods
1. navigate().to()
2. navigate().back()
3. navigate().forward()
4. navigate().refresh()
 */

public class SeleniumPractice {
    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://mvnrepository.com/");
//        String title = driver.getTitle();
//
//        System.out.println(title);
//
//        if(title.equals("Maven Repository: Search/Browse/Explore")) {
//            System.out.println("Passed");
//        }
//        else
//            System.out.println("Failed");
//
//        driver.quit();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoblaze.com/index.html#");

        /* CSS Selector locators

        1. tag#id
        2. tag.className
        3. tag[attribute='value']
        4. tag.className[attribute='value]
         */


//        driver.get("https://www.facebook.com/");
//        driver.findElement(By.id("email")).sendKeys("imrankhans1015@gmail.com");         //id
//        driver.findElement(By.name("pass")).sendKeys("imrankhans1997");                  //name
//        //driver.findElement(By.tagName("button")).click();                              //tag name
//        List<WebElement> elements = driver.findElements(By.className("nav-item"));       //class name
//        System.out.println(elements.size());
//
//        for(WebElement e : elements) {
//            System.out.println(e.getText());
//        }

        //driver.findElement(By.partialLinkText("Forgotten")).click();                    //partialLinkText("partial text")
        //driver.findElement(By.linkText("Forgotten password")).click();                  //linkText("text")
        driver.findElement(By.cssSelector("a#login2")).click();                           //css: tag#id
        driver.findElement(By.cssSelector("#login2")).click();                            //css: #id

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#loginusername"))).sendKeys("Imrankhans10156");       //css: tag#id

        driver.findElement(By.id("loginpassword")).sendKeys("Imrankhans");                         //id
        driver.findElement(By.cssSelector("button.btn-primary[onclick='logIn()']")).click();           //css: tag.class[Attribute='value']

        driver.close();
    }
}
