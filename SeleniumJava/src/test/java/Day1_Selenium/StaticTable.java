package Day1_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/?");
		
		//Find total no of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total no of rows in a table is: "+rows);
			
		//Find total no of columns in a table
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
		System.out.println("Total no of cols in a table is: "+cols);
		
		//Read data from specific row and column 
		String eleText = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]/td[1]")).getText();
		System.out.println(eleText);
		
		/*
		//Read data from all the rows and columns
		System.out.println("BookName"+"     "+"Author"+"     "+"Subject");
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				//Note: If u want to pass the variables as parameters dynamically in Xpath we need to follow "+r+"
				String dynEle = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(dynEle+"     ");
			}
			System.out.println();
		}
		*/
		
		/*
		//Print 'Book Name' whose auhtor is 'Mukesh'
		for(int r=2;r<=rows;r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(authorName.equals("Mukesh"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName+"   "+authorName);
			}
		}
		*/
		
		//Find Total price of books in a table
		int sum = 0;
		for(int r=2;r<=rows;r++)
		{
			String bookPrice = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			System.out.println(bookPrice);
			sum = sum + Integer.parseInt(bookPrice);
			
		}
		
		System.out.println("Total Price of all the books is:" +sum);
		
	}

}
