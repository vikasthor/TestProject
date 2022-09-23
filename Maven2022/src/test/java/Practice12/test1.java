package Practice12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Practice.Rooms;
import Practice.loginOrSignup;
import Practice.returnTomessenger;
import Practice.visitHelpCenter;

public class test1 {

	private WebDriver driver;
	private loginOrSignup loginpage;
	private  Rooms room;
	private 	visitHelpCenter helpCenter;
	private returnTomessenger messengerpage;
	private SoftAssert soft;
	

	@BeforeClass
	public void createPOMobjects()
	{
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  
	}
	
	@BeforeMethod
	public void openRoomPage()
	{
		  driver.get("https://www.facebook.com/");                     
		
		  loginpage = new  loginOrSignup (driver);  
		  loginpage.clickOnMesseneger();
		 
		  room = new  Rooms(driver); 
	      room.clickOnRoom();
	     
	      soft = new SoftAssert();
	}
		
	@Test
	public void verifyGoBackToMessengerButton()
	{  
		messengerpage = new returnTomessenger (driver);
		 messengerpage.Returnbackpage();
			
		 String URL1= driver.getCurrentUrl();
		 
		 soft.assertEquals(URL1, "https://www.messenger.com/");
		 
		 soft.assertAll();
		 
	}
	
	@Test 
	public void verifyHelpCenterButton()
	{ 
		 helpCenter = new visitHelpCenter(driver);
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

		 System.out.println("After Class");
		 driver.close();
	}
}
