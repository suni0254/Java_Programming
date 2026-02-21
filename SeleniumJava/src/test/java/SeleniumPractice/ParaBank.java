package SeleniumPractice;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class ParaBank {
	public static String randomString()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public static String randomNumber()
	{
		String generatedNumber = RandomStringUtils.randomNumeric(5);
		return generatedNumber;
	}
	
	public static String randomAlphaNumeric()
	{
		String generatedString = RandomStringUtils.randomNumeric(5);
		String generatedNumber = RandomStringUtils.randomNumeric(5);
		return (generatedString+"@"+generatedNumber);
	}

	public static void main(String[] args) throws InterruptedException {
//		ParaBank pb = new ParaBank();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		//Registering User
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(randomString());
		String fn = driver.findElement(By.xpath("//input[@id='customer.firstName']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(randomString());
		String ln = driver.findElement(By.xpath("//input[@id='customer.lastName']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(randomString());
		String addr = driver.findElement(By.xpath("//input[@id='customer.address.street']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(randomString());
		String city = driver.findElement(By.xpath("//input[@id='customer.address.city']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(randomString());
		String state = driver.findElement(By.xpath("//input[@id='customer.address.state']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(randomNumber());
		String zipcode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(randomNumber());
		String ph = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(randomNumber());
		String ssn = driver.findElement(By.xpath("//input[@id='customer.ssn']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(randomString());
		String userName = driver.findElement(By.xpath("//input[@id='customer.username']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(randomString());
		String pwd = driver.findElement(By.xpath("//input[@id='customer.password']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(pwd);
		String confirmpwd = driver.findElement(By.xpath("//input[@id='repeatedPassword']")).getAttribute("value");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		Thread.sleep(3000);
		//Enter Login Details
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.quit();
	}
	
}
