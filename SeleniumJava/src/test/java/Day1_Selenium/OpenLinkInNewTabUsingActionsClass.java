package Day1_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTabUsingActionsClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		Actions act = new Actions(driver);
		WebElement regisLink = driver.findElement(By.cssSelector(".ico-register"));
		//This click method is not from webelement this is from Actions class
		//Normal click() will not accept parameters but from Actions class click() will accept webelement as parameter
		
		//Opening Registraion link in New tab using Actions class (CTRL + click)
		act.keyDown(Keys.CONTROL).click(regisLink).keyUp(Keys.CONTROL).perform();
		
		//Switching to Registration Page
		Set<String> windIds = driver.getWindowHandles();
		
		List<String> lisIds = new ArrayList<String>(windIds);
		for(String id:lisIds)
		{
			System.out.println(id);
		}
		driver.switchTo().window(lisIds.get(1));
		boolean imgValidation = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(imgValidation);
		
	}

}
