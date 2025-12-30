package Day1_Selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		
		/*
		//Full Page Screenshot Using 'Take Screenshot' Interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		//System.getProperty("user.dir")-----"D:\Projects\JAVA\JAVA Learning\SeleniumJava"
		File targerFile = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage.png");		//In this path new file will be created
		sourceFile.renameTo(targerFile);	//Copy Source File to Target File
		*/
		
		/*
		//Capture Screenshot of specific section usign WebElement
		WebElement featuredProds = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File sourceFile = featuredProds.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\featuredpage.png");
		sourceFile.renameTo(targetFile);
		*/
		
		//Capture Screenshot of specific webelement using WebElement
		WebElement logo =  driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\Screenshots\\logo.png");
		sourceFile.renameTo(targetFile);
	}

}
