package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import utilities.BaseClass;

public class OrderTshirtTest {
	
	public WebDriver driver;
	HomePage homePage;
	@Given("User navigated to {string}")
	public void user_navigated_to(String url) {
	    driver = BaseClass.navigateToUrl("chrome", url);
	}
	@When("User clicks on T-SHIRTS")
	public void user_clicks_on_t_shirts() {
		homePage = new HomePage(driver);
	    homePage.clickOnTshirts();
	}

	@When("User selects Faded Short Sleeve T-shirts")
	public void user_selects_faded_short_sleeve_t_shirts() {
		homePage = new HomePage(driver);
		homePage.clickOnAddToCart();
	}

	@When("User clicks on Continue Shopping")
	public void user_clicks_on_continue_shopping() {
		homePage = new HomePage(driver);
		homePage.clickOnContinueShopping();
	}

	@When("User clicks on Cart")
	public void user_clicks_on_cart() {
		homePage = new HomePage(driver);
		homePage.moveToViewMyCart();
	}

	@Then("User can see Faded Short Sleeve T-shirts added into cart")
	public void user_can_see_faded_short_sleeve_t_shirts_added_into_cart() {
		homePage = new HomePage(driver);
		homePage.verifyProductInCartPresented();
		BaseClass.closeBrowser();
	}
}
