package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountLogin extends BasePage {
	public AccountLogin(WebDriver driver){
		super(driver);
	}
@FindBy(name="email") WebElement txtEmail;
@FindBy(name="password") WebElement txtPassword;
@FindBy(xpath ="//input[@value=\"Login\"]") WebElement btnLogin;


public void setEmail(String Email) {
	txtEmail.sendKeys(Email);
}
public void setPassword(String password) {
	txtPassword.sendKeys(password);
}
public void clickLogin() {
	btnLogin.click();
}

}
