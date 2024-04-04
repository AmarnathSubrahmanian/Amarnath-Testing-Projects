package PagePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFbLogin {
	WebDriver driver;
	
	@FindBy (xpath = "//*[@id=\"email\"]")WebElement fbemail;
	@FindBy (xpath = "//*[@id=\"pass\"]") WebElement fbpassword;
	@FindBy (xpath = "//*[@name=\"login\"]")WebElement login;
	
	public PageFbLogin(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValues(String username, String password)
	{
		fbemail.sendKeys(username);
		fbpassword.sendKeys(password);
	}
	
	public void loginButton()
	{
		login.click();
	}
	
	
	

}
