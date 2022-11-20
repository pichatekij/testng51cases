package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class EditShippingPage {

	
	public EditShippingPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-content']/form/h3")
	public WebElement editShippingAddressText;
}
