package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass {

	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement sauceLabsBackpackbutton;
	
	@FindBy(name="add-to-cart-sauce-labs-bike-light")
	private WebElement  sauceLabsBikeLight;
	
	@FindBy(id="shopping_cart_container")
	private WebElement  shoppingCartButton;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String getHomePageTitle()
	{
	return	driver.getTitle();
	}
	
	public String getHomePageUrl()
	{
	return	driver.getCurrentUrl();
	}
	
	public void addShoppingItemsbackandlight() throws InterruptedException
	{
		Thread.sleep(4000);
		Wait.click(sauceLabsBackpackbutton);
		Thread.sleep(4000);
		Wait.click(sauceLabsBikeLight);
		
	}
	
	public void clickShoppingCart() throws InterruptedException
	{
		Thread.sleep(4000);
		Wait.click(shoppingCartButton);
		
	}
}
