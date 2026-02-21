package PageObject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Hooks.HooksClass;

//xpaths and Methods all are in this page 
public class LoginPage {
	// Webdriver is an interface
	// driver is an referance varible of webdriver
	private WebDriver driver = HooksClass.driver;

	// parameter constructor
	public LoginPage(WebDriver driver) {
		
		// this is used for same class
		// this.driver is the class level instance variable
		// = driver is the method parameter
		//this.driver = driver;
		//pagefactory  is initialized the webelement
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement loginLink;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement emailEnter;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement enterPassword;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	WebElement loginBtn;

	@FindBy(xpath = "//img[@src='/Themes/DefaultClean/Content/images/logo.png']")
	WebElement webdemoLogo;
	
	String excelPath =  "C:\\Users\\Datta.p\\eclipse-workspace\\Cucumber\\src\\test\\java\\resources.Testdata\\ExcelTestData.xlsx";

	public void clickLoginLink() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(loginLink));
		loginLink.click();
		Thread.sleep(5000);

	}

	
	public void enterEmail()  {
		System.out.println(excelPath);
		String email = HooksClass.getData(excelPath, "Logindata", 0, 0);
		emailEnter.sendKeys(email);
		System.out.println(email);
			}

	public void enterPassword()  {
		String password = HooksClass.getData(excelPath, "Logindata", 0, 1);
		enterPassword.sendKeys(password);
		System.out.println(password);
		
	}

	public void clickLoginButton() {
		loginBtn.click();
	}

	/*
	 * public void verifyTitle() { System.out.println(driver.getTitle());
	 * assertEquals("Tricentis Demo Web Shop", driver.getTitle());
	 * 
	 * }
	 */

	public void verifyLogo() {
		assertTrue(webdemoLogo.isDisplayed());
	}

}
