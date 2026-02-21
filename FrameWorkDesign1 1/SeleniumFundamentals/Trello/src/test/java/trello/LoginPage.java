package trello;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Utility {

    LoginPage(WebDriver driver) {
        super(driver);
    }

     // Logs in to Trello using credentials from TestData.
    public void login() {

        // STEP 1 → Enter Username
        click(LoginPageLocators.loginBTN);
        sendKey(LoginPageLocators.username, TestData.username);

        click(LoginPageLocators.continueBTN);

        // STEP 2 → Enter Password
        sendKey(LoginPageLocators.password, TestData.password);
        click(LoginPageLocators.submitLoginBTN);

        // STEP 3 → Handle intermittent MFA Popup
        try {
            // Check if MFA prompt exists
            boolean isMFADisplayPresent = !driver.findElements(LoginPageLocators.dismissMFA).isEmpty();

            if (isMFADisplayPresent) {
                click(LoginPageLocators.dismissMFA);
                System.out.println("MFA dismissed successfully.");
            } else {
                System.out.println("MFA screen not displayed.");
            }

        }
        catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
