package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import Hooks.HooksClass;
import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	//private is a access modifier to access the webdriver in the class
		private WebDriver driver = HooksClass.driver;
		LoginPage loginPage = new LoginPage(driver);

		@Given("Login in to homepage")
		public void login_in_to_homepage() throws InterruptedException {
			loginPage.clickLoginLink();

		}

		@When("enters username")
		public void enters_username() throws InterruptedException {
			loginPage.enterEmail();

		}

		@And("enter the password")
		public void enter_the_password() throws InterruptedException {
			loginPage.enterPassword();

		}

		@And("click on login button")
		public void click_on_login_button() {
			loginPage.clickLoginButton();
		}
		@Then("verify the title on homepage")
		public void verify_the_title_on_homepage() {
			//loginPage.verifyTitle();
			loginPage.verifyLogo();
		}
			
}
