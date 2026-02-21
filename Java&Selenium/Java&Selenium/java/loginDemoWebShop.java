import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginDemoWebShop {
    WebDriver driver;
   // public String headerValue = "Email";

    @Test
    public void getDataDemo() {


        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        //get URL
       /* String actual=driver.getCurrentUrl();
        String expected="https://demowebshop.tricentis.com/";
        Assert.assertEquals(actual,expected);*/

        WebElement ele=driver.findElement(By.xpath("//a[text()='Log in']"));
        ele.getText();
        String actual1= "ele";
        String expected1="Log in";
        Assert.assertEquals(actual1,expected1);


    }
}