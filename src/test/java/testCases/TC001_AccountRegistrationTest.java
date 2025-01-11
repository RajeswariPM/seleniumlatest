package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verifyAccountregistration() throws InterruptedException {
		
		logger.info("starting TC001_AccountRegistrationTest case");
		
		HomePage hp = new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickRegister();
		AccountRegistrationPage ar = new AccountRegistrationPage(driver);
		ar.setFirstName(randomStringGenerator().toUpperCase());
		ar.setLastName(randomStringGenerator().toUpperCase());
		ar.setEmail(randomStringGenerator()+"@gamil.com");
		ar.setTelephone(randomNumberGenerator());
		
		String pwd = randomAlphaNumericGenerator();
		ar.setPassword(pwd);
		ar.setConfirmPassword(pwd);
		ar.setprivacyPolicy();
		ar.clickContinue();
		String confmsg = ar.CheckConfirmationMessage();
		System.out.println(confmsg);
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
	
}
