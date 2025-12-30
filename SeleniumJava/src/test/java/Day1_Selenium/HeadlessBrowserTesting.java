package Day1_Selenium;

import java.time.Duration;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--headless=new");		//Setting for headless mode of execution
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
	}

}
