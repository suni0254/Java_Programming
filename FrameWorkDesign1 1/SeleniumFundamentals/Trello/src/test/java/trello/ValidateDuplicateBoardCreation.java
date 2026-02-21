package trello;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class ValidateDuplicateBoardCreation extends HomePage {

    ValidateDuplicateBoardCreation(WebDriver driver) {
        super(driver);
    }

    public void createDuplicateBoard() {

        click(HomePageLocators.TrelloIcon);
        click(HomePageLocators.HomeBTN);

        //Get size of Boards before creating Duplicate for Validation
        List<WebElement> boardList =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePageLocators.ListofBoards));

        int boardListSize = boardList.size();

        // STEP 1 → Open Create Board Popup
        click(HomePageLocators.createBTN);
        click(HomePageLocators.createBoardBTN);

        click(HomePageLocators.backgroundIcon);

        sendKey(HomePageLocators.boardName, TestData.boardName);

        click(HomePageLocators.visbilityDropdown);
        click(HomePageLocators.visibility);

        /* This is only for public visibility popup*/
        if (TestData.visibilityValue.equals("Public")) {
            click(HomePageLocators.publicConfirmPopUp);
        }

        click(HomePageLocators.CreateBTN);

        waitForVisibility(HomePageLocators.ListIcon);


        // STEP 2 → Validate Duplicate Board Creation
        String boardPageTitle = driver.getTitle();
        System.out.println("Board Page Title: " + boardPageTitle);

        if (boardPageTitle.equals(TestData.expectedTitle)) {
            System.out.println("Board title matches expected title");
        } else {
            System.out.println("Board title mismatch");
        }

        // STEP 3 → Navigate back to Home
        click(HomePageLocators.TrelloIcon);
        click(HomePageLocators.HomeBTN);


        // STEP 4 → Find board in home page list
        List<WebElement> dupBoardList =
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePageLocators.ListofBoards));

        int dupBoardListSize = dupBoardList.size();
        if(dupBoardListSize > boardListSize) {
            System.out.println("Board added successfully\nBoard earlier: "+ boardListSize + "\nBoards after creating duplicate board: " + dupBoardList.size());
        }

        List<String> boardTitles = new ArrayList<>();
        for (WebElement board : dupBoardList) {
             boardTitles.add(board.getAttribute("title"));
        }
        if(boardTitles.get(1).equals(boardTitles.get(2))) {
            System.out.println("Duplicate board names are allowed\nBoard name 1 : " + boardTitles.get(1) + "\nBoard name 2 : " + boardTitles.get(2));
        }

        for (int i = 0; i<dupBoardList.size(); i++) {
            WebElement board = dupBoardList.get(i);
            String boardTitle = board.getAttribute("title");
            System.out.println("Board " + (i+1) + " Name: " + boardTitle);
        }
    }
}

