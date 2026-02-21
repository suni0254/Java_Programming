package seleniumPractice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;


public class WindowHandles {
    static WebDriverWait wait;
    static WebDriver driver;

    public static void performAction(By locator, String action, String value) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        switch (action.toLowerCase()) {
            case ("click"):
                wait.until(ExpectedConditions.invisibilityOfElementLocated(
                        By.cssSelector("div.block-ui-overlay")));
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                element.click();
                break;

            case ("sendkeys"):
                element.sendKeys(value);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
                break;

            case ("gettext"):
                element.getText();
                if (value.toLowerCase().equals("print")) {
                    System.out.println("The Text is : " + element.getText());
                }
                break;

            case ("clear"):

                element.clear();

                ((JavascriptExecutor)driver).executeScript("arguments[0].value='';", element);


                break;

            default:
                System.out.println("invalid action " + action);
        }
    }

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //driver.get("https://beta.leonardo247.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement element = fluentWait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.xpath("//div[@name='type_residential']//ng-include"));
//            }
//        });


//        performAction(By.xpath("//div[@name='email']/descendant::input"), "sendKeys", "admin@pms.com");
//        performAction(By.xpath("//div[@class='wrapper-checkbox']//icon"), "click", null);
//        performAction(By.xpath("//button[normalize-space()='Continue']"), "click", null);
//        performAction(By.xpath("//input[@name='value' and @type='password']"), "clear", null);
//        performAction(By.xpath("//input[@name='value' and @type='password']"), "sendKeys", "12345678q");
//        performAction(By.xpath("//button[contains(normalize-space(text()),'Sign In')]"), "click", null);
//
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getWindowHandle());
//        //System.out.println(driver.getPageSource());
//
//        try {
//            performAction(By.xpath("//li/child::a[contains(normalize-space(text()),'Property -')][contains(@class,'label-property')]"), "click", null);
//        } catch (ElementClickInterceptedException e) {
//            performAction(By.xpath("//li/child::a[contains(normalize-space(text()),'Property -')][contains(@class,'label-property')]"), "click", null);
//        }
//        performAction(By.xpath("//div[contains(@class,'widget-property')]/child::div[contains(text(),'Property selector')]"), "click", null);
//        performAction(By.xpath("//li[normalize-space()='Test1YardiProperty']"), "click", null);
//        performAction(By.xpath("//span[normalize-space()='Add Task']"), "click", null);
//        performAction(By.xpath("//input[contains(@class,'ng-untouched ng-isolate')]"), "sendKeys", "1111");
//        performAction(By.xpath("//div[@name='priority']//li[3]"), "click", null);
//        performAction(By.xpath("//div[@name='note_required']/descendant::ng-include"), "click", null);
//        performAction(By.xpath("//span[text()='Select from Doc Manager']"), "click", null);
//        performAction(By.xpath("//span[normalize-space()='2202 CCE']/ancestor::li//icon[@class='icon ng-isolate-scope inline']"), "click", null);
//        performAction(By.xpath("//span[normalize-space()='Select']"), "click", null);
//        performAction(By.xpath("//div[@name='category']//li[@class='form-checkbox ng-binding ng-scope']/icon[@class='icon ng-isolate-scope inline']"), "click", null);
//        performAction(By.xpath("//input[@value='Select Subcategory']/following-sibling::div"), "click", null);
//        performAction(By.xpath("//span[normalize-space()='Elevators']/preceding-sibling::icon"), "click", null);
//        performAction(By.xpath("//select[@name='recurrence_type']"), "click", null);
//        performAction(By.xpath("//select[@name='recurrence_type']/child::option[contains(text(), 'Daily')]"), "click", null);
//        performAction(By.xpath("//div[@name='type_residential']//icon"), "click", null);
//        performAction(By.xpath("//div[normalize-space(text())='Save changes']"), "click", null);

        WindowHandles();
    }

    public static void WindowHandles() {
        driver.get("https://testautomationpractice.blogspot.com/");

        performAction(By.partialLinkText("GUI Elements"), "click", null);
        performAction(By.xpath("//button[@onclick='myFunction()']"), "click", null);

        List<String> windows = new ArrayList(driver.getWindowHandles());

        for (String window : windows) {
            System.out.println("Windows : " + window);
        }
        System.out.println("Title of Window 1 : " + driver.getTitle());
        driver.switchTo().window(windows.get(1));
        System.out.println("Title of Window 2 : " + driver.getTitle());

        if(driver.getTitle().equals("www.pavantestingtools.com")) {
            System.out.println("Passed");
        }
        else System.out.println("fail");
        driver.close();
        driver.switchTo().window(windows.get(0));
        performAction(By.xpath("//button[@id='PopUp']"),"click", null);

        List<String> newWindow = new ArrayList<>(driver.getWindowHandles());

        for(String window : newWindow) {
            System.out.println(window);
        }

        System.out.println(driver.getTitle());

        driver.switchTo().window(newWindow.get(1));
        System.out.println(driver.getTitle());

        driver.switchTo().window(newWindow.get(2));
        System.out.println(driver.getTitle());

    }
}
