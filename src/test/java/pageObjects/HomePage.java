package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {//constructor from BasePage
		super(driver); // super keyword use to invoke parent class constructor 
		//Constructor has same name as class here HomePage
		//constructor has no return type 
		//constructor no need to create object it will invoke itself
	}
	
	//Elements 
	@FindBy (xpath="//a[@title=\"My Account\"]")
	WebElement lnkMyAccount;
	
	@FindBy (xpath= "//a[text()=\"Register\"]" )
	WebElement lnkRegister; 
	
	@FindBy (xpath="//a[text()='Login']")
	WebElement lnkLogin; 
	
	// methods
	public void ClickMyAccount() {
		lnkMyAccount.click();
	}
	
	public void ClickRegister() {
	lnkRegister.click();
	}
	
	public void ClickLogin() {
		lnkLogin.click();
	}
}
