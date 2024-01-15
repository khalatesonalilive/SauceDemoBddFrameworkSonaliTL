package StepDefinationLayer;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.YourCartPage;
import io.cucumber.java.en.Given;

public class YourCartSteps extends BaseClass {
        public static YourCartPage YourCartPage;
	@Given("user is on Your Cart Page and validate  Your cart Page URL")
	public void user_is_on_your_cart_page_and_validate_your_cart_page_url() {
     
		 YourCartPage=new YourCartPage();
		String actualURL= YourCartPage.getYourCartPageUrl();
		boolean acc=actualURL.contains("cart");
		Assert.assertEquals(acc, true);
		 
	}

	@Given("user click on Checkout button")
	public void user_click_on_checkout_button() throws InterruptedException {

		YourCartPage.clickCheckOutButton();
	}
}
