package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.MyAccount;
import utilities.BaseClass;

public class UpdateFirstName {
	public WebDriver driver;
	
	@Given("User navigated {string}")
	public void user_navigated(String url) {
		driver = BaseClass.navigateToUrl("chrome", url);
	}
	
	@When("User clicks on Signin")
	public void user_clicks_on_signin() {
	    HomePage homePage = new HomePage(driver);
	    homePage.clickOnSingin();
	}

	@When("User enters {string} in username")
	public void user_enters_in_username(String string) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterEmailAddress("amitbpatel1820@gmail.com");
	}

	@When("User enters {string} in password")
	public void user_enters_in_password(String pass) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterPassword(pass);
	}
	
	@When("User clicks on Signin button")
	public void user_clicks_on_signin_button() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnSignin();
	}

	@When("User clicks on My Personal Information")
	public void user_clicks_on_my_personal_information() {
		MyAccount myAccount = new MyAccount(driver);
		myAccount.clickOnMyPersonalInformation();
	}

	@When("User changed first name as {string}")
	public void user_changed_first_name_as(String firstName) {
		MyAccount myAccount = new MyAccount(driver);
		myAccount.changeFirstName(firstName);
	}

	@When("User enters Current password as {string}")
	public void user_enters_current_password_as(String currentPassword) {
		MyAccount myAccount = new MyAccount(driver);
		myAccount.enterCurrentPassword(currentPassword);
	}

	@When("User enters new password as {string}")
	public void user_enters_new_password_as(String newPass) {
		MyAccount myAccount = new MyAccount(driver);
		myAccount.enterNewPassword(newPass);
	}

	@When("User confirms the new password as {string}")
	public void user_confirms_the_new_password_as(String confirmPass) {
		MyAccount myAccount = new MyAccount(driver);
		myAccount.confirmNewPassword(confirmPass);
	}

	@When("User clicks on Save")
	public void user_clicks_on_save() {
		MyAccount myAccount = new MyAccount(driver);
		myAccount.clickOnSave();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("User personal information is updated successfully")
	public void user_personal_information_is_updated_successfully() {
		MyAccount myAccount = new MyAccount(driver);
		myAccount.verifySuccessMessage();
	}
}
