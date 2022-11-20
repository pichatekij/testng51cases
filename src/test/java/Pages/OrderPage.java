package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class OrderPage {
	
	public OrderPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	
	@FindBy(xpath = "//*[@class='order']/td[5]/a")
	public WebElement orderViewButton;
	
}
