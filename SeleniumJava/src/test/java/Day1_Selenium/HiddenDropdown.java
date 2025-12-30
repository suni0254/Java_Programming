package Day1_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")).click();
		
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//label[text()='Job Title']/../../../child::div//i")).click();
		
		/*
		//Select single option from Hidden Dropdown
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement drpdwnOption = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@role='listbox']//span[text()='Finance Manager']"))));
		drpdwnOption.click();
		*/
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@role='listbox']//span"))));
		
		List<WebElement> hidDrpOptions = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Total no of Options in Hidden Dropdown is: " +hidDrpOptions.size());
		
		/*
		//Printing Dropdown options in Hidden Dropdown using For loop
		for(int i=0;i<hidDrpOptions.size();i++)
		{
			System.out.println(hidDrpOptions.get(i).getText());
		}
		*/
		
		/*
		//Printing Dropdown options in Hidden Dropdown using For-Each loop
		for(WebElement option : hidDrpOptions)
		{
			System.out.println(option.getText());
		}
		*/
		
		/*
		//Selecting one option from the search dropdown using for-each loop
		for(WebElement option:hidDrpOptions)
		{
			String optText = option.getText();
			if(optText.equals("IT Manager") || optText.equals("QA Lead") || optText.equals("Software Engineer"))
			{
				option.click();
			}
		}
		*/
		
		//Selecting one option from the search dropdown using for loop
		for(int i=0;i<hidDrpOptions.size();i++)
		{
			String optText = hidDrpOptions.get(i).getText();
			if(optText.equals("IT Manager") || optText.equals("QA Lead") || optText.equals("Software Engineer"))
			{
				hidDrpOptions.get(i).click();
			}
		}
		
		
		

		
		
		
	}

}
