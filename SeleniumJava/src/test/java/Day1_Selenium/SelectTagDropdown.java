package Day1_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/?");
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropCountry = new Select(drpCountryEle);
		
		//Capture the no. of options from dropdown
		List<WebElement> drpdwnOptions = dropCountry.getOptions();
		System.out.println("Total no of options in the Dropdown is: " +drpdwnOptions.size());
		
		/*
		//Printing the options from dropdown using For loop
		for(int i=0;i<drpdwnOptions.size();i++)
		{
			System.out.println(drpdwnOptions.get(i).getText());
		}
		*/
		
		/*
		//Printing the options from dropdown using For-Eachloop
		for(WebElement option: drpdwnOptions)
		{
			System.out.println(option.getText());
		}
		*/
		
		/*
		//Selecting one option from the Select Dropdown using For-each loop
		for(WebElement option : drpdwnOptions)
		{
			String optText = option.getText();
			if(optText.equals("Germany"))
			{
				option.click();
			}
		}
		*/
		//Selecting one option from the Select Dropdown using For loop
		for(int i=0;i<drpdwnOptions.size();i++)
		{
			String drpOptText = drpdwnOptions.get(i).getText();
			if(drpOptText.equals("Germany"))
			{
				drpdwnOptions.get(i).click();
			}
		}			
	}
}
