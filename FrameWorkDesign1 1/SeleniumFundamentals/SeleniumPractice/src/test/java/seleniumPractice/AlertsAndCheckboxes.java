package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AlertsAndCheckboxes extends WindowHandles {


    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        performAction(By.partialLinkText("GUI Elements"), "click", null);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        for(int i=1; i<4; i++) {
            checkboxes.get(i).click();
        }

        for(WebElement checkbox : checkboxes) {
            if(!checkbox.isSelected()) {
                checkbox.click();
            }
        }

        List<WebElement> productsList = driver.findElements(By.xpath("//table[@id='productTable']//input"));
        for(int i=1; i<4; i++) {
            productsList.get(i).click();
        }

        for(WebElement list : productsList) {
            if(!list.isSelected()) {
                list.click();
            }
        }

        performAction(By.id("alertBtn"), "click", null);

        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();

        performAction(By.id("confirmBtn"), "click", null);
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.accept();

        performAction(By.id("confirmBtn"), "click", null);
        Alert alert3 = driver.switchTo().alert();
        alert3.dismiss();
        performAction(By.id("demo"), "gettext", "print");

        driver.quit();
    }
}
