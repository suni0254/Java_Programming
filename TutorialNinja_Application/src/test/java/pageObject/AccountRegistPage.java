package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistPage extends BasePage{
	public AccountRegistPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']") WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']") WebElement txtLastName;
	@FindBy(xpath = "//input[@id='input-email']") WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-telephone']") WebElement txtPhone;
	@FindBy(xpath = "//input[@id='input-password']") WebElement txtPwd;
	@FindBy(xpath = "//input[@id='input-confirm']") WebElement txtConfPwd;
	@FindBy(xpath = "//input[@name='agree']") WebElement btnAgree;
	@FindBy(xpath = "//input[@value='Continue']") WebElement btnContinue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") WebElement msgConfirmation;
	
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname)
	{
		txtLastName.sendKeys(lname);
	}
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPhoneNo(String phoneNumb)
	{
		txtPhone.sendKeys(phoneNumb);
	}
	public void setPwd(String pwd)
	{
		txtPwd.sendKeys(pwd);
	}
	public void setConfPwd(String confPwd)
	{
		txtConfPwd.sendKeys(confPwd);
	}
	public void clickAgree()
	{
		btnAgree.click();
	}
	public void clickContinue()
	{
		btnContinue.click();
	}
	public String getConfirmMsg()
	{
		try
		{
			return (msgConfirmation.getText());
		}
		catch(Exception ex)
		{
			return (ex.getMessage());
		}
	}
	



}
