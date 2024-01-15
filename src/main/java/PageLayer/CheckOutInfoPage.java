package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class CheckOutInfoPage extends BaseClass {

	@FindBy(name = "firstName")
	private WebElement fname;

	@FindBy(name = "lastName")
	private WebElement lname;

	@FindBy(name = "postalCode")
	private WebElement pcode;

	@FindBy(name = "continue")
	private WebElement continueButton;

	public CheckOutInfoPage() {
		PageFactory.initElements(driver, this);

	}

	public String getCurrentURL() throws InterruptedException {
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}

	public void addNamePcode(String FirstN, String LastN, String PostalC) throws InterruptedException {
		Thread.sleep(3000);
		Wait.sendKeys(fname, FirstN);
		Thread.sleep(3000);
		Wait.sendKeys(lname, LastN);
		Thread.sleep(3000);
		Wait.sendKeys(pcode, PostalC);

	}

	public void click() throws InterruptedException {
		Thread.sleep(3000);
		Wait.click(continueButton);

	}
}
