package Day2_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrangeHRM_Test {
	WebDriver driver;
	
  @Test(priority=1)
  public void openApp() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
  }
  
  @Test(priority=2)
  public void verifyLogo()
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement logo =  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='company-branding']"))));
	  if(logo.isDisplayed())
	  {
		  System.out.println("Logo is Displayed");
	  }
	  else
	  {
		  System.out.println("Logo is not displayed");
	  }  
  }
  
  @Test(priority=3)
  public void login()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
  }
  
  
  @Test(priority=4)
  public void closeApp()
  {
	  driver.quit();
  }
  
}
