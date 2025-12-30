package Day1_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#datepicker")).click();
		
		String month = "December";
		String year = "2024";
		String date = "1";
		
		//Selecting Month and Year
		while(true)
		{
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if(month.equals(currentMonth) && year.equals(currentYear))
			{
				break;
			}
			//Note: In Real scenario we use either pre/next button but not both. DOB(Prev) and Travel booking(Next) 
			//Note: In Bank Statements we use From and To date 
			//driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();		//Next button
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-w")).click();		//Previous button
		}
		
		//Selecting Date
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		

	}

}
