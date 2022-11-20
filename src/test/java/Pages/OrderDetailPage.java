package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class OrderDetailPage {
	
	
	public OrderDetailPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-content']/h2")
	public WebElement orderDetailText;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-content']/header/h2")
	public WebElement customerDetailText;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-content']/header[2]/h3")
	public WebElement billingAddressText;
	
	@FindBy(xpath = "//*[contains(@class,'order-number')]")
	public WebElement orderNumberText;
	
	@FindBy(xpath = "//*[contains(@class,'order-date')]")
	public WebElement orderDateText;
	
	@FindBy(xpath = "//*[contains(@class,'order-status')]")
	public WebElement orderStatusText;

}
