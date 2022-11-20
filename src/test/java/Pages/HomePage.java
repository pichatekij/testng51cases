package Pages;

import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
	public void removeAdPopup() throws InterruptedException {
		BaseClass.getDriver().navigate().refresh();
	}
	
}
