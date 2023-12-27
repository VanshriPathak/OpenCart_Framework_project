package pageObjects;
//url=https://tutorialsninja.com/demo/index.php?route=account/register
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
WebDriver driver; 
public BasePage(WebDriver driver) { //constructor so should not have return type 
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
