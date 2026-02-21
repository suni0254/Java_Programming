package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicOrPaginationWebTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
        List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
        List<WebElement> noOfCols = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr[1]/td"));
        System.out.println(pages.size() + " " + " " + noOfRows.size() + " "+ " "  + noOfCols.size());


        for(int i=1; i<= pages.size(); i++) {
            WebElement pageButton = driver.findElement(By.xpath("(//ul[@id='pagination']/li)["+i+"]"));
            if(i>1) {
                pageButton.click();
            }
            for(int k=1; k<=noOfRows.size(); k++) {
                for (int j=1; j<noOfCols.size(); j++) {
                    System.out.print(driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+k+"]/td["+j+"]")).getText()+"\t");
                }
                driver.findElement(By.xpath("(//td/input[@type='checkbox'])["+k+"]")).click();
                System.out.println();
            }
        }
        driver.quit();
    }
}
