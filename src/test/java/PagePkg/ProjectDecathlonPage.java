package PagePkg;

import java.awt.Window;
import java.security.DrbgParameters.NextBytes;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class ProjectDecathlonPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div/div/div[1]/div[1]/a") WebElement logo;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div/div/div[1]/div[4]/a[1]/div") WebElement signin;
	@FindBy(xpath = "//*[@id=\"input-email\"]")WebElement email;
	@FindBy(xpath = "//*[@id=\"lookup-btn\"]")WebElement next;
	@FindBy(xpath = "//*[@id=\"form-verification-code\"]/div/button[1]")WebElement next1;
	@FindBy(xpath = "//*[@id=\"go-back-button\"]/span")WebElement back;
	@FindBy(xpath = "//*[@id=\"input_type_tab2\"]")WebElement phonenumbersignin;
	@FindBy(xpath = "//*[@id=\"input-mobile\"]")WebElement phonenumber;
	@FindBy(xpath = "//*[@id=\"lookup-btn\"]")WebElement next3;
	@FindBy(xpath = "//*[@id=\"IN0903GO\"]/img")WebElement googlelogin;
	@FindBy(xpath = "//*[@id=\"identifierId\"]")WebElement mailidselect;
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")WebElement next4;
	
	//@FindBy(xpath = "/html/body/div/div/main/header/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div")WebElement search;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[1]/div[1]/div/div/a[1]/div/div[1]/picture/img")WebElement mens;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[1]/div/div[1]/picture/img")WebElement tshirtsandtanks;
    @FindBy(xpath = "/html/body/div/div/main/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div/div/div[1]/div[3]/a/div/div[1]/div/div[1]/div/picture/img")WebElement firstproduct;	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[1]/div[1]")WebElement productphotos;
	
	@FindBy(xpath = "//*[@id=\"size-select-container\"]/div[1]/div/div")WebElement small;
	@FindBy(xpath = "//*[@id=\"size-select-container\"]/div[2]/div/div")WebElement medium;
	@FindBy(xpath = "//*[@id=\"size-select-container\"]/div[2]/div/div")WebElement large;
	@FindBy(xpath = "//*[@id=\"size-select-container\"]/div[4]/div/div")WebElement xtralarge;
	@FindBy(xpath = "//*[@id=\"size-select-container\"]/div[5]/div/div")WebElement doublexl;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[1]/div[2]/div[5]/div/div[2]/div/button[2]/div/span")WebElement addtowishlist;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[1]/div[2]/div[5]/div/div[2]/div/button[1]/div/span")WebElement addtocart;
	@FindBy(xpath = "//*[@id=\"product-review-tab-button\"]/b")WebElement reviews;
	@FindBy(xpath = "/html/body/div/div/main/header/div/div/div/div[1]/div[4]/a[5]/div")WebElement cart;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div/div[1]/div/div[2]/div/div[1]/button")WebElement addaddress;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div/div[1]/div/div[1]/div/div[2]/span[2]")WebElement pincode;
	@FindBy(xpath = "//*[@id=\"headlessui-dialog-:r7:\"]/div[2]/div/div/div[2]/div[3]/form/div/div[1]/input")WebElement pincodetextbox;
	@FindBy(xpath = "//*[@id=\"headlessui-dialog-:r7:\"]/div[2]/div/div/div[2]/div[3]/form/div/div[2]/button")WebElement apply;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div/div[2]/div/div[2]/div[2]/button")WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[1]/div[1]/div/div/a[2]/div/div[1]/picture/img")WebElement women;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[5]/div/div[1]/picture/img")WebElement jackets;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[1]/a[2]/button")WebElement backhome;
	@FindBy(xpath = "/html/body/div/div/main/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div/div/div[1]/div[3]/a/div/div[1]/div/div/div/picture/img")WebElement rainjacket;
	@FindBy(xpath = "/html/body/div/div/main/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/img")WebElement navycolour;
	@FindBy(xpath = "/html/body/div/div/main/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div[3]/img")WebElement navybluecolour;
	@FindBy(xpath = "/html/body/div/div/main/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div[4]/img")WebElement pinkcolour;
	@FindBy(xpath = "/html/body/div/div/main/div[3]/div[1]/div[2]/div[3]/div[2]/div/div/div[5]/img")WebElement greencolour;
	@FindBy(xpath = "/html/body/div/div/main/div[3]/div[1]/div[2]/div[4]/div[2]/div[1]/div/div")WebElement rainjacketsizesmall;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[1]/div[2]/div[5]/div/div[2]/div/button[2]")WebElement addtowishlist1;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div/div/div[1]/div[4]/a[4]/div/div")WebElement wishlist;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[1]/div[1]/div/div/a[3]/div/div[1]/picture/img")WebElement kids;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[1]/div/div[1]/picture/img")WebElement tshirtsandtops;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[2]/div/div[1]/picture/img")WebElement shorts;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[3]/div/div[1]/picture/img")WebElement trousersandpants;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[4]/div/div[1]/picture/img")WebElement sportsfootwear;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[5]/div/div[1]/picture/img")WebElement swimwear;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[6]/div/div[1]/picture/img")WebElement summeraccessories;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[7]/div/div[1]/picture/img")WebElement playaccessories;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div/div[2]/div/div/a[8]/div/div[1]/picture/img")WebElement sportsequipments;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[3]")WebElement nextpage;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/div[5]/a/h2")WebElement cricketbatandkits;
	@FindBy(xpath = "//*[@id=\"8843069\"]/div[3]/a/div/div[1]/div/div/div/picture/img")WebElement cricketbatselect;
	@FindBy(xpath = "/html/body/div/div/main/header/div/div/div/div[1]/div[1]/a")WebElement decicon;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div/div/div[1]/div[1]/button/div")WebElement hamburger;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[2]/a/div")WebElement downloadapp;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[2]/a/img")WebElement hamburgericon;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[1]/div/div[2]/div")WebElement hamMen;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[1]/div/div[3]/div")WebElement hamWomen;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[1]/div/div[4]/div")WebElement hamKids;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[1]/div/div[5]/div")WebElement hamSportsAccessories;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[1]/div/div[6]/div")WebElement hamSportsEquipments;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[1]/div/div[7]/div")WebElement hamGym;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[1]/div/div[8]/div")WebElement hamOnlineBrands;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/header/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a[1]")WebElement hamAdidas;
	@FindBy(xpath = "/html/body/div/div/main/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div/ul/li[1]/label/span")WebElement menCheckbox;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/p")WebElement mostRelevant;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/p/ul/li[2]/a")WebElement lowtohigh;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/p/ul/li[3]/a")WebElement hightolow;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/p/ul/li[4]/a")WebElement rating;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/p/ul/li[5]/a")WebElement popular;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[4]/footer/div[1]/div[2]/div[2]/div/div[1]/div/div/a[1]/img")WebElement fbicon;
	@FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div[5]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/i")WebElement fbclose;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[4]/footer/div[1]/div[2]/div[2]/div/div[1]/div/div/a[2]/img")WebElement twittericon;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[4]/footer/div[1]/div[2]/div[2]/div/div[1]/div/div/a[3]/img")WebElement instaicon;
	@FindBy(xpath = "//*[@id=\"__next\"]/div/main/div[4]/footer/div[1]/div[2]/div[2]/div/div[1]/div/div/a[4]/img")WebElement utubeicon;
	

	
	public ProjectDecathlonPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void titleVerification()
	{
		String expectedTitle = "Decathlon - Buy Sport Products Online | Download Decathlon App";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);	
	}
	
	public void logoVerification()
	{
		if(logo.isDisplayed())
		{
			System.out.println("Logo is Visible");
		}
		else
		{
			System.out.println("Logo is not Visible");
		}
	}
	
	public void signIn()
	{
		signin.click();
	
		
	}
	public void emailVerification() throws Exception
	{
		Thread.sleep(2000);
		email.sendKeys("amarnathspirit@gmail.com");
		next.click();
	}
	public void otpVerification()
	{
		next1.click();
	}
	public void back()
	{
		back.click();
	}
	public void phoneNumberSignin()
	{
		phonenumbersignin.click();
		phonenumber.sendKeys("8089395676");
		next3.click();
	}
	
