package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Screenshots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.get("https://testautomationpractice.blogspot.com/");

        driver.get("https://demo.nopcommerce.com/");

        TakesScreenshot ss = (TakesScreenshot)driver;

//        File source = ss.getScreenshotAs(OutputType.FILE);
//
//        //File destination = new File("C:\Users\Imranullah\IdeaProjects\SeleniumFundamentals\SeleniumPractice\Screenshots");
//        File destination = new File(System.getProperty("user.dir") + "\\Screenshots\\fullPage.png");
//
//        Files.copy(source.toPath(),destination.toPath());

//        WebElement FeaturedProducts = driver.findElement(By.className("product-grid"));
//
//        File source = FeaturedProducts.getScreenshotAs(OutputType.FILE);
//        File destination = new File(System.getProperty("user.dir") + "\\Screenshots\\partialPage.png");
//        Files.copy(source.toPath(), destination.toPath());

        WebElement element = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        File source = element.getScreenshotAs(OutputType.FILE);

        File destination = new File(System.getProperty("user.dir") + "\\Screenshots\\webElement.png");

        Files.copy(source.toPath(), destination.toPath());


        driver.quit();





    }
}
