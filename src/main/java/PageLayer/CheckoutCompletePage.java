package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class CheckoutCompletePage extends BaseClass {

	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	private WebElement thanksText ;
	
	public CheckoutCompletePage()
	{
		PageFactory.initElements(driver, this);
	}
	public String getText() throws InterruptedException
	{
		Thread.sleep(3000);
	return 	thanksText.getText();
		
	}
}