//	public void googelSignin() throws Exception
//	{
//		googlelogin.click();
//		mailidselect.click();
//		mailidselect.sendKeys("amarnathspirit@gmail.com");
//		next4.click();
//		Thread.sleep(2000);;
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().back();
//	}
//	public void searchBar(String searchitem)
//	{
//		search.click();
//		search.sendKeys(searchitem);
//	}
	
	public void mensProducts()
	{
		mens.click();
	}
	public void tshirtsAndTanks()
	{
		tshirtsandtanks.click();
	}
	
	public void productselect() throws Exception
	{
		Thread.sleep(2000);
		firstproduct.click();
	}
	public void productPhotos()
	{
		if(productphotos.isDisplayed())
		{
			System.out.println("Product photos are displayed");
		}
		else
		{
			System.out.println("Product photos are not displayed");
		}
	}
	public void selectSize()
	{
		small.click();
		medium.click();
		large.click();
		xtralarge.click();
		doublexl.click();
		addtowishlist.click();
		
	}
	public void addToCart()
	{
		large.click();
		addtocart.click();
	}
	public void review()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,750)","");
		reviews.click();
	}
	public void selectCart() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/main/header/div/div/div/div[1]/div[4]/a[5]/div")));
        cart.click();
		addaddress.click();
		driver.navigate().back();
	}
