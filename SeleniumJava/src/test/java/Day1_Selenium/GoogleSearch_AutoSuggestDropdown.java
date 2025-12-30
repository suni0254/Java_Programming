package Day1_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch_AutoSuggestDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@role='listbox']/li//div[@class='lnnVSe']/div[contains(@class,'wM6W7d')]/span"))));
		
		//Capture total no of options in Search Dropdown
		List<WebElement> searOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='lnnVSe']/div[contains(@class,'wM6W7d')]/span"));
		System.out.println("No of options in Search Dropdown is:"+searOptions.size());
		
		/*
		//Printing total options in search Dropdown using For loop
		for(int i=0;i<searOptions.size();i++)
		{
			System.out.println(searOptions.get(i).getText());
		}
		*/
		
		/*
		//Printing total options in search Dropdown using For-each loop
		for(WebElement option:searOptions)
		{
			System.out.println(option.getText());
		}
		*/
		
		//Selecting one option from the search dropdown using for loop
		for(int i=0;i<searOptions.size();i++)
		{
			String strgOptions = searOptions.get(i).getText();
			if(strgOptions.equals("selenium java"))
			{
				searOptions.get(i).click();
				break; 
			}
		}
	}

}
