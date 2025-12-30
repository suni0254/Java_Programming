package Day1_Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