//	public void pinCodeChange()
//	{
//		pincode.click();
//		pincodetextbox.click();
//		pincodetextbox.clear();
//		pincodetextbox.sendKeys("683574");
//		apply.click();
//		
//	}
//	
	public void proceedToCheckOut()
	{
		checkout.click();
	}
	
	public void womens() throws Exception
	{
		women.click();
		jackets.click();
		//backhome.click();
		
		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/main/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div/div/div[1]/div[3]/a/div/div[1]/div/div/div/picture/img")));
//		rainjacket.click();
	}
	
	public void jacketSelection()
	{
		rainjacket.click();
//		navycolour.click();
//		navybluecolour.click();
//		pinkcolour.click();
//		greencolour.click();
		
	}
	public void sizeSelectionAndWishlist()
	{
		rainjacketsizesmall.click();
		addtowishlist1.click();
		//wishlist.click();
		back.click();	
	}
	
	public void kidsSection() throws Exception
	{
		kids.click();
		tshirtsandtops.click();
		driver.navigate().back();
		shorts.click();
		driver.navigate().back();
		trousersandpants.click();
		driver.navigate().back();
		sportsfootwear.click();
		driver.navigate().back();
		swimwear.click();
		driver.navigate().back();
		summeraccessories.click();
		driver.navigate().back();
		playaccessories.click();
		driver.navigate().back();
		Thread.sleep(2000);
		sportsequipments.click();
		Thread.sleep(2000);
		nextpage.click();
		nextpage.click();
		cricketbatandkits.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)","");
		//js.executeScript("arguments[0].scrollintoview();");
		cricketbatselect.click();
		decicon.click();	
	}
	
	public void hamburgerMenu() throws Exception
	{
		hamburger.click();
		downloadapp.click();
		{
			System.out.println("Site redirected to playstore");
		}
		driver.navigate().back();
		hamburger.click();
		
		if(hamburgericon.isDisplayed())
		{
			System.out.println("Displayed icon inside hamburger menu");
		}
		else
		{
			System.out.println("Not contains any logo inside hamburger menu");
		}
		
		hamMen.click();
		hamWomen.click();
		hamKids.click();
		hamSportsAccessories.click();
		hamSportsEquipments.click();
		hamGym.click();
		hamOnlineBrands.click();
		hamAdidas.click();
		Thread.sleep(2000);
		menCheckbox.click();
		mostRelevant.click();
		lowtohigh.click();
		mostRelevant.click();
		hightolow.click();
		mostRelevant.click();
		rating.click();
		mostRelevant.click();
		popular.click();
		decicon.click();
	}
	
	public void socialMediaIcons() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		fbicon.click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String secondtab : allwindowhandles)
		{
			if(!secondtab.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(secondtab);
				Thread.sleep(2000);
				fbclose.click();
				System.out.println("Window Title is - "+driver.getTitle());
				driver.close();
				driver.switchTo().window(parentwindow);
			}
		}
	}
	
	public void socialMediaTwitter() throws Exception
	{
        twittericon.click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String secondtab : allwindowhandles)
		{
			if(!secondtab.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(secondtab);
				Thread.sleep(2000);
				System.out.println("Window Title is - "+driver.getTitle());
				driver.close();
				driver.switchTo().window(parentwindow);
			}
		}
	}
	
	public void socialMediaInsta() throws Exception
	{
		instaicon.click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String secondtab : allwindowhandles)
		{
			if(!secondtab.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(secondtab);
				Thread.sleep(2000);
				System.out.println("Window Title is - "+driver.getTitle());
				driver.close();
				driver.switchTo().window(parentwindow);
			}
		}
	}
	
	public void socialMediaYouTube() throws Exception
	{
		utubeicon.click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindowhandles = driver.getWindowHandles();
		for(String secondtab : allwindowhandles)
		{
			if(!secondtab.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(secondtab);
				Thread.sleep(2000);
				System.out.println("Window Title is - "+driver.getTitle());
				driver.close();
				driver.switchTo().window(parentwindow);
			}
		}
		decicon.click();
	}


}
