package Utilities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;

public class CommonMethod extends PageInitializer{

	
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void sendKey(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	public void assertionTrueContainsTitle(String text) {
		assertTrue(driver.getTitle().contains(text));
	}
	
	public void assertionTrueContainsText(WebElement element, String text) {
		assertTrue(element.getText().contains(text));
	}
	
	public void assertionTrueDisplay(WebElement element) {
		assertTrue(element.isDisplayed());
	}
	
	public void assertionEqual(WebElement element, String text) {
		assertEquals(element.getText(), text);
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void back() {
		driver.navigate().back();
	}
	

	public void choosingMenuItem(String menuItem) {
		for(WebElement eachMenuItem : cp.topMenu) {
			if(eachMenuItem.getText().equalsIgnoreCase(menuItem)) {
				eachMenuItem.click();
				break;
			}
		}
		
	}
	
}
