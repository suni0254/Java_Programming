package Day8_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFacotory {
	
	WebDriver driver;
	//Constructor
	LoginPageWithPageFacotory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators	
	@FindBy(xpath="//input[@name='username']") WebElement txt_username;		//Approach 1
	
	@FindBy(how=How.XPATH, using = "//input[@name='password']") WebElement txt_password;	//Approach 2
	//@FindBy(xpath="//input[@name='password']") WebElement txt_password;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement btn_login;
	
	//Actions
	public void setUserName(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}
