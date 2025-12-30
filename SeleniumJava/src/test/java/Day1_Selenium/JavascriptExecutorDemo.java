package Day1_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//JavascriptExecutor is an Interface. In this executeScript() is a method we need to use
//JavascriptExecuror is used in 2 scenarios 1) Sending Text into Text Fields 2) Click actions on radio/checkbox/submit button

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/?");
		
		WebElement inputTxtbox = driver.findElement(By.cssSelector("#name"));		//For Inputbox
		WebElement malerdbtn = driver.findElement(By.cssSelector("#male"));			//For Buttons
		
		/*
		//Using WebDriver Interface
		inputTxtbox.sendKeys("Sunil");
		malerdbtn.click();
		*/
			
		//Using JavaScriptExecutor Interface 
		//JavascriptExecutor js = (JavascriptExecutor)driver;			//If we create ref variable for WebDriver Interface [WebDriver driver = new ChromeDriver();]
		JavascriptExecutor js = driver;								//If we create ref variable for ChromeDriver Class [ChromeDriver driver = new ChromeDriver();]
		js.executeScript("arguments[0].setAttribute('value','Sunil')", inputTxtbox);
		js.executeScript("arguments[0].click()", malerdbtn);	
	}

}
