package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class AddressPage {
	
	
	public AddressPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	
	@FindBy(xpath = "//*[@class='u-column1 col-1 woocommerce-Address']/header/h3")
	public WebElement billingAddressText;
	
	@FindBy(xpath = "//*[@class='u-column2 col-2 woocommerce-Address']/header/h3")
	public WebElement shippingAddressText;
	
	@FindBy(xpath = "//*[@class='u-column1 col-1 woocommerce-Address']/header/a")
	public WebElement billingAddressEdit;
	
	@FindBy(xpath = "//*[@class='u-column2 col-2 woocommerce-Address']/header/a")
	public WebElement shippingAddressEdit;
}
