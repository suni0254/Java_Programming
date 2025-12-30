package Day1_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");				
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
				
		Set<String> windowIds = driver.getWindowHandles();
		/*
		//Approach-1: Without using Looping
		List<String> windowIDs = new ArrayList(windowHandles);
		String parentID = windowIDs.get(0);
		String childID = windowIDs.get(1);
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		 */
		
		//Approach-2: 
		for(String winId:windowIds)
		{
			String title = driver.switchTo().window(winId).getTitle();
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
		}
	}

}
