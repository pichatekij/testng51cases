package TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.CommonMethod;
import Utilities.Constants;

public class ShopTesting extends CommonMethod{

	WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.explicit_wait_time);
	
	@Test(priority=1, enabled=true)
	public void shopFilterByPriceFunctionality() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		filteByMinPrice(200);
		filteByMaxPrice(450);
	}
	
	@Test(priority=2, enabled=true)
	public void shopProductCategoriesFunctionality() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		selectSideProductCategory(BaseClass.getProperty("expectedPage"));
		assertionTrueContainsText(sp.topLocator, BaseClass.getProperty("expectedPage"));
	}
	
	@Test(priority=3, enabled=true)
	public void shopDefaultSortingFunctionality01() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		selectSortingOption(BaseClass.getProperty("popularSort"));
		assertionTrueContainsText(sp.popularSortOption, BaseClass.getProperty("popularSort"));
	}
	
	@Test(priority=4, enabled=true)
	public void shopDefaultSortingFunctionality02() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		selectSortingOption(BaseClass.getProperty("ratingSort"));
		assertionTrueContainsText(sp.ratingSortOption, BaseClass.getProperty("ratingSort"));
	}
	
	@Test(priority=5, enabled=true)
	public void shopDefaultSortingFunctionality03() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		selectSortingOption(BaseClass.getProperty("newnessSort"));
		assertionTrueContainsText(sp.dateSortOption, BaseClass.getProperty("newnessSort"));
	}
	
	@Test(priority=6, enabled=true)
	public void shopDefaultSortingFunctionality04() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		selectSortingOption(BaseClass.getProperty("lowToHighSort"));
		assertionTrueContainsText(sp.priceSortOption, BaseClass.getProperty("lowToHighSort"));
	}
	
	@Test(priority=7, enabled=true)
	public void shopDefaultSortingFunctionality05() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		selectSortingOption(BaseClass.getProperty("highToLowSort"));
		assertionTrueContainsText(sp.priceDescSortOption, BaseClass.getProperty("highToLowSort"));
	}
	
	@Test(priority=8, enabled=true)
	public void shopReadMoreFunctionality() {
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		refresh();
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		assertionTrueDisplay(cp.topMenuShop);
		choosingMenuItem(BaseClass.getProperty("chooseTopMenuShop"));
		wait.until(ExpectedConditions.elementToBeClickable(cp.topMenuShop));
		selectProductList();
		assertionTrueDisplay(cp.topMenuShop);
	}
	
	
}
