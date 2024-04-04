package PagePkg;

import org.openqa.selenium.HealthCheckFailedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class RishiHerbalTask {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/a/i") WebElement MyAccount;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a") WebElement login;
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[1]/input") WebElement Email;
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[2]/input") WebElement Password;
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/button[1]") WebElement LoginButton;
	
	@FindBy(xpath = "//*[@id=\"menu\"]/ul/li[2]/a") WebElement health;
	@FindBy(xpath = "//*[@id=\"outOfStockFilter\"]") WebElement instock;
	@FindBy(xpath = "//*[@id=\"input-sort\"]") WebElement sort;
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img") WebElement firstproduct;
	@FindBy(xpath = "//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span") WebElement wishlist;
	
	public RishiHerbalTask(WebDriver driver) 
	{
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
	}
	
	public void myAccount()
	{
		MyAccount.click();
	}
	
	public void logIn()
	{
		login.click();
	}
	
	public void setValues(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setValues1(String password)
	{
		Password.sendKeys(password);
	}
	
	public void logInButton()
	{
		LoginButton.click();
	}
	
	public void health()
	{
		health.click();
	}
	
	public void checkbox()
	{
		instock.click();
	}
	
	public void sortmenu()
	{
		Select filter = new Select(sort);
		filter.selectByValue("alphabet-asc");
		
	}
	
	public void selectproduct()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)","");
		firstproduct.click();
	}
	
	public void addWishlist()
	{
		wishlist.click();
	}

}
