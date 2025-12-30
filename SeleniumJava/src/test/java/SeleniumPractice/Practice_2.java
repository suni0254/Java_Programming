package SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		//BootStrap Drop down
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		driver.findElement(By.cssSelector("#accept_cookies_btn")).click();				//Accepting Cookies 
		driver.findElement(By.cssSelector(".form-control.select-input.active")).click();
		List<WebElement> opts = driver.findElements(By.xpath("//div[@class='select-dropdown open']//span"));
		for(WebElement opt:opts)
		{
			String optText = opt.getText();
			System.out.println("options in the dropdown are:"+optText);
			if(optText.equals("Five") || optText.equals("Six"))
			{
				opt.click();
			}
		}
		*/
		
		
		//Screenshot
		//driver.get("https://demo.nopcommerce.com/");
		/*
		//Screenshot using 'TakeScreenshot' Interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File tgtFile = new File(System.getProperty("user.dir")+"\\Screenshots\\practiceFullPg.png");
		srcFile.renameTo(tgtFile);
		*/
		
		/*
		//Screenshot using specific Webelement
		String featPath = System.getProperty("user.dir")+"\\Screenshots\\practiceFeatPg.png";
		WebElement featPage = driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
		File sourFile = featPage.getScreenshotAs(OutputType.FILE);
		File targFile = new File(System.getProperty("user.dir")+"\\Screenshots\\practiceFeatPg.png");
		sourFile.renameTo(targFile);
		*/
		
		/*
		//Close Specific Browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		List<String> winIds = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(winIds.get(0));
		System.out.println("Parent Window Title is:"+driver.getTitle());
		driver.switchTo().window(winIds.get(1));
		System.out.println("Child Window Title is:"+driver.getTitle());
		driver.close();
		*/
		
		/*
		//Frames
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_1.html']")));
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("My First Frame");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_3.html']")));
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("My Third Frame");
		driver.switchTo().frame(0);	//Switching to iframe under Frame3
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_2.html']")));
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("My Second Frame");
		*/
		
		/*
		//Auto Suggesion
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("corona");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@role='listbox']/li//div[@class='lnnVSe']/div[contains(@class,'wM6W7d')]/span"))));
		List<WebElement> searchList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));
		for(WebElement list:searchList)
		{
			String searchText = list.getText();
			System.out.println("The items for the searched data: "+searchText);
		}
		*/
		
		/*
		//Open and Switch to New window or tab
		driver.get("https://www.google.com/");
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://en.wikipedia.org/wiki/India");
		*/
		
		
		/*
		//Reading Data From Excel File
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\ReadFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rows = sh.getLastRowNum();
		System.out.println("Total Rows are: "+rows);
		int cells = sh.getRow(0).getLastCellNum();
		System.out.println("Total Cells are: "+cells);
		for(int r=0;r<=rows;r++)
		{
			XSSFRow curtRow = sh.getRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell curetCol = curtRow.getCell(c);
				System.out.print(curetCol.toString()+"\t");
			}
			System.out.println();
		}
		*/
		
		/*
		//Writing Data into Excel File into specific location
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\PracticeWriteData.xlsx");
		XSSFWorkbook wrkbk = new XSSFWorkbook();
		XSSFSheet xsht = wrkbk.createSheet("WriteExcelSheet");
		XSSFRow xRow = xsht.createRow(3);
		XSSFCell xCell = xRow.createCell(4);
		xCell.setCellValue("Nice");
		wrkbk.write(fo);
		*/
		//Writing Data into Excel File Dynamically
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\PracticeWriteDynamicData.xlsx");
		XSSFWorkbook wrkbk = new XSSFWorkbook();
		XSSFSheet xSh = wrkbk.createSheet("Dynamic Data");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of rows:");
		int rows = sc.nextInt();
		System.out.println("Enter total no of columns:");
		int cells = sc.nextInt();
		for(int r=0;r<=rows;r++)
		{
			XSSFRow curRow = xSh.createRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell curCell = curRow.createCell(c);
				curCell.setCellValue(sc.next());
			}
			System.out.println();
		}
		wrkbk.write(fo);
		wrkbk.close();
		fo.close();
		System.out.println("File Created");

	}

}
