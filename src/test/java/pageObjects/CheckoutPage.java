package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	
	public WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	// sh.driver.findElement(By.linkText("Top Deals")).click();
  //By.xpath("//input[@type='search']"))     t(By.cssSelector("h4.product-name"))
	By proceedToCheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	By cartBag = By.cssSelector("[alt='Cart']");
	By promoBtn = By.cssSelector("button.promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
		
//	public void clickAddToCartButton() {
//	 driver.findElement(addToCart).click();
//		
//	}
//	public void clickAddToCartBag() {
//		driver.findElement(cartBag).click();
//	}
//	public void clickproceedToCheckout() {
//	 driver.findElement(proceedToCheckout).click();	
//	}
	public void checkOutItems() {
		// driver.findElement(addToCart).click();
		 driver.findElement(cartBag).click();
		 driver.findElement(proceedToCheckout).click();
	}
		public boolean verifyPromoButton() {
			return driver.findElement(promoBtn).isDisplayed();
		}
		
		public boolean verifyplaceOrder() {
			return driver.findElement(placeOrder).isDisplayed();
		}
}
