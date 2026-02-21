package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.HomePage;
import pageObject.RegistrationPage;
import utilities.TestBase;

import java.time.Duration;

public class TC_001_Account_Registration extends TestBase {

    @Test
    public void verify_Register_Account() {
        HomePage homePage = new HomePage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        homePage.clickMyAccount();
        homePage.clickRegister();

        registrationPage.setTxtFirstName(randomAlphabet().toUpperCase());
        registrationPage.setTxtLastName(randomAlphabet().toUpperCase());
        registrationPage.setTxtEmail(randomAlphaNumeric() + "@gmail.com");
        registrationPage.setTxtTelephone(randomNumeric());

        String password = randomAlphaNumeric();

        registrationPage.setTxtPassword(password);
        registrationPage.setTxtCnfrmPassword(password);
        registrationPage.setBtnNewsLetter();
        registrationPage.setAgreePrivacypolicy();
        registrationPage.setBtnContinue();

        String expectedConfirmMsg = "Your Account Has Been Created!";

        Assert.assertEquals(registrationPage.confirmMsg(), expectedConfirmMsg);
    }
}
