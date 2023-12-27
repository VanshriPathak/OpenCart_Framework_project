package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
//Elements 
	public LoginPage(WebDriver driver) {//constructor from BasePage
		super(driver); // super keyword use to invoke parent class constructor 
		//Constructor has same name as class here HomePage
		//constructor has no return type 
		//constructor no need to create object it will invoke itself
	}
	
	@FindBy (xpath="//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy (xpath="//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy (xpath="//input[@value='Login']")
	WebElement btnLogin; 
	
	//methods 
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clkLogin() {
		btnLogin.click();
	}
	
}
