package Day1_Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		
		//Get total no of links in a application
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are:"+links.size());
		int brokenLinks =0;
		
		for(WebElement link : links)
		{
			
			try
			{
			String hrefValue = link.getAttribute("href");
			if(hrefValue.equals(null) || hrefValue.isEmpty())
			{
				System.out.println("href attribute valud is null or empty. SO not possible to check");
				continue;
			}
			URL strgToURL = new URL(hrefValue);		//Convert hrefValue from string to URL format
			HttpURLConnection openLinkConnection =  (HttpURLConnection)strgToURL.openConnection();  //Open connection to particular url
			openLinkConnection.connect();
			if(openLinkConnection.getResponseCode()>=400)
			{
				System.out.println(hrefValue+"====>Broken Link");
				brokenLinks++;
			}
			else
			{
				System.out.println(hrefValue+"====>Not a Broken Link");

			}
			
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Total no of Broken Links are:"+brokenLinks);
		
		
		
		
	}

}
