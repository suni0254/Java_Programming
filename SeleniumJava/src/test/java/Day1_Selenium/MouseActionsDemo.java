package Day1_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/?");
		Actions act = new Actions(driver);

		//Mouse Hover
		WebElement ptMe = driver.findElement(By.xpath("//button[text()='Point Me']"));
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		act.moveToElement(ptMe).moveToElement(mobiles).click().perform();
		
		//Double Click
		driver.findElement(By.xpath("//input[@id='field1']")).clear();
		WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		box1.sendKeys("Welcome");
		String getFld1 = box1.getAttribute("value");
		System.out.println(getFld1);
		WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(btn).perform();
		String getFld2 = box2.getAttribute("value");
		System.out.println(getFld2);
		if(getFld1.equals(getFld2))
		{
			System.out.println("Copied Text successfully");
		}
		else
		{
			System.out.println("Copy Text is failed");
		}
		
		//Drag and Drop
		WebElement dragEle = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drpEle = driver.findElement(By.cssSelector("div#droppable"));
		act.dragAndDrop(dragEle, drpEle).perform();
		String drpValidation = driver.findElement(By.cssSelector("div#droppable p")).getText();
		System.out.println(drpValidation);
		
		//Slider-Drag and DropBy
		WebElement minSlider = driver.findElement(By.xpath("//div[@class='widget HTML']//span[1]"));
		System.out.println("Location of Minimum slider Location "+minSlider.getLocation());		//(1167, 2019)     
		act.dragAndDropBy(minSlider, 1199, 2019).perform();
		driver.close();
		
		
	}

}
