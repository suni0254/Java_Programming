package trello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trello {

    private static WebDriver driver;

    public static void main(String[] args) {

        try {
            // STEP 1 → Initiate driver
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Open Trello application
            driver.get(TestData.baseURL);

            // STEP 2 → Create class objects
            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            ValidateDuplicateBoardCreation valDup = new ValidateDuplicateBoardCreation(driver);

            // STEP 3 → Test Actions
            loginPage.login();
            homePage.createBoard();
            valDup.createDuplicateBoard();

        }
        catch (Exception e) {
            System.out.println("\nError occured:");
            e.printStackTrace();

        }
        finally {
            // STEP 4 → Close driver
            if (driver != null) {
                driver.quit();
                System.out.println("\nBrowser closed successfully.");
            }
        }
    }
}
