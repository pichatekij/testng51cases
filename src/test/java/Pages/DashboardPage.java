package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class DashboardPage {

	
	public DashboardPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-content']/p/a")
	public WebElement signOutButton;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-content']/p/strong")
	public WebElement loginNameOnDashboard;
	
}
