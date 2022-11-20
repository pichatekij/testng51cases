package TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.CommonMethod;
import Utilities.Constants;

public class MyAccount extends CommonMethod{
	
	
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.explicit_wait_time);
	
	@Test(priority=1, enabled=true)
	public void myAccountDashboard() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
	}
	
	@Test(priority=2, enabled=true)
	public void myAccountOrder01() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
		click(cp.linkLeftMenuOrders);
		assertionTrueDisplay(op.orderViewButton);
		
	}
	
	@Test(priority=3, enabled=true)
	public void myAccountOrder02() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
		click(cp.linkLeftMenuOrders);
		assertionTrueDisplay(op.orderViewButton);
		
		click(op.orderViewButton);

		assertionEqual(odp.orderDetailText, BaseClass.getProperty("expectedOrderDetailText"));
		assertionEqual(odp.customerDetailText, BaseClass.getProperty("expectedCustomerDetailText"));
		assertionEqual(odp.billingAddressText, BaseClass.getProperty("expectedBillingAddressText"));
		
	}
	
	@Test(priority=4, enabled=true)
	public void myAccountOrder03() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
		click(cp.linkLeftMenuOrders);
		assertionTrueDisplay(op.orderViewButton);
		
		click(op.orderViewButton);
		assertionTrueDisplay(odp.orderNumberText);
		assertionTrueDisplay(odp.orderDateText);
		assertionTrueDisplay(odp.orderStatusText);
		
	}
	
	@Test(priority=5, enabled=true)
	public void myAccountAddressFunctionality01() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
		click(cp.linkLeftMenuAddresses);
		assertionTrueContainsText(ap.billingAddressText, BaseClass.getProperty("expectedBillingAddressText"));
		assertionTrueContainsText(ap.shippingAddressText, BaseClass.getProperty("expectedShippingAddressText"));
		
	}
	
	@Test(priority=6, enabled=true)
	public void myAccountAddressFunctionality02() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
		click(cp.linkLeftMenuAddresses);
		assertionTrueContainsText(ap.billingAddressText, BaseClass.getProperty("expectedBillingAddressText"));
		assertionTrueContainsText(ap.shippingAddressText, BaseClass.getProperty("expectedShippingAddressText"));
		
		click(ap.shippingAddressEdit);
		assertionTrueContainsText(esp.editShippingAddressText, BaseClass.getProperty("expectedShippingAddressText"));
		
	}
	
	@Test(priority=7, enabled=true)
	public void myAccountAccountDetail() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
		click(cp.linkLeftMenuAccountDetails);
		assertionTrueContainsText(adp.passwordChangeText, BaseClass.getProperty("expectedPasswordChangeText"));
		
	}
	
	@Test(priority=8, enabled=true)
	public void myAccountLogOut() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
		
		click(cp.topMenuMyAccount);
		assertionTrueDisplay(cp.linkLeftMenuDashboard);
		
		click(cp.linkLeftMenuLogout);
		assertionTrueContainsText(lp.loginText, BaseClass.getProperty("expectedLoginText"));
		assertionTrueContainsText(lp.registerText, BaseClass.getProperty("expectedRegisterText"));
		
		
		
	}
	

}
