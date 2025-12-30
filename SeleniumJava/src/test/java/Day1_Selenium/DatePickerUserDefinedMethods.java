package Day1_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerUserDefinedMethods {

	//Selecting Future Date
	static void selectFutureDate(WebDriver driver, String month, String year, String date)
	{
		//Selecting Month and Year
		while(true)
		{
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if(month.equals(currentMonth) && year.equals(currentYear))
			{
				break;
			}
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();		//Next button
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

	//Selecting Past Date
	static void selectPastDate(WebDriver driver, String month, String year, String date)
	{
		//Selecting Month and Year
		while(true)
		{
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			if(month.equals(currentMonth) && year.equals(currentYear))
			{
				break;
			}
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

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#datepicker")).click();

		//selectFutureDate(driver, "November" , "2027", "10");
		selectPastDate(driver, "January", "2022", "20");



	}

}
