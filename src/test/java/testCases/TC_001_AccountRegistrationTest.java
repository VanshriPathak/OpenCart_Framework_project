package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.HomePage;
import testBase.BaseClass;
import pageObjects.AccountRegistrationPage;
public class TC_001_AccountRegistrationTest extends BaseClass{

	
	@Test (groups= {"Regression", "Master"})
	public void test_account_registration() {
		logger.info("*** Starting TC_001_AccountRegistrationTest ***");
		try {
		HomePage hp= new HomePage(driver); //it ask for driver as we are extending base class, baseclass uses driver.
		hp.ClickMyAccount();
		logger.info("Clicked on MyAccount link");
		hp.ClickRegister();
		logger.info("Clicked on Register link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing customer data");
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clkContinue();
		logger.info("Clicked on continue ");
		
		logger.info("Validating expected message ");
		System.out.println(regpage.getconfirmationMsg());
		logger.info("*** Finished TC_001_AccountRegistrationTest ***");
	}
	
	catch (Exception e) {
		Assert.fail();
		}
	}
}
