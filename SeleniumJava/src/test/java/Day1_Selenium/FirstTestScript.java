package Day1_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestScript {

	public static void main(String[] args) {
		//Lanuch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//Enter the URL
		driver.get("https://www.selenium.dev/");
		
		//Validate the Title of the page
		String appTitle = driver.getTitle();
		if(appTitle.equals("Selenium"))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title Not Matched");
		}
		
		//Close the Browser
		driver.quit();
	}

}
