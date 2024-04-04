package TestPkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.ProjectASIETpage;

public class ProjectASIETtest {
	
	WebDriver driver;
	String baseurl = "https://www.adishankara.ac.in/";
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void homePageValidation() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ProjectASIETpage asi = new ProjectASIETpage(driver);
		
		asi.popUp();
		//asi.titleVerification();
		asi.logoVerification();
		asi.phonenumberVerification();
		//asi.fbIcon();
	}

}
