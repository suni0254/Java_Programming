package Day1_Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAndSwitchToNewTabOrBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		//driver.switchTo().newWindow(WindowType.TAB);			//Open the new tab and switch to new tab
		driver.switchTo().newWindow(WindowType.WINDOW);			//Open the new browser window and switch to new browser window		
		driver.get("https://testautomationpractice.blogspot.com/?");
	}

}
