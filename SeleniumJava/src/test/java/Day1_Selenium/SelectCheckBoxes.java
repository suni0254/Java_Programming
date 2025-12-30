package Day1_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//div/input[@class='form-check-input' and @type='checkbox']"));
		/*
		//Using For loop
		for(int i=0;i<checkBoxes.size();i++)
		{
			checkBoxes.get(i).click();
		}
		*/
		
		//Using For-each loop
		/*
		for(WebElement checkbox:checkBoxes)
		{
			checkbox.click();
		}
		*/
		
		/*
		//Selecting first 3 checkboxes
		for(int i=0;i<3;i++)
		{
			checkBoxes.get(i).click();
		}
		*/	
		
		/*
		//Selecting last 3 checkboxes
		//Total no of checkboxes-how many checkboxes want to select = starting index i.e 7-3=4
		for(int i=4;i<checkBoxes.size();i++)
		{
			checkBoxes.get(i).click();
		}
		*/
		
		//First select 3 checkboxes and then unselect these 3 checkboxes and also selct remaining checkboxes
		for(int i=0;i<3;i++)
		{
			checkBoxes.get(i).click();
		}
		
		Thread.sleep(4000);
		
		for(int i=0;i<checkBoxes.size();i++)
		{
			if(checkBoxes.get(i).isSelected())
			{
				checkBoxes.get(i).click();
			}
		}
			
		/*
		for(WebElement checkbox:checkBoxes)
		{
			checkbox.click();
		}
		*/
	}

}
