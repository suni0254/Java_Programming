package Day1_Selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SI_CalculatorUsingDataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tax2win.in/tax-tools/simple-interest-calculator");
		
		String filePath = System.getProperty("user.dir")+"\\TestData\\SimpleInterestData.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1;i<=rows;i++)
		{
			//Read Data from Excel
			String princ = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String roi =  ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1 =  ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String exp_maturValue = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			
			//Pass above data into Application
			driver.findElement(By.cssSelector("#slider1_amount")).sendKeys(princ);
			driver.findElement(By.cssSelector("#slider1_amount")).sendKeys(roi);
			
			WebElement perdDrp = driver.findElement(By.cssSelector("#period-unit"));
			Select perDrpOpts = new Select(perdDrp);
			perDrpOpts.selectByVisibleText(per2);
			
			driver.findElement(By.cssSelector("#slider3_amount")).sendKeys(per1);
			
			//Validation
			String act_maturValue = driver.findElement(By.xpath("//div[@class='calc_value']//div[3]//b")).getText();
			
			if(Double.parseDouble(exp_maturValue)==Double.parseDouble(act_maturValue))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1",i,6,"Passed");
				ExcelUtils.fillGreenColor(filePath, "Sheet1",i,6);
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1",i,6,"Failed");
				ExcelUtils.fillRedColor(filePath, "Sheet1",i,6);

			}
			Thread.sleep(3000);
			
		}
		
	}

}
