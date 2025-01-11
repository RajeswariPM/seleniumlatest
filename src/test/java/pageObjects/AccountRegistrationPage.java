package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver){
		super(driver);
	}

@FindBy(name="firstname") WebElement txtFirstname;
@FindBy(name = "lastname") WebElement txtLastname;
@FindBy(name = "email") WebElement txtEmail;
@FindBy(name = "telephone") WebElement txtTelephone;
@FindBy(name = "password") WebElement txtPassword;
@FindBy(name = "confirm") WebElement txtConfirmPassword;
@FindBy(name ="agree") WebElement chkPolicy;
@FindBy(xpath = "//input[@value='Continue']") WebElement btnContinue;
@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") WebElement confirmMessage;

public void setFirstName(String firstname) {
	txtFirstname.sendKeys(firstname);	
}
public void setLastName(String lastname) {
	txtLastname.sendKeys(lastname);
}
public void setEmail(String email) {
	txtEmail.sendKeys(email);
}
public void setTelephone(String telephone) {
	txtTelephone.sendKeys(telephone);
}
public void setPassword(String password) {
	txtPassword.sendKeys(password);
}
public void setConfirmPassword(String confirmpassword) {
	txtConfirmPassword.sendKeys(confirmpassword);
}
public void setprivacyPolicy() {
	chkPolicy.click();
}
public void clickContinue() {
	btnContinue.click();
}
public String CheckConfirmationMessage() {
	try {
		return(confirmMessage.getText());
	}catch(Exception e) {
		return(e.getMessage());
	}
}

}
