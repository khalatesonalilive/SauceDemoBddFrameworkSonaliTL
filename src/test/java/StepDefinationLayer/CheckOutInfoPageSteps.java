package StepDefinationLayer;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.CheckOutInfoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutInfoPageSteps extends BaseClass {
	public static CheckOutInfoPage checkOutInfoPage;

	@Given("user is on Checkout page and validate checkOut Page Url")
	public void user_is_on_checkout_page_and_validate_check_out_page_url() throws InterruptedException {
		checkOutInfoPage = new CheckOutInfoPage();
		String actualURL = checkOutInfoPage.getCurrentURL();
		boolean cc = actualURL.contains("checkout");
		Assert.assertEquals(cc, true);

	}

	@When("user enters valid firstname, lastname and postalcode")
	public void user_enters_valid_firstname_lastname_and_postalcode() throws InterruptedException {
		checkOutInfoPage.addNamePcode("Girl", "Power", "12345");
	}

	@Then("user click on continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		checkOutInfoPage.click();
	}
}
