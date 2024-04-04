package TestPkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagePkg.ProjectDecathlonPage;

public class ProjectDecathlonTest {
	WebDriver driver;
	String baseurl = "https://www.decathlon.in/";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	
	@Test
	public void homepageValidation() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ProjectDecathlonPage dec = new ProjectDecathlonPage(driver);
		dec.titleVerification();
		dec.logoVerification();
		dec.signIn();
		dec.emailVerification();
		dec.otpVerification();
		dec.back();
		dec.signIn();
		dec.phoneNumberSignin();
		dec.back();
//		dec.signIn();
//		dec.googelSignin();
//		Thread.sleep(5000);
//		dec.searchBar("mens shoes");
		dec.mensProducts();
		dec.tshirtsAndTanks();
		dec.productselect();
		dec.productPhotos();
		dec.selectSize();
		dec.back();
		Thread.sleep(2000);
		dec.mensProducts();																									
		dec.tshirtsAndTanks();
		dec.productselect();
		dec.addToCart();
		dec.review();
		//Thread.sleep(2000);
		dec.selectCart();
		//dec.pinCodeChange();
		dec.proceedToCheckOut();
		dec.back();
		dec.womens();
		dec.jacketSelection();
		dec.sizeSelectionAndWishlist();
		dec.kidsSection();
		dec.hamburgerMenu();
		dec.socialMediaIcons();
		dec.socialMediaTwitter();
		dec.socialMediaInsta();
		dec.socialMediaYouTube();
	}
	

}
