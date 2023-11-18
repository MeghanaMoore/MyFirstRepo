package Login;

import org.testng.annotations.Test;

import GenericUtilities.BaseClass;


public class Login_Test extends BaseClass {
	@Test
	
	public void LoginToDemoWebShop() {
		login.getLoginLink().click();
		login.getMailTb().sendKeys("meghana");
		login.getPassTb().sendKeys("*****");
		login.getLoginButton().click();

	}
}
