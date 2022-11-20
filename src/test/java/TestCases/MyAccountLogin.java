package TestCases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.CommonMethod;
import Utilities.Constants;

public class MyAccountLogin extends CommonMethod{
	
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.explicit_wait_time);
	

	@Test(priority=1, enabled=true)
	public void loginWithValidUsernameAndValidPassword(){
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
		
	}
	

	@Test(priority=2, enabled=true)
	public void loginWithIncorrectUsernameAndIncorrectPassword(){
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("incorrectUsername"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("incorrectPassword"));
		click(lp.loginButton);

		assertionTrueContainsText(lp.errorMessageBox, BaseClass.getProperty("expectedIncorrectUsernameAndPassword"));
		
	}
	
	
	@Test(priority=3, enabled=true)
	public void loginWithValidUsernameAndEmptyPassword(){
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("blank"));
		click(lp.loginButton);

		assertionTrueContainsText(lp.errorMessageBox, BaseClass.getProperty("expectedCorrectUsernameAndEmptyPassword"));
		
		
	}
	

	@Test(priority=4, enabled=true)
	public void loginWithEmptyUsernameAndValidPassword(){
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("blank"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));
		click(lp.loginButton);

		assertionTrueContainsText(lp.errorMessageBox, BaseClass.getProperty("expectedEmptyUsernameAndValidPassword"));
		
		
	}
	

	@Test(priority=5, enabled=true)
	public void loginWithEmptyUsernameAndPassword(){
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("blank"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("blank"));
		click(lp.loginButton);

		assertionTrueContainsText(lp.errorMessageBox, BaseClass.getProperty("expectedEmptyUsernameAndPassword"));
		
		
	}
	

	@Test(priority=6, enabled=true)
	public void loginPasswordShouldBeMasked(){
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("username"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("password"));

		assertionTrueContainsText(lp.passwordInputBoxWithText, BaseClass.getProperty("expectedEnterPassword"));
		
		
	}
	

	@Test(priority=7, enabled=true)
	public void loginHandleCaseSensitive(){
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuMyAccount));
		assertionTrueDisplay(cp.topMenuMyAccount);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuMyAccount"));
		sendKey(lp.loginUsernameInputBox, BaseClass.getProperty("changeCaseUsername"));
		sendKey(lp.loginPasswordInputBox, BaseClass.getProperty("changeCasePassword"));
		click(lp.loginButton);

		assertionTrueContainsText(lp.errorMessageBox, BaseClass.getProperty("expectedChangeCaseUsernameAndPassword"));
		
		
	}
	

	@Test(priority=8, enabled=true)
	public void loginAuthentication(){
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
		
		click(dp.signOutButton);
		back();
		
		assertionTrueDisplay(lp.loginUsernameInputBox);
		assertionTrueDisplay(lp.loginPasswordInputBox);
		assertionTrueDisplay(lp.loginButton);
		
		
	}

}
