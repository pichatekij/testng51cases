package TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.CommonMethod;
import Utilities.Constants;

public class MyAccountRegistration extends CommonMethod{
	
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.explicit_wait_time);
	
	@Test(priority=1, enabled=true)
	public void registrationSignin() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.registerUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.registerPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.registerButton);

		assertionEqual(dp.loginNameOnDashboard, BaseClass.getProperty("expectedName"));
		assertionTrueDisplay(dp.signOutButton);
	}
	
	@Test(priority=2, enabled=true)
	public void registrationWithInvalidId() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.registerUsernameInputBox, BaseClass.getProperty("invalidUsername"));
		sendKey(lp.registerPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.registerButton);

		assertionTrueDisplay(lp.registerText);
		assertionTrueDisplay(lp.registerButton);
	}
	
	@Test(priority=3, enabled=true)
	public void registrationWithEmptyId() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.registerUsernameInputBox, BaseClass.getProperty("blank"));
		sendKey(lp.registerPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.registerButton);

		assertionTrueContainsText(lp.errorMessageBox, BaseClass.getProperty("expectedRegisterWithoutUsername"));
		assertionTrueDisplay(lp.registerText);
		assertionTrueDisplay(lp.registerButton);
	}
	
	@Test(priority=4, enabled=true)
	public void registrationWithEmptyPassword() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.registerUsernameInputBox, BaseClass.getProperty("newUsername"));
		System.out.println("1");
		sendKey(lp.registerPasswordInputBox, BaseClass.getProperty("blank"));
		System.out.println("2");
		click(lp.registerButton);

		assertionTrueContainsText(lp.errorMessageBox, BaseClass.getProperty("expectedRegisterWithoutPassword"));
		assertionTrueDisplay(lp.registerText);
		assertionTrueDisplay(lp.registerButton);
	}

}
