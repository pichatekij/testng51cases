package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[@id='username']")
	public WebElement loginUsernameInputBox;
	
	@FindBy(xpath = "//*[@id='password']")
	public WebElement loginPasswordInputBox;
	
	@FindBy(xpath = "//*[@class='woocommerce-Button button']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//div[@class='woocommerce']/ul/li")
	public WebElement errorMessageBox;
	
	@FindBy(xpath = "//div[@class= 'u-column1 col-1']/form/p[2]/label")
	public WebElement passwordInputBoxWithText;
	
	@FindBy(xpath = "//*[@id='customer_login']//div/h2")
	public WebElement loginText;
	
	@FindBy(xpath = "//*[@id='reg_email']")
	public WebElement registerUsernameInputBox;
	
	@FindBy(xpath = "//*[@id='reg_password']")
	public WebElement registerPasswordInputBox;
	
	@FindBy(xpath = "//*[@class='register']/p[3]/input[3]")
	public WebElement registerButton;
	
	@FindBy(xpath = "//*[@id='customer_login']//div[2]/h2")
	public WebElement registerText;
	
	
}
