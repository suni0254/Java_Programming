package SeleniumPractice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice_1 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/?");
		//Enter Name Text field
		driver.findElement(By.cssSelector("#name")).sendKeys("Sunil");
		//Enter Email Text field
		WebElement email = driver.findElement(By.cssSelector("#email"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','sunil.abc@gmail.com')",email);
		//Enter Phone Text field
		driver.findElement(By.cssSelector("#phone")).sendKeys("123456789");
		//Enter Address Text field
		driver.findElement(By.cssSelector("#textarea")).sendKeys("12-34-567/89, Jubilee Hills, Hyderabad");

		//Select Male Radio button
		driver.findElement(By.cssSelector("#male")).click();

		/*
		//Selecting specific Days Checkboxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//label[text()='Days:']/../div"));
		System.out.println("Total no of checkboxes are: "+checkBoxes.size());
		for(int i=1;i<=checkBoxes.size();i++)
		{
			if(checkBoxes.get(i).getText().equals("Tuesday") || checkBoxes.get(i).getText().equals("Wednesday"))
			{
				checkBoxes.get(i).click();
			}
		}
		 */

		//Selecting last 3 Days Checkboxes
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//label[text()='Days:']/../div"));
		System.out.println("Total no of checkboxes are: "+checkBoxes.size());
		for (int i = checkBoxes.size() - 3; i < checkBoxes.size(); i++)
		{
			checkBoxes.get(i).click();
		}

		//Handling Country Select Dropdown
		WebElement countryDrp = driver.findElement(By.cssSelector("#country"));
		Select countryDrpdown = new Select(countryDrp);
		//countryDrpdown.selectByIndex(2);
		//countryDrpdown.selectByValue("uk");
		countryDrpdown.selectByVisibleText("China");

		//Sorting the Dropdown options in Alphabetical order
		List<WebElement> countryDrpOptions = countryDrpdown.getOptions();
		System.out.println("No of Options in the Country Dropdown are: "+ countryDrpOptions.size());
		System.out.println("Total Options in the country Dropdown are:");
		List<String> original = new ArrayList<String>();
		for(WebElement option: countryDrpOptions)
		{
			System.out.println(option.getText());
			original.add(option.getText());
		}
		List<String> sortedOption = new ArrayList<String>(original);
		Collections.sort(sortedOption);
		System.out.println("After Sorting:"+sortedOption);

		//Handling Calendars
		String requiredDate = "20";
		String requiredMonth = "Jun";
		String requiredYear = "2021";
		//Handling Date Picker1
		driver.findElement(By.cssSelector("#datepicker")).sendKeys("01/01/2023");

		// Handling Date picker 2
		driver.findElement(By.id("txtDate")).click();
		// Select Month
		Select monthSelect = new Select(driver.findElement(By.className("ui-datepicker-month")));
		monthSelect.selectByVisibleText(requiredMonth);
		// Select Year
		Select yearSelect = new Select(driver.findElement(By.className("ui-datepicker-year")));
		yearSelect.selectByVisibleText(requiredYear);
		// Select Day
		driver.findElement(By.xpath("//a[text()='" + requiredDate + "']")).click();

		// Handling Date picker 3



		//Upload Single File
		// Scroll to File Upload section
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("singleFileInput")));
		// File path (use your local file)
		String filePath = "C:\\Users\\Sunil\\Documents\\Test1.txt"; 
		// Upload file
		driver.findElement(By.id("singleFileInput")).sendKeys(filePath);
		// Click Upload button
		driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();
		//  Verify upload message
		String message1 = driver.findElement(By.id("singleFileStatus")).getText();
		System.out.println("Upload Status: " + message1);


		//Upload Multiple Files
		String file1 = "C:\\Users\\Sunil\\Documents\\Test1.txt";
		String file2 = "C:\\Users\\Sunil\\Documents\\Test1.txt";
		driver.findElement(By.id("multipleFilesInput")).sendKeys(file1 + "\n" + file2);
		// Click Upload button
		driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		//  Verify upload message
		String message2 = driver.findElement(By.id("multipleFilesStatus")).getText();
		System.out.println("Upload Status: " + message2);


		//Handling Static Table
		//Find Total no of rows & Columns in a table
		int totalRows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		int totalCols = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th")).size();
		//Read specific row and column
		String specificEle = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[3]")).getText();
		System.out.println(specificEle);

		//Read data from all rows and columns
		System.out.println("Book Name"+"	"+"Author"+"	"+"Subject"+"	"+"Price");
		for(int r=2;r<=totalRows;r++)
		{
			for(int c=1;c<=totalCols;c++)
			{
				String eleText = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				System.out.print(eleText+"	");
			}
			System.out.println();
		}

		//Print 'Book Name' whose auhtor is 'Amit'
		for(int r=2;r<=totalRows;r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(authorName.equals("Amit"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName+"		"+authorName);
			}
		}

		//Find Total Price of the books
		int totalprice=0;
		for(int r=2;r<=totalRows;r++)
		{
			String bookPrice = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			System.out.println(bookPrice);
			totalprice = totalprice + Integer.parseInt(bookPrice);
		}
		System.out.println("Totla Price of all the books are: "+totalprice);


		//Handling Dynamic Table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		System.out.println("Total Rows: " + rows.size());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
		System.out.println("Total Columns: " + cols.size());
		//Printing all the elements in Dynamic Web Table
		for (int r = 1; r <= rows.size(); r++) {
			for (int c = 1; c <= cols.size(); c++) {
				String data = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				System.out.print(data + "   ");
			}
			System.out.println();
		}
		//Getting the CPU Load value and compare
		for (int r = 1; r <= rows.size(); r++) {
			String browserName = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + r + "]/td[1]")).getText();
			if (browserName.equalsIgnoreCase("Chrome")) {
				String cpuLoad = driver.findElement(By.xpath("//td[text()='Chrome']/following-sibling::td[contains(text(),'%')]")).getText();
				System.out.println(browserName+"	" + cpuLoad);
				String value = driver.findElement(By.xpath("//strong[@class='chrome-cpu']")).getText();
				if(cpuLoad.equals(value)) {
					System.out.println("CPU Load of Chrome is Equal");
				}
				else
				{
					System.out.println("CPU Load of Chrome is not equal");
				}
				break;
			}
		}


		//Pagination Web Table
		int pages = driver.findElements(By.xpath("//ul[@class='pagination']//a")).size();      
		for(int i=1;i<=pages;i++)
		{
			driver.findElement(By.xpath("//ul[@class='pagination']//a[text()="+i+"]")).click();
			System.out.println("Page Number: "+i);
			//Display all the data in all the pages
			List<WebElement> paginRows = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
			for(WebElement paginRow : paginRows)
			{
				System.out.println(paginRow.getText());
			}
			System.out.println("-----------------------------");

			// Get all check boxes on current page
			List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='productTable']//tbody//input[@type='checkbox']"));
			// Select all check boxes
			for (WebElement checkbox : checkboxes) {
				if (!checkbox.isSelected()) {
					checkbox.click();
				}
			}
		}

		//Shadow DOM
		// Scroll to Shadow DOM section
		js.executeScript("document.querySelector('#shadow_host').scrollIntoView(true);");
		// Access Shadow DOM input box
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		shadow.findElement(By.cssSelector("input[type='text']")).sendKeys("Welcome"); 


		//Wikipedia Search
		driver.findElement(By.cssSelector("#Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		Thread.sleep(3000);
		List<WebElement> searchLinks = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']/div/a"));
		for(WebElement link: searchLinks)
		{
			System.out.println("Search Results are: "+link.getText());
			if(link.getText().equals("Selenium"))
			{
				link.click();
			}
		}

		List<String> windowIds = new ArrayList<String>(driver.getWindowHandles());
		for(String winid: windowIds)
		{
			System.out.println(winid);
		}
		driver.switchTo().window(windowIds.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(windowIds.get(0));

		//Thread.sleep(5000);
		//Dynamic Button
		WebElement button = driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
		wait.until(ExpectedConditions.visibilityOf(button));
		//---------START----------
		wait.until(ExpectedConditions.textToBe(By.name("start"),"START"));
		System.out.println("Button Text:"+ button.getText());
		button.click();
		//---------STOP------------
		wait.until(ExpectedConditions.textToBe(By.name("stop"),"STOP"));
		System.out.println("Button Text:"+ button.getText());
		button.click();

		//Alert Pop-up
		driver.findElement(By.cssSelector("#alertBtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		String getMsg1 = driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println(getMsg1);
		//Confirmation Alert Pop-up
		driver.findElement(By.cssSelector("#confirmBtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		String getMsg2 = driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println(getMsg2);
		//Prompt Alert Pop-up
		driver.findElement(By.cssSelector("#promptBtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Sunil");
		driver.switchTo().alert().accept();
		String getMsg3 = driver.findElement(By.cssSelector("#demo")).getText();
		System.out.println(getMsg3);

		//Handling New Tabs
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		List<String> tabIds = new ArrayList<String>(driver.getWindowHandles());
		for(String tabId : tabIds)
		{
			System.out.println(tabId);
		}
		System.out.println(driver.switchTo().window(tabIds.get(1)));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(tabIds.get(0));


		//Handling New Popup window
		String parentWindow = driver.getWindowHandle();
		// Click button to open new window
		driver.findElement(By.cssSelector("#PopUp")).click();
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();
		List<String> listWinIds = new ArrayList<String>(allWindows);
		// Switch to child window
		for (String window : listWinIds) {
			System.out.println(window);
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		// Validation in popup window
		System.out.println("Popup Window Title: " + driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);

		//Mouse Hover
		Actions act = new Actions(driver);
		WebElement ptme = driver.findElement(By.cssSelector(".dropbtn"));
		WebElement lpt = driver.findElement(By.xpath("//a[text()='Laptops']"));
		act.moveToElement(ptme).moveToElement(lpt).click().perform();

		//Double Click
		driver.findElement(By.cssSelector("#field1")).clear();
		WebElement fld1 = driver.findElement(By.cssSelector("#field1"));
		fld1.sendKeys("Welcome to the World");
		String fld1Text = fld1.getAttribute("value");
		WebElement btn = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(btn).perform();
		WebElement fld2 = driver.findElement(By.cssSelector("#field2"));
		String fld2Text = fld2.getAttribute("value");
		if(fld1Text.equals(fld2Text))
		{
			System.out.println("Text is copied successfully");
		}

		//Drag & Drop
		WebElement drgEle = driver.findElement(By.cssSelector("#draggable"));
		WebElement drpEle = driver.findElement(By.cssSelector("#droppable"));
		act.dragAndDrop(drgEle, drpEle).perform();
		String drpValid = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		if(drpValid.equals("Dropped!"))
		{
			System.out.println("Element is Dropped successfully");
		}
		else 
		{
			System.out.println("Element is dragged and dropped is failed");
		}


		//Slider
		WebElement slider = driver.findElement(By.id("slider-range"));
		// Slider handle
		WebElement sliderHandle = slider.findElement(By.tagName("span"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		// Move slider to the right (positive X offset)
		action.clickAndHold(sliderHandle).moveByOffset(100, 0).release().perform();
		Thread.sleep(3000);
		// Move slider back to the left
		action.clickAndHold(sliderHandle).moveByOffset(-50, 0).release().perform();


		//SVG Elements
		// Locate all bars (rect) in SVG
		List<WebElement> bars = driver.findElements(By.xpath("//*[name()='svg']//*[name()='rect']"));
		System.out.println("Total SVG Bars: " + bars.size());
		// Click 1st bar
		bars.get(0).click();


		//Scrolling Dropdown
		driver.findElement(By.id("comboBox")).click();
		// Locate and click option (example: "Item1")
		driver.findElement(By.xpath("//div[text()='Item 5']")).click();


		//Labels
		List<WebElement> labelElemts = driver.findElements(By.xpath("//h4/following-sibling::label"));
		System.out.println("Total No of Labels are: "+labelElemts.size());
		for(WebElement lab:labelElemts)
		{
			String labText = lab.getText();
			System.out.println("The Label Elements are: "+labText);
		}

		//Laptop Links
		List<WebElement> lapLinks = driver.findElements(By.xpath("//h4[text()='Laptop Links']/following-sibling::a"));
		System.out.println("Total Laptop Links are: "+lapLinks.size());
		for(WebElement link: lapLinks)
		{
			String lnkText = link.getText();
			System.out.println("The Links texts are: "+lnkText);
			if(lnkText.equals("Dell"))
			{
				WebElement clkLink = wait.until(ExpectedConditions.elementToBeClickable(link));
				clkLink.click();
				try
				{
					if(driver.findElement(By.cssSelector(".ot-sdk-container")).isDisplayed())
					{
					act.moveToElement(driver.findElement(By.cssSelector("#onetrust-reject-all-handler"))).click().perform();
					}
				}
				catch(Exception ex)
				{
					System.out.println(ex.getMessage());
				}

				if(driver.getCurrentUrl().equals("https://www.dell.com/en-us") || driver.getCurrentUrl().equals("https://www.dell.com/en-in"))
				{
					System.out.println("Page is Directed to Search Link");
					//Validation to Return to Original page
					driver.navigate().back();
					if(driver.getTitle().equalsIgnoreCase("Automation Testing Practice"))
					{
						System.out.println("Page is Re-directed to Original page");
					}
					else
					{
						System.out.println("Page is Not Re-directed to Original Page");
					}
				} 
				else
				{
					System.out.println("Page is not directed to Search Link");
				}
			}
		}
		
		
		//Broken Links
		List<WebElement> brkLinks = driver.findElements(By.xpath("//h4[text()='Broken Links']/following-sibling::a"));
		System.out.println("Total no of broken links are: "+brkLinks.size());
		for(WebElement brkLnk:brkLinks)
		{
			try
			{
			String brkLinkText = brkLnk.getText();
			System.out.println("The Broken Link Texts are: "+brkLinkText);
			String brkLinkHref = brkLnk.getAttribute("href");
			System.out.println("Broken Link Href values are: "+brkLinkHref);
			URL hrefToURL = new URL(brkLinkHref);
			HttpURLConnection httpCon = (HttpURLConnection)hrefToURL.openConnection();
			httpCon.connect();
			if(httpCon.getResponseCode()>=400)
			{
				System.out.println(brkLinkHref+"=============>Broken Link");
			}
			else
			{
				System.out.println(brkLinkHref+"=============>Not a Broken Link");
			}
			}
			catch(Exception ex)
			{
				
			}	
		}
		
		
		//Hidden Elements
		driver.findElement(By.xpath("//a[text()='Hidden Elements & AJAX']")).click();			//Entering Text in 1st Input box
		driver.findElement(By.xpath("//label[text()='Input Box 1:']//following-sibling::input[@id='input1']")).sendKeys("Welcome to 1st Hidden Input Box"); //Entering Text in 2nd Input box
		driver.findElement(By.xpath("//button[text()='Toggle Input Box 2']")).click();	//Toggle for Input Text
		WebElement inpBx2 = driver.findElement(By.xpath("//label[text()='Input Box 2:']//following-sibling::input[@id='input2']"));
		wait.until(ExpectedConditions.visibilityOf(inpBx2));
		inpBx2.sendKeys("Welcome to 2nd Hidden Input Box");
		String statusValidation = driver.findElement(By.xpath("//span[@id='statusLabel']")).getText();
		System.out.println("Validation for the 2nd Hidden Input Box "+ statusValidation);		//Validation for 2nd Input box
		driver.findElement(By.xpath("//label[text()=' Checkbox 1']/input")).click();
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox 2']")).click();	//Toggle for Check box
		WebElement cheBx2 = driver.findElement(By.xpath("//label[text()=' Checkbox 2']/input"));
		wait.until(ExpectedConditions.visibilityOf(cheBx2));
		cheBx2.click();
		System.out.println("Validation for the 2nd Hidden Check Box "+ statusValidation);		//Validation for 2nd Check box
		//AJAX Elements
		driver.findElement(By.xpath("//button[text()='Load AJAX Content']")).click();			//Button for AJAX content
		// Wait until text becomes visible
        WebElement ajaxText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ajaxContent")));
        // Print text
        System.out.println("AJAX Text: " + ajaxText.getText());
        // Validation for AJAX Content
        if (ajaxText.isDisplayed()) {
            System.out.println("AJAX content displayed successfully ✅");
        }	
	}
}
