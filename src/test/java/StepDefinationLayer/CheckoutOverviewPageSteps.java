package StepDefinationLayer;

import BaseLayer.BaseClass;
import PageLayer.CheckoutOverviewPage;
import io.cucumber.java.en.Given;

public class CheckoutOverviewPageSteps extends BaseClass {

	public static CheckoutOverviewPage checkoutOverviewPage;
	
	@Given("user is on checkoutOverview Page and click on Finish button")
	public void user_is_on_checkout_overview_page_and_click_on_finish_button() throws InterruptedException {
	   
		 checkoutOverviewPage=new CheckoutOverviewPage();
		 checkoutOverviewPage.clickOnFinish();
	}
}
