package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.deadlinkcity.com/");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        int brokenLinks = 0;

        for(WebElement link : links) {

            String hrefValue = link.getAttribute("href");

            if(hrefValue==null || hrefValue.isEmpty()) {
                System.out.println("href link is empty : " + hrefValue);
                brokenLinks++;
                continue;
            }

            try {

                URL hrefURl = new URL(hrefValue);
                HttpURLConnection conn = (HttpURLConnection) hrefURl.openConnection();
                conn.connect();

                if (conn.getResponseCode() >= 400) {
                    System.out.println(conn + " : This link is broken");
                } else
                    System.out.println(conn + " : This link is not broken");
            }
            catch (Exception e) {

            }
        }
    }
}
