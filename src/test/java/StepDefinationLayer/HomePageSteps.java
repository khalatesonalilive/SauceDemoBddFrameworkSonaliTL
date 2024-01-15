package StepDefinationLayer;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps extends BaseClass {
   public static HomePage homePage;
	@Given("user is on Home Page and Validate the HomePage Title")
	public void user_is_on_home_page_and_validate_the_home_page_title() {

		 homePage=new HomePage();
	String actualTitle=	 homePage.getHomePageTitle();
	Assert.assertEquals(actualTitle, "Swag Labs");
	}

	@Given("user validate Home Page URL")
	public void user_validate_home_page_url() {

	String actualURL=	homePage.getHomePageUrl();
	boolean ac=actualURL.contains("saucedemo");
	Assert.assertEquals(ac, true);
	}

	@Given("user click on Sauce Labs Backpack and Sauce Labs Bike Light")
	public void user_click_on_sauce_labs_backpack_and_sauce_labs_bike_light() throws InterruptedException {
		homePage.addShoppingItemsbackandlight();
	}

	@Then("user click on shopping cart button")
	public void user_click_on_shopping_cart_button() throws InterruptedException {
		
		homePage.clickShoppingCart();
	}
}
