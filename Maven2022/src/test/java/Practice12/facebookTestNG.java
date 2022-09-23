package Practice12;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Practice.AngelOneLogin;
import Practice.Rooms;
import Practice.loginOrSignup;
import Practice.returnTomessenger;
import Practice.visitHelpCenter;
import Temporary.BrowserPreLaunch;

public class facebookTestNG extends BrowserPreLaunch{
	
	private WebDriver driver;
	private loginOrSignup loginpage;
	private  Rooms room;
	private 	visitHelpCenter helpCenter;
	private returnTomessenger messengerpage;
	private SoftAssert soft;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if (browserName.equals("Chrome"))
		{
	         driver = openChromeBrowser();
		}
		
		if (browserName.equals("FireFox"))
		{
			 driver= openFirefoxBrowser();
		}
		
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	
	@BeforeClass
	public void createPOMobjects()
	{
		 loginpage = new  loginOrSignup (driver);  
		 room = new  Rooms(driver); 
		 helpCenter = new visitHelpCenter(driver);
		  messengerpage = new returnTomessenger (driver);
	}
	
	@BeforeMethod
	public void openRoomPage()
	{
		  driver.get("https://www.facebook.com/");                     
		
		  loginpage.clickOnMesseneger();
		 
	      room.clickOnRoom();
	     
	      soft = new SoftAssert();
	}
		
	@Test
	public void verifyGoBackToMessengerButton()
	{  
		
		 messengerpage.Returnbackpage();
			
		 String URL1= driver.getCurrentUrl();
		 
		 soft.assertEquals(URL1, "https://www.messenger.com/");
		 
		 soft.assertAll();
		 
	}
	
	@Test 
	public void verifyHelpCenterButton()
	{ 
		 helpCenter.toVisitHelpCenter();
		 
		 String URL2 = driver.getCurrentUrl();
		 String Title2= driver.getTitle();
		 
        soft.assertEquals(URL2, "https://www.messenger.com/help");
        
        soft.assertEquals(Title2, "Messenger Help Centre");
		 
		 soft.assertAll();

	}
	
	@AfterMethod
	public void logoutFromApp()
	{
		System.out.println("After method");
		
	}
	
	@AfterClass
	public void cleanPOMobject()
	{

		 loginpage = null;
		 room = null;
		 helpCenter =null;
		  messengerpage =null;
	}
	
	@AfterTest
	public void closedBrowser()
	{
		System.out.println("After Test");
		driver.close();
		driver =null;
		System.gc();
	}
}


























