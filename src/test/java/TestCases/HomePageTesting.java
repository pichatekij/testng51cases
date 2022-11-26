package TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.CommonMethod;
import Utilities.Constants;

public class HomePageTesting extends CommonMethod{
	
	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.explicit_wait_time);
	
	@Test(priority=1, enabled=true)
	public void pageWithSlideOnly() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		click(cp.HomeLogo);
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		homepageSliderItemList();
	}
	
	@Test(priority=2, enabled=true)
	public void pageWith3ArrivalsOnly() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		click(cp.HomeLogo);
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		homepageArrivalItemList();
	}

	
	@Test(priority=3, enabled=true)
	public void arrivalShouldBeNavigated() throws InterruptedException {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		click(cp.HomeLogo);
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		homepageArrivalItemNavigated();
	}

	
	@Test(priority=4, enabled=true)
	public void arrivalDescription() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		click(cp.HomeLogo);
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		homepageArrivalDescription();
	}

	
	@Test(priority=5, enabled=true)
	public void arrivalReview() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		click(cp.HomeLogo);
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		homepageArrivalReview();
	}
	
	
}
