package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class CheckoutOverviewPage extends BaseClass {

	
	@FindBy(name="finish")
	private WebElement finishButton ;
	
	public CheckoutOverviewPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnFinish() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.click(finishButton);
		
	}
}
