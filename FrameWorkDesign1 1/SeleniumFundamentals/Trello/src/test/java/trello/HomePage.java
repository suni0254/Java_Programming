package trello;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends Utility {

    HomePage(WebDriver driver) {
        super(driver);
    }

    public void createBoard() {


        // STEP 1 → Open Create Board Popup
        click(HomePageLocators.createBTN);
        click(HomePageLocators.createBoardBTN);

        // Select background theme
        click(HomePageLocators.backgroundIcon);

        if (driver.findElement(HomePageLocators.CreateBTN).isEnabled()) {
            // Click the Create button if it is enabled
            click(HomePageLocators.CreateBTN);

            // Wait for ListIcon to be visible (indicating board creation was successful)
            boolean iconIsDisplayed = waitForVisibility(HomePageLocators.ListIcon).isDisplayed();

            if (iconIsDisplayed) {
                System.out.println("Board created successfully without title");
            } else {
                System.out.println("Board is not created");
            }
        }
        else {
            // If the Create button is disabled, print a message
            System.out.println("Board cannot be created without Title");
        }

        sendKey(HomePageLocators.boardName, TestData.boardName);

        click(HomePageLocators.visbilityDropdown);
        click(HomePageLocators.visibility);

        // Confirm public visibility popup
        if (TestData.visibilityValue.equals("Public")) {
            click(HomePageLocators.publicConfirmPopUp);
        }

        // Create board
        click(HomePageLocators.CreateBTN);

        waitForVisibility(HomePageLocators.ListIcon);


        // STEP 2 → Validate Board Creation
        String boardPageTitle = driver.getTitle();
        System.out.println("\nBoard Page Title: " + boardPageTitle);

        if (boardPageTitle.equals(TestData.expectedTitle)) {
            System.out.println(" Board title matches expected title");
        } else {
            System.out.println(" Board title mismatch");
        }

        // Validate URL contains /b/
        String boardURL = driver.getCurrentUrl();
        System.out.println("\nBoard URL: " + boardURL);

        if (boardURL.contains("/b/")) {
            System.out.println("Board URL is correct (contains /b/)");
        } else {
            System.out.println("Board URL incorrect");
        }

        // Validate title inside the board header
        String innerBoardTitle = driver.findElement(HomePageLocators.BoardTitle).getText();

        if (innerBoardTitle.equals(TestData.boardName)) {
            System.out.println("\nInside board — title matches");
        } else {
            System.out.println("\nInside board — title mismatch");
        }

        // STEP 3 → Navigate back to Home
        click(HomePageLocators.TrelloIcon);
        click(HomePageLocators.HomeBTN);


        // STEP 4 → Find board in home page list
        List<WebElement> boardList =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePageLocators.ListofBoards));

        int boardListSize = boardList.size();
        System.out.println("\nTotal Boards Found: " + boardListSize);

        boolean boardFound = false;

        for (WebElement board : boardList) {

            String boardTitle = board.getAttribute("title");
            System.out.println("Board Name Found: " + boardTitle);

            if (boardTitle.equalsIgnoreCase(TestData.boardName)) {

                // Scroll into view and Click
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", board);

                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", board);

                boardFound = true;
                break;
            }
        }

        // Confirmation message
        if (boardFound) {
            System.out.println("\nBoard found and clicked successfully.");
        } else {
            System.out.println("\nBoard NOT found in the list.");
        }

        // STEP 5 → Validate title after opening the selected board
        WebElement boardTitleHeader =
                wait.until(ExpectedConditions.visibilityOfElementLocated(HomePageLocators.BoardTitle));

        String selectedBoardTitle = boardTitleHeader.getText();

        if (selectedBoardTitle.equals(TestData.boardName)) {
            System.out.println("\nBoard title verified after re-opening.");
        } else {
            System.out.println("\nBoard title verification failed after re-opening.");
        }
    }
}
