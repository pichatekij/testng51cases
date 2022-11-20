package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class CommonPage {

	
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), 3);

	
	public CommonPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id='main-nav-wrap']/ul/li")
	public List<WebElement> topMenu;
	
	
	public void removeAdPopup() throws InterruptedException {
		BaseClass.getDriver().navigate().refresh();
	}
	
	@FindBy(xpath = "//*[@id='main-nav']/li/a")
	public WebElement topMenuShop;
	
	@FindBy(xpath = "//*[@id='main-nav']/li[2]/a")
	public WebElement topMenuMyAccount;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li/a")
	public WebElement linkLeftMenuDashboard;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[2]/a")
	public WebElement linkLeftMenuOrders;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[4]/a")
	public WebElement linkLeftMenuAddresses;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[5]/a")
	public WebElement linkLeftMenuAccountDetails;
	
	@FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation']/ul/li[6]/a")
	public WebElement linkLeftMenuLogout;
	
	
	
	
	
	
	
	
	
	
	
}
