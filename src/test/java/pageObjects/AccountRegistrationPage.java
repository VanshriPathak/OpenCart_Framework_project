package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver) {//constructor from BasePage
		super(driver); 
	}

	
	@FindBy (xpath="//input[@name=\"firstname\"]")
	WebElement txtFirstname;
	
	@FindBy (xpath="//input[@name=\"lastname\"]")
	WebElement txtLastname;
	
	@FindBy (xpath="//input[@name=\"email\"]")
	WebElement txtEmail;
	
	@FindBy (xpath="//input[@name=\"telephone\"]")
	WebElement txtTelephone;
	
	@FindBy (xpath="//input[@name=\"password\"]")
	WebElement txtPassword;
	
	@FindBy (xpath="//input[@placeholder=\"Password Confirm\"]")
	WebElement txtConfirmpassword;
	
	@FindBy (xpath="//input[@type=\"checkbox\"]")
	WebElement chkBox;
	
	@FindBy (xpath="//input[@value=\"Continue\"]")
	WebElement btnContine;
	
	@FindBy (xpath="//div[@id=\"content\"]/h1")
	WebElement msgConfirm;
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tphoneno) {
		txtTelephone.sendKeys(tphoneno);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String cpwd) {
		txtConfirmpassword.sendKeys(cpwd);
	}
	
	public void setPrivacyPolicy() {
		chkBox.click();
	}
	
	public void clkContinue() {
		btnContine.click();
	}
	
	public String getconfirmationMsg() {
		String msg=msgConfirm.getText();
		Assert.assertEquals(msg, "Your Account Has Been Created!");
		return msg;
	}
}
