package Day1_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.htmlelements.com/demos/fileupload/multiple/");
		driver.switchTo().frame(0);

		/*
		//Single File Uplaod-Test1.txt
		driver.findElement(By.xpath("//button[normalize-space()='Browse']")).sendKeys("C:\\Users\\Sunil\\Documents\\Test1.txt");
		if(driver.findElement(By.xpath("//div[@class='smart-selected-files']/div")).getText().equals("Test1.txt"))
		{
			System.out.println("File is successfully uploaded");
		}
		else
		{
			System.out.println("Upload Failed");
		}
		*/ 
		
		//Multiple Files Upload
		String file1 = "C:\\Users\\Sunil\\Documents\\Test1.txt";
		String file2 = "C:\\Users\\Sunil\\Documents\\Test2.txt";
		driver.findElement(By.xpath("//button[normalize-space()='Browse']")).sendKeys(file1+"\n"+file2);
	
		int noOfFilesUploaded = driver.findElements(By.xpath("//div[@class='smart-selected-files']/div")).size();
		if(noOfFilesUploaded == 2)
		{
			System.out.println("All files are uploaded");
		}
		else
		{
			System.out.println("Files are not uploaded correctly");
		}
		
		
		
		

	}

}
