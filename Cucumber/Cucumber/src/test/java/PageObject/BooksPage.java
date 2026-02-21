package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Hooks.HooksClass;

public class BooksPage {

	private WebDriver driver = HooksClass.driver;

	public BooksPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[normalize-space(.)='Books'])[3]")
	WebElement Bookslink;

	@FindBy(xpath = "//select[@id='products-orderby']")
	WebElement sortbyDropdown;

	@FindBy(xpath = "//select[@id='products-pagesize']")
	WebElement displayDropdown;

	@FindBy(xpath = "//select[@id='products-viewmode']")
	WebElement viewDropdown;

	@FindBy(xpath = "(//a[text()='Computing and Internet']//following::div/input[@value='Add to cart'])[1]")
	WebElement addCart;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	WebElement shoppingcart ;
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	WebElement checkBox ;
	
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement Logoutbtn ;
	
	
	

	public void booksLink() {
		Bookslink.click();
	}

	public void selectSortByLowToHigh() {

		Select select = new Select(sortbyDropdown);
		select.selectByVisibleText("Price: Low to High");
	}

	public void selectDisplayCount() {

		Select select = new Select(displayDropdown);
		select.selectByVisibleText("12");
	}

	public void selectViewType() {

		Select select = new Select(viewDropdown);
		select.selectByVisibleText("List");
	}
	
	public void pageDown() {
	    Actions actions = new Actions(driver);
	    actions.sendKeys(Keys.PAGE_DOWN).perform();
	}
	
	
	public void addCartBooks() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(shoppingcart));
		addCart.click();

	}
	
	public void shoppingCartBtn() throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(shoppingcart).click().build().perform();
		
		//shoppingcart.click();
		
	}
	
	public void checkBoxBtn() {
		checkBox.click();
	}
	
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Logoutbtn));
		Logoutbtn.click();

	}
	
	

}
