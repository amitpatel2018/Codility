package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By loginBox = By.id("login_form");
	By emailAddress = By.id("email");
	By password = By.id("passwd");
	By signIn = By.id("SubmitLogin");
	
	public void enterEmailAddress(String email) {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(loginBox));
		driver.findElement(emailAddress).sendKeys(email);
	}
	public void enterPassword(String pass) {
		driver.findElement(password).click();
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
	}
	public void clickOnSignin() {
		driver.findElement(signIn).click();
	}
}
