package Day8_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithooutPageFacotory {
	
	WebDriver driver;
	//Constructor
	LoginPageWithooutPageFacotory(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	By txt_username_loc = By.xpath("//input[@name='username']");
	By txt_password_loc = By.xpath("//input[@name='password']");
	By btn_login_loc = By.xpath("//button[normalize-space()='Login']");
	
	//Actions
	public void setUserName(String user)
	{
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
}
