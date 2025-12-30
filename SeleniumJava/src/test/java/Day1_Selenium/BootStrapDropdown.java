
package Day1_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		driver.findElement(By.cssSelector("#accept_cookies_btn")).click();				//Accepting Cookies 
		driver.findElement(By.xpath("//input[@class='form-control select-input active']")).click();	//Open Dropdown options
		
		//Select Single option along with default selected options
		driver.findElement(By.xpath("//div[@class='select-option']/span[text()='Two']")).click();
		
		//Capturing no of options in the Bootstrap dropdown
		List<WebElement> btstOptions = driver.findElements(By.xpath("//div[@class='select-dropdown-container']//div[@role='option']"));
		System.out.println("Total no of options in the dropdown is: "+btstOptions.size());
		
		/*
		//Printing Bootstrap dropdown options using For loop
		for(int i=0;i<btstOptions.size();i++)
		{
			System.out.println(btstOptions.get(i).getText());
		}
		*/
		
		/*
		//Printing Bootstrap dropdown options using For-Each loop
		for(WebElement option: btstOptions)
		{
			System.out.println(option.getText());
		}
		*/
		
		/*
		//Selecting Multiple options from Bootstrap dropdown using for-each loop
		for(WebElement option: btstOptions)
		{
			String optStrg = option.getText();
			if(optStrg.equals("Four") || optStrg.equals("Six") || optStrg.equals("Eight"))
			{
				option.click();
			}
		}
		*/
		
		//Selecting option from Bootstrap dropdown using for loop
		for(int i=0;i<btstOptions.size();i++)
		{
			String optText = btstOptions.get(i).getText();
			if(optText.equals("Four") || optText.equals("Six") || optText.equals("Eight"))
			{
				btstOptions.get(i).click();
				
			}
		}
	}

}
