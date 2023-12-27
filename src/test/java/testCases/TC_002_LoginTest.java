package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test (groups= {"Sanity","Master"})
	public void test_Login() {
		try {
		logger.info("*** Starting TC_002_LoginTest ***");
		HomePage hp= new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickLogin(); 
		
		LoginPage lp=new LoginPage(driver);
		lp.setEmail(rb.getString("email")); // email from config.properties rb=Resourse Bundle 
		lp.setPassword(rb.getString("password"));
		lp.clkLogin();
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists(); 
		Assert.assertEquals(targetPage, true);
	}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("*** Finished TC_002_LoginTest ***");
	}
	
}
