package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountLogin;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_AccountLoginTest extends BaseClass {

	@Test
	public void accountLogin() {
		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickLogin();
		
		AccountLogin al = new AccountLogin(driver);
		al.setEmail(p.getProperty("email"));
		al.setPassword(p.getProperty("password"));
		al.clickLogin();
		
		MyAccountPage map = new MyAccountPage(driver);
		boolean targetpage=map.isMyAccountPageExists();
		//Assert.assertEquals(targetpage, true);
		Assert.assertTrue(targetpage);
		
	}
}
