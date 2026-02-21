package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountsPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass{
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class,groups ="Datadrivern")   //Getting Data provider from another class
	public void verifyLoginDDT(String email, String pwd, String expResult)
	{
		try {
			logger.info("***************** Starting Login Data Driven Test Case ************************");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickLogin();

			LoginPage lp = new LoginPage(driver);
			lp.enterEmail(email);
			lp.enterPwd(pwd);
			lp.clkLogin();

			logger.info("***************** Validating MyAccount Page ***********************");
			MyAccountsPage myAccPg = new MyAccountsPage(driver);
			boolean targetPage = myAccPg.isMyAcctPageExists();

			/* Data Valid ----Login Success ----Test Pass----Logout
			   			------Login Fail--------Test Fail
			   Data Invalid---Login Success-----Test Fail---Logout
			   			  ----Login Fail------Test Pass
			 */
			if(expResult.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					myAccPg.clickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			if(expResult.equalsIgnoreCase("InValid"))
			{
				if(targetPage==true)
				{
					myAccPg.clickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}

			}
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("**********************Finished Login Data Driver Test Case*******************");


	}
}