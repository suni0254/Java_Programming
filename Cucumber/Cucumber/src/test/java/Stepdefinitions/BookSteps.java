package Stepdefinitions;

import org.openqa.selenium.WebDriver;

import Hooks.HooksClass;
import PageObject.BooksPage;
import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSteps {
	private WebDriver driver = HooksClass.driver;
	BooksPage booksPage = new BooksPage(driver);
	
	@Given("the user navigates to the Books section")
	public void the_user_navigates_to_the_books_section() {
		booksPage.booksLink();
	   
	}

	@When("the user selects {string} from the Sort By dropdown")
	public void the_user_selects_from_the_sort_by_dropdown(String string) {
		booksPage.selectSortByLowToHigh();
	   
	}

	@And("the user selects a value from the Display dropdown")
	public void the_user_selects_a_value_from_the_display_dropdown() {
		booksPage.selectDisplayCount();
	   
	}

	@And("the user selects {string} from the View dropdown")
	public void the_user_selects_from_the_view_dropdown(String string) {
		booksPage.selectViewType();
	   
	}
	
	@And("the user presses page down")
	public void user_presses_page_down() {
	    booksPage.pageDown();
	}
	   

	@Then("the user adds a selected book to the cart")
	public void the_user_adds_a_selected_book_to_the_cart() {
		booksPage.addCartBooks();
	    
	}
   
	@And("the user click on the shoppingcart")
	public void the_user_click_on_the_shoppingcart() throws InterruptedException {
		booksPage.shoppingCartBtn();
		
	}
	
	@And("the open the shoppingcartpage and click on check button")
	public void the_open_the_shoppingcartpage_click_on_check_button() {
		booksPage.checkBoxBtn();
		
	}
	
	
	@Then("the user click on the logoutbutton")
	public void the_click_on_the_logoutbutton() {
		booksPage.logout();
		
	}


}
