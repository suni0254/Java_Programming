package Hooks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.collect.Table.Cell;

import Config.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


//common methods in hooks openBroswer,launchApplication ,TakesScreenshot,RandomString,closeBroswer

public class HooksClass {
	public static WebDriver driver;
	// public static String url = "https://demowebshop.tricentis.com/";
	// public static String email = "thedhonisachinvirat@gmail.com";
	// public static String password = "Datta@12345.";

	@Before
	public static void launchApplication() {
		// String url = Hooksclass.getProperties().getProperty("testurl");
		ConfigReader.loadConfig();
		String browser = ConfigReader.get("browser");
		String url = ConfigReader.get("testurl");

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);

	}

	public static String getRandomString(String prefix, int length) {
		int randomStinglength = length - prefix.length();
		String generatedString = RandomStringUtils.randomAlphanumeric(randomStinglength);
		return prefix.concat(generatedString);
	}

	public static String getData(String path, String sheet, int row, int col) {
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sh = wb.getSheet(sheet);
			Row r = sh.getRow(row);
			org.apache.poi.ss.usermodel.Cell c = r.getCell(col);

			DataFormatter formatter = new DataFormatter();
			String value = formatter.formatCellValue(c);

			wb.close();
			return value;

		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	@After(order = 1)
	public void failedScreenshots(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			Date dt = new Date();
			DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			String folder = dateFormat.format(dt);
			DateFormat timeFormat = new SimpleDateFormat("hh.mm.ss");
			String timeStamp = timeFormat.format(dt);
			File file = new File(System.getProperty("user.dir") + "/src/test/resources/features/screenshots" + folder);
			if (!file.exists()) {
				file.mkdir();
			}
			String filePath = file + "/" + scenario.getName() + "_" + timeStamp + ".png";
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(filePath);
			FileUtils.copyFile(src, dest);
		}
	}

	@After(order = 0)
	public void closeBrowser() {
		driver.quit();
	}
}
