package Day6_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://demoblaze.com/index.html");
		driver.findElement(By.xpath("//a[@data-target='#logInModal']")).click();
		driver.findElement(By.cssSelector("#loginusername")).sendKeys(email);
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys(pwd);
		driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
		
		Thread.sleep(5000);
		boolean logoutStatus = driver.findElement(By.cssSelector("#nameofuser")).isDisplayed();
		if(logoutStatus==true)
		{
			Assert.assertTrue(logoutStatus);
		}
		else
		{
			Assert.fail();
		}
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
	@DataProvider(name="dp",indices = {0,1,3})   
	Object[][] loginData()
	{
		Object[][] data = {{"ravi123","ravi123"},
							{"anil1234","ravi1234"},
							{"kumar123","ravi@123"},
							{"sunil_254","sunil254"},
							{"kranti789","Krant@@@"}
				
						  };
		return data;
	}
	
}
