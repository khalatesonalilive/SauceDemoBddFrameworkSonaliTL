package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {

	@FindBy(name = "user-name")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement pass;

	@FindBy(name = "login-button")
	private WebElement loginButton;

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	public void enterUnameAndPass(String userName, String passWord) {

		Wait.sendKeys(username, userName);
		Wait.sendKeys(pass, passWord);

	}

	public void clickOnLoginButton() {
		Wait.click(loginButton);

	}
}
