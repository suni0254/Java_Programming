package Day1_Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windIds = driver.getWindowHandles();
		for(String windId:windIds)
		{
			String title = driver.switchTo().window(windId).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM"))
			{
				driver.close();
			}
		}
		
		
		
	}

}
