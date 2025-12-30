package Day1_Selenium;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPageDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		/*
		//Scroll down page by Pixel number
		js.executeScript("window.scrollBy(0,3000)","");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		/*
		//Scroll the page till the element is visible
		WebElement cmtyText = driver.findElement(By.xpath("//div/strong[text()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView()", cmtyText);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		*/
		
		//Scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;", args));
		
		Thread.sleep(3000);
		
		//Scrolling upto Initial Position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	}

}
