package trello;

import org.openqa.selenium.By;

public class HomePageLocators {

    public static By createBTN = By.xpath("//button[@data-testid='header-create-menu-button']");
    public static By createBoardBTN = By.xpath("//button[@data-testid='header-create-board-button']");
    public static By backgroundIcon = By.xpath("//button[contains(@title, 'Sunrise')]");
    public static By boardName = By.className("nch-textfield__input");
    public static By visibility = By.xpath("//div[text()='"+TestData.visibilityValue+"']/ancestor::div[contains(@id,'-option')]");
    public static By CreateBTN = By.xpath("//button[text()='Create']");
    public static By TrelloIcon = By.xpath("//a[@aria-label='Back to home']");
    public static By visbilityDropdown = By.xpath("//div[@data-testid='create-board-select-visibility-select--dropdown-indicator']/span/span");
    public static By publicConfirmPopUp = By.xpath("//button[contains(text(),'Yes, make board public')]");
    public static By ListIcon = By.xpath("//span[@data-testid='ListIcon']");
    public static By HomeBTN = By.xpath("//span[text()='Home']");
    public static By BoardTitle = By.xpath("//h1[@data-testid='board-name-display']");
    public static By ListofBoards = By.xpath("//ul[contains(@class,'zYrSMdE6fABj7l')]/li//a[@data-nav-item='board-tile']");
}
