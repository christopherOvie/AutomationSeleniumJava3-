package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import utility.Shared;

public class CheckoutPageStepDefinition {

	public WebDriver driver;
	public String landingPageProductName;
	public  CheckoutPage checkoutPage;
	Shared sh;
	
	
	public CheckoutPageStepDefinition(Shared sh) {
		this.sh=sh;
		this.checkoutPage = sh.pageObjectManager.getCheckoutPage();
	}



	

	@Then("User proceeds to checkout and validate the {string}  items in checkout page")
	public void user_proceeds_to_checkout_and_validate_the_items_in_checkout_page(String string) throws InterruptedException {
		checkoutPage.checkOutItems();
		//Thread.sleep(4000); 
	}

	@Then("user has ability to enter promo code and place the order")
	public void user_has_ability_to_enter_promo_code_and_place_the_order() throws InterruptedException {
		
		//checkoutPage.checkOutItems();
		Thread.sleep(4000);
		//Assert.assertTrue(checkoutPage.verifyplaceOrder());
		Assert.assertTrue(checkoutPage.verifyPromoButton());
	}





}
