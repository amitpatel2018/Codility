package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccount extends BasePage {
	public MyAccount(WebDriver driver) {
		super(driver);
	}
	
	By myPersonalInformation = By.xpath("//a[@title='Information']");
	By firstName = By.id("firstname");
	By currentPassword = By.id("old_passwd");
	By newPassword = By.id("passwd");
	By confirmationPassword = By.id("confirmation");
	// By saveButton = By.xpath("//button[@type='submit']");
	By saveButton = By.xpath("//button//span[contains(text(),'Save')]");
	By successMessage = By.xpath("//p[@class='alert alert-success']");
	
	public void clickOnMyPersonalInformation() {
		driver.findElement(myPersonalInformation).click();
	}
	
	public void changeFirstName(String name) {
		driver.findElement(firstName).click();
		driver.findElement(firstName).clear();
		driver.findElement(firstName).sendKeys(name);
	}
	
	public void enterCurrentPassword(String pass) {
		driver.findElement(currentPassword).sendKeys(pass);
	}
	public void enterNewPassword(String newPass) {
		driver.findElement(newPassword).sendKeys(newPass);
	}
	public void confirmNewPassword(String confirmNewPass) {
		driver.findElement(confirmationPassword).sendKeys(confirmNewPass);
	}
	public void clickOnSave() {
		driver.findElement(saveButton).click();
	}
	public void verifySuccessMessage() {
		String expected = "Your personal information has been successfully updated.";
		String actual = driver.findElement(successMessage).getText();
		if(actual.contains(expected)) {
			System.out.println("Account information updated successfully");
		} else {
			System.out.println("Account information updation failed");
		}
	}
}
