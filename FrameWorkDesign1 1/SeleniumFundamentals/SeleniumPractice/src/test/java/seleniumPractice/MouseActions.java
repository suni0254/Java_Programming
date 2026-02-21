package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {
    /*
    1. Right click
    2. Mouse hover
    3. Double click
    4. Drag and drop
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        driver.findElement(By.partialLinkText("GUI Elements")).click();

        Actions act = new Actions(driver);

        WebElement pointMe = driver.findElement(By.className("dropbtn"));
        WebElement mobile = driver.findElement(By.xpath("//div[@class='dropdown-content']/a[contains(text(),'Mobiles')]"));

        act.moveToElement(pointMe).build().perform();
        act.moveToElement(mobile).click().perform();

        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));

        act.dragAndDrop(source,destination).perform();

        System.out.println(driver.findElement(By.xpath("//div[@id='droppable']/p")).getText());

        WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
        field1.clear();

        String textForField1 = "Tiger";
        field1.sendKeys(textForField1);

        WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));

        WebElement dbClickButton = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));

        act.doubleClick(dbClickButton).perform();

        String field2Value = field2.getAttribute("value");

        if(field2Value.equals(textForField1)) {
            System.out.println("Passed");
        }
        else System.out.println("failed");

        driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement contextClickAction = driver.findElement(By.xpath("//span[normalize-space()='right click me']"));

        act.contextClick(contextClickAction).build().perform();

        driver.findElement(By.xpath("//li/span[normalize-space()='Copy']")).click();

        driver.switchTo().alert().accept();
    }
}
