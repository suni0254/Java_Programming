package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

/* Dropdowns
1. Select dropdowm
2. BootStrap dropdown
3. Hidden dropdown.

 */


public class SelectDropdowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.navigate().to("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

        WebElement dropdownBySelect = driver.findElement(By.id("country-list"));

        Select select = new Select(dropdownBySelect);

        List<WebElement> elements = select.getOptions();
        System.out.println(elements.size());

        for(WebElement element : elements) {
            System.out.println(element.getText());
        }

        select.selectByIndex(3);
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException ignored) {
            ignored.printStackTrace();
        }
        select.selectByVisibleText("India");
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ignored) {
            ignored.printStackTrace();
        }
        select.selectByValue("2");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//span[contains(normalize-space(),'PIM')]")).click();

        driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement listBox = driver.findElement(By.xpath("//div[@role='listbox']"));
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", listBox);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option']")));
        Thread.sleep(3000);

        List<WebElement> dropdownElements = driver.findElements(By.xpath("//div[@role='option']"));

        System.out.println(dropdownElements.size());

        for(WebElement element : dropdownElements) {
            System.out.println(element.getText());
        }

        driver.findElement(By.xpath("//div[@role='option']/span[text()='Full-Time Contract']")).click();


//        driver.close();
    }
}