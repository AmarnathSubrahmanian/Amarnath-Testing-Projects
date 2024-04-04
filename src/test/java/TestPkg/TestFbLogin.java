package TestPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.PageFbLogin;

public class TestFbLogin {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginTest()
	{
		PageFbLogin ob = new PageFbLogin(driver);
		ob.setValues("abc@gmail.com","0123456");
		ob.loginButton();
	}

}
