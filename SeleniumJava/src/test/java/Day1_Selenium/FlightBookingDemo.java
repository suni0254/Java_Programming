package Day1_Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBookingDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		
		//Selecting 'From' City 
		WebElement fromCityDrpdwn = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select frmcityOptions = new Select(fromCityDrpdwn);
		List<WebElement> fromCityList = frmcityOptions.getOptions();
		System.out.println("Total no of options in a From City Dropdown is:" + fromCityList.size());
		for(int i=0; i<fromCityList.size(); i++)
		{
			String fromcityText = fromCityList.get(i).getText();
			if(fromcityText.equals("Boston"))
			{
				fromCityList.get(i).click();
			}
		}
		
		//Selecting 'To' City
		WebElement toCityDrpdwn = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select tocityOptions = new Select(toCityDrpdwn);
		List<WebElement> toCityList = tocityOptions.getOptions();
		System.out.println("Total no of options in a To City Dropdown is:" + toCityList.size());
		
		for(int i=0; i<toCityList.size(); i++)
		{
			String tocityText = toCityList.get(i).getText();
			if(tocityText.equals("London"))
			{
				toCityList.get(i).click();
			}
		}
		
		//Clicking on 'Find Flights' button
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		//Validating the Flights page is displayed
		boolean flightPageValidation = driver.findElement(By.xpath("//h3[text()='Flights from Boston to London: ']")).isDisplayed();
		System.out.println(flightPageValidation);
		//Count the Total no of rows in a table
		int rows = driver.findElements(By.xpath("//tbody/tr")).size();
		System.out.println("Total no of rows of a table is: "+rows);
		
		//Storing and Printing the price list in a Collection List "stgPrice"
		List<String> stgPrice = new ArrayList<String>();
		for(int r=1;r<=rows;r++)
		{
			stgPrice.add(driver.findElement(By.xpath("//tbody/tr["+r+"]/td[6]")).getText());
			System.out.println(stgPrice);
		}
		//Copying existing Collection List "stgPrice" into another Collection List "storeData"
		List<String> storeData = new ArrayList<String>(stgPrice);
		//Sorting the new Collection List "storeData" using "Collections" Interface
		Collections.sort(storeData);
		//Printing the new Collection List "storeData" after sorting
		System.out.println("After Sorting:"+storeData);
		//Get the lowest Price after sorting and store it in a variable
		String lowestPrice = storeData.get(0);
		System.out.println("Lowest price in the table:"+lowestPrice);
		//Get the Index Position of lowest price of a Original table
		int indexLoc = stgPrice.indexOf(lowestPrice);
		System.out.println("Printing Original Collection List:"+stgPrice);
		System.out.println("Index Location of Lowest price in the Original List is : "+indexLoc);
		//Converting the indexLocation type from int to String
		String strindexLoc = String.valueOf(indexLoc+1);
		//Concatenating string with xpath and store it in a variable "updatedLocator"
		String updatedLocator = "//tr["+strindexLoc+"]/td[1]/input";
		//Clicking the button which matches with the lowest price
		driver.findElement(By.xpath(updatedLocator)).click();
		//Validating the Flights Reservation page is displayed or not
		boolean flightReservPageValidation = driver.findElement(By.xpath("//h2[contains(text(),'Your flight from')]")).isDisplayed();
		System.out.println(flightPageValidation);

		//Fill the Reservation Form
		driver.findElement(By.cssSelector("#inputName")).sendKeys("sunil");
		driver.findElement(By.cssSelector("#address")).sendKeys("Santhosh Nagar");
		driver.findElement(By.cssSelector("#city")).sendKeys("Vizag");
		driver.findElement(By.cssSelector("#state")).sendKeys("AP");
		driver.findElement(By.cssSelector("#zipCode")).sendKeys("12345");
		WebElement cardTypeDrpdown = driver.findElement(By.cssSelector("#cardType"));
		Select cardTypeDrp = new Select(cardTypeDrpdown);
		List<WebElement> cardTypeDrpOptions = cardTypeDrp.getOptions();
		System.out.println("Count the no of options in Card Type Dropdown are: "+cardTypeDrpOptions.size());
		//Printing the total options in Card Type Dropdown
		for(int i=0;i<cardTypeDrpOptions.size();i++)
		{
			String cardTypeText = cardTypeDrpOptions.get(i).getText();
			System.out.println("Printing the total options in Card Type Dropdown: "+ cardTypeText);
			if(cardTypeText.equals("Diner's Club"))
			{
				cardTypeDrpOptions.get(i).click();
			}
		}
		driver.findElement(By.cssSelector("#nameOnCard")).sendKeys("John");
		driver.findElement(By.cssSelector("#rememberMe")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Validating the Flights Reservation page is displayed or not
		boolean purchageValidation = driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']")).isDisplayed();
		System.out.println(purchageValidation);
		driver.close();

	}

}
