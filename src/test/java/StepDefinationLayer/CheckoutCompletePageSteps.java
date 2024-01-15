package StepDefinationLayer;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.CheckoutCompletePage;
import io.cucumber.java.en.Given;

public class CheckoutCompletePageSteps extends BaseClass {
      
	public static CheckoutCompletePage CheckoutCompletePage;
	
	@Given("user capture the checkoutcomplete msg")
	public void user_capture_the_checkoutcomplete_msg() throws InterruptedException {
	    
		 CheckoutCompletePage=new CheckoutCompletePage();
	String text=	 CheckoutCompletePage.getText();
	
	Assert.assertTrue(text.contains("Thank you"));
	}
}
