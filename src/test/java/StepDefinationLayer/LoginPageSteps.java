package StepDefinationLayer;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass {
   public static LoginPage loginPage;
	@Given("user is on Login Page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	}
	
	@When("user enters a valid username and password")
	public void user_enters_a_valid_username_password()
	{
		 loginPage=new LoginPage();
		 loginPage.enterUnameAndPass("standard_user", "secret_sauce");
	}

	@When("user click on Login button")
	public void user_click_on_login_button()
	{
		
		loginPage.clickOnLoginButton();
	}

	


}
