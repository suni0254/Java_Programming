package Day1_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_Elements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//Locating SVG elements using [name()='svg']
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']//*[name()='svg']//*[name()='text']")).click();
		
	}

}
