package TestPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.RishiHerbalTask;

public class RishiHerbalTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void tests() throws Exception
	{
		RishiHerbalTask ob = new RishiHerbalTask(driver);
		Thread.sleep(2000);
		ob.myAccount();
		Thread.sleep(2000);
		ob.logIn();
		ob.setValues("amarnathspirit@gmail.com");
		ob.setValues1("Amarnath@1995");
		ob.logInButton();
		Thread.sleep(3000);
		ob.health();
		ob.checkbox();
		ob.sortmenu();
		ob.selectproduct();
		ob.addWishlist();
	}

}
