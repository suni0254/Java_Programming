package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MyAccountsPage extends BasePage{
	public MyAccountsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']") WebElement msgMyAcct;
	@FindBy(xpath ="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement btnLogout;
	
	public boolean isMyAcctPageExists()
	{
		try
		{
		return (msgMyAcct.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	
	}
	
	public void clickLogout()
	{
		btnLogout.click();
	}

}
