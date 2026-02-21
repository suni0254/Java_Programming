package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class StaticWebTables {

    /*
    1. Static Web Table
    2. Dynamic Web Table
    3. Pagination Table
     */
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://blazedemo.com/");

        WebElement dropdown1xpath = driver.findElement(By.name("fromPort"));
        Select dropdown1 = new Select(dropdown1xpath);

        dropdown1.selectByValue("Portland");

        WebElement dropdown2xpath = driver.findElement(By.name("toPort"));
        Select dropdown2 = new Select(dropdown2xpath);

        dropdown2.selectByValue("New York");

        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
        System.out.println(rows.size());

        List<WebElement> columns = driver.findElements(By.xpath("//table//tr/th"));

        System.out.println(columns.size());

        for(int i=1; i<=rows.size(); i++) {
            WebElement element = driver.findElement(By.xpath("(//table//tr/th)["+i+"]"));
            System.out.print(element.getText()+"\t");
        }
        System.out.println();

        for(int row=1; row<=rows.size()-1; row++) {
            for(int col=1; col<=columns.size(); col++) {
                WebElement element = driver.findElement(By.xpath("//table/tbody/tr[" + row + "]/td[" + col + "]"));
                System.out.print(element.getText() + "\t");
            }
            System.out.println();
        }

        List<WebElement> priceInString = driver.findElements(By.xpath("//td[6]"));
        List<Double> prices = new ArrayList<>();
        double totalAmount = 0;
        for(int i=0; i<columns.size()-1; i++) {
            String price = priceInString.get(i).getText();
            prices.add(Double.parseDouble(price.replaceAll("[^0-9.]","")));
        }

        double temp = 0;
        for(int i=0; i< prices.size(); i++) {
            for(int j=0; j<prices.size()-i-1; j++ ) {
                if(prices.get(j)>prices.get(j+1)) {
                    temp = prices.get(j);
                    prices.set(j, prices.get(j+1));
                    prices.set(j+1, temp);
                }
            }
        }
        System.out.println(prices);

        WebElement button = driver.findElement(By.xpath("//td[6]/preceding-sibling::td[5]/input"));
        for(int i=1; i<=prices.size(); i++) {
            String price = priceInString.get(i).getText();
            if(prices.get(0) == Double.parseDouble(price.replaceAll("[^0-9.]",""))) {
                button.click();
                break;
            }
        }

        System.out.println(driver.findElement(By.tagName("h2")).getText());

        driver.quit();
    }
}
