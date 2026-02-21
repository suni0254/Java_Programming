package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistPage;
import pageObject.HomePage;
import testBase.BaseClass;


public class TC001_AccountRegistTest extends BaseClass {

	@Test(groups = {"Regression","Master"})
	public void verifyAccountRegistration()
	{
		try {
			logger.info("********************Starting the Account Registration Test Case*************************");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickRegister();

			AccountRegistPage accPg = new AccountRegistPage(driver);
			accPg.setFirstName(randomString());
			accPg.setLastName(randomString());
			accPg.setEmail(randomString()+"@yahoo.com");
			accPg.setPhoneNo(randomNumber());

			String passwd = randomAlphaNumeric();
			accPg.setPwd(passwd);
			accPg.setConfPwd(passwd);

			accPg.clickAgree();
			accPg.clickContinue();
			logger.info("*************************Validaton the expected message**************************");
			String confMsg = accPg.getConfirmMsg();
			if(confMsg.equals("Your Account Has Been Created!"))
			{
				Assert.assertTrue(true);
			}
			else
			{
				logger.error("Test failed");
				logger.debug("Debug Logs");
				Assert.assertTrue(false);
			}

		}
		catch(Exception ex)
		{
			Assert.fail();
		}
		logger.info("*********************************Account Registration Test case is completed*************************");
	}


}
