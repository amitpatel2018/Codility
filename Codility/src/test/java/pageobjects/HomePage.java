package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	By tShirt = By.linkText("T-SHIRTS");
	By fadedShortSleevTshirt = By.xpath("//div[@class='right-block']");
	By addToCart = By.xpath("//a//span[contains(text(),'Add to cart')]");
	By continueShopping = By.xpath("//span[@title='Continue shopping']");
	By viewMyShopping = By.xpath("//a[@title='View my shopping cart']");
	By productInCart = By.xpath("//a[@class='cart_block_product_name']");
	
	By signIn = By.linkText("Sign in");
	
	
	public void clickOnTshirts() {
		driver.findElement(tShirt).click();
	}
	public void clickOnAddToCart() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(fadedShortSleevTshirt));
		// ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,600)");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(fadedShortSleevTshirt)).build().perform();
		driver.findElement(addToCart).click();
	}
	public void clickOnContinueShopping() {
		driver.findElement(continueShopping).click();
	}
	public void moveToViewMyCart() {
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", driver.findElement(viewMyShopping));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(viewMyShopping)).build().perform();
	}
	public void verifyProductInCartPresented() {
		if(driver.findElement(productInCart).isDisplayed()) {
			System.out.println("Item is presented in cart");
		} else {
			System.out.println("Item is not presented in cart");
		}
	}
	public void clickOnSingin() {
		driver.findElement(signIn).click();
	}
}
