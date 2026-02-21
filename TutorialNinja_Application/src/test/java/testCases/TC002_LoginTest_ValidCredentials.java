package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountsPage;
import testBase.BaseClass;

public class TC002_LoginTest_ValidCredentials extends BaseClass{
	@Test(groups = {"Sanity","Master"})
	public void verifyLogin()
	{
		logger.info("***************** Starting Login Test Case ************************");
		try
		{
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.enterEmail(p.getProperty("email"));
			lp.enterPwd(p.getProperty("password"));
			lp.clkLogin();

			logger.info("***************** Validating MyAccount Page ***********************");
			MyAccountsPage myAccPg = new MyAccountsPage(driver);
			boolean targetPage = myAccPg.isMyAcctPageExists();
			//Assert.assertEquals(targetPage, true,"Login Failed");
			Assert.assertTrue(targetPage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***************** Finished Login Test Case ************************");
	}
}
