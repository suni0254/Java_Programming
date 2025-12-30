package Day8_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	void testLogin()
	{
		//LoginPageWithooutPageFacotory lp = new LoginPageWithooutPageFacotory(driver);
		LoginPageWithPageFacotory lp = new LoginPageWithPageFacotory(driver);
		lp.setUserName("Admin");
		lp.setPassword("Admin123");
		lp.clickLogin();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
