package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class YourCartPage extends BaseClass {

	@FindBy(name="checkout")
	private WebElement  checkoutbutton;
	
	public YourCartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getYourCartPageUrl()
	{
	return	driver.getCurrentUrl();
	}
	
	public void clickCheckOutButton() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.click(checkoutbutton);
		
	}
	
	
	
	
	
	
	
	
	
	
}
