package Utilities;

import Pages.AccountDetailPage;
import Pages.AddressPage;
import Pages.CommonPage;
import Pages.DashboardPage;
import Pages.EditShippingPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.OrderDetailPage;
import Pages.OrderPage;

public class PageInitializer extends BaseClass{
	
	public static LoginPage lp;
	public static HomePage hp;
	public static CommonPage cp;
	public static DashboardPage dp;
	public static OrderPage op;
	public static OrderDetailPage odp;
	public static AddressPage ap;
	public static EditShippingPage esp;
	public static AccountDetailPage adp;
	
	
	public static void initialize() {
		lp = new LoginPage();
		hp = new HomePage();
		cp = new CommonPage();
		dp = new DashboardPage();
		op = new OrderPage();
		odp = new OrderDetailPage();
		ap = new AddressPage();
		esp = new EditShippingPage();
		adp = new AccountDetailPage();
	}

}
