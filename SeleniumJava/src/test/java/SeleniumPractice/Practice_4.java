package SeleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Handling Input Text box
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sunil");
		//Handling Radio buttons
		driver.findElement(By.xpath("//input[@id='male']")).click();
		//Handling Check boxes
		List<WebElement> checkboxes = driver.findElements(By.xpath("//label[@for='days']/../div"));
		for(int i=4;i<checkboxes.size();i++)
		{
			//Selecting last 4 days check boxes
			//checkboxes.get(i).click();

			//Selecting middle of the days check boxes
			if(checkboxes.get(i).getText().equals("Friday"))
			{
				checkboxes.get(i).click();
			}
		}
		//Handling Select type dropdown
		WebElement countryDrpEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select countryDrpdwn = new Select(countryDrpEle);
		List<WebElement> countryDrpOptions = countryDrpdwn.getOptions();
		System.out.println("total country dropdown options are: "+countryDrpOptions.size());
		List<String> countryOptionText = new ArrayList<String>();
		for(WebElement option: countryDrpOptions)
		{
			System.out.println(option.getText());
			if(option.getText().equals("Japan"))
			{
				option.click();
			}
			countryOptionText.add(option.getText());
		}
		List<String> sortedList = new ArrayList<String>(countryOptionText);
		Collections.sort(sortedList);
		System.out.println(sortedList);
		//Handling Static table
		
		
		





	}

}
