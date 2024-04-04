package PagePkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProjectASIETpage {
	WebDriver driver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/button") WebElement popup;
	@FindBy(xpath = "//*[@id=\"Header\"]/section/div[2]/div/div/div[1]/a/img") WebElement logo;
	@FindBy(xpath = "/html/body/header/section/div[1]/div/div/div/ul/li/a") WebElement telephonenumber;
	@FindBy(xpath = "/html/body/ul/li[1]/a") WebElement fbicon;
	
	
	
	
	public ProjectASIETpage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void popUp() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[2]/div/div/div[1]/button")));
		//Thread.sleep(3000);
		popup.click();
		System.out.println("popup window closed");
	}
//	public void titleVerification()
//	{
//		
//		String expectedTitle = "AdiShankaraInastituteOfEngineeringAndTechnology";
//		String actualTitle = driver.getTitle();
//		Assert.assertEquals(actualTitle, expectedTitle);
//	}
	
	public void logoVerification()
	{
		if(logo.isDisplayed())
		{
			System.out.println("LOgo is Visible");
		}
		else
		{
			System.out.println("Logo is not Visible");
		}
	}
	
	public void phonenumberVerification() throws Exception 
	{
		Thread.sleep(2000);
		telephonenumber.click();
		System.out.println("abcd");
//		if(telephonenumber.click())
//		{
//		System.out.println("Phone Number is Clickable");
//		}
//		else
//		{
//			System.out.println("Phone Number is not clickable");
//		}
		
		
	}
//	public void fbIcon()
//	{
//		fbicon.click();
//		System.out.println("Login to college facebook page");
//	}

	

}
