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

import TestClass2.TwitterAcSecurity;
import TestClass2.TwitterCompromisedAccount;
import TestClass2.TwitterSafety;



public class TwitterTestNG 
{  
	private WebDriver driver;
    private TwitterSafety safe;
    private TwitterCompromisedAccount cmpAc;
    private TwitterAcSecurity security;
	private SoftAssert soft;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if (browserName.equals("Chrome"))
		{
			System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
		}
		
		if (browserName.equals("FireFox"))
		{
			 System.setProperty ("webdriver.gecko.driver","C:\\Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			  driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void createPOMobject ()
	{
		 safe = new   TwitterSafety (driver);
		 cmpAc = new TwitterCompromisedAccount (driver);
		 security = new TwitterAcSecurity  (driver);
		 
	}
	
	@BeforeMethod
	public void openTwitterHelpCenter()
	{
		driver.get("https://help.twitter.com/en/managing-your-account"); 
		
		safe.ClickOnSefety();
		
		 soft = new SoftAssert();
	}
		 
		 @Test
			public void A_verifyTwitterCompromisedAccount()
			{  
			 
			 cmpAc.ClickOnComproAccount();
			 
			 String URL1= driver.getCurrentUrl(); 
			 
			 soft.assertEquals(URL1, "https://help.twitter.com/en/safety-and-security/twitter-account-compromise");
			
			 soft.assertAll();
	}

        @Test 
	public void B_verifyTwitterAccountSecurity()
	{  
		 
        	security.ClickOnAccountSecurity();
		 
	     String URL4 = driver.getCurrentUrl();

	     soft.assertEquals(URL4,"https://help.twitter.com/en/safety-and-security/account-security-tips");
	
      }

        @AfterMethod 
        public void logout()
        {
        	System.out.println("After Method");
        }
        
        @AfterClass
        public void cleanPOMobject()
        {
        	safe = null;
   		 cmpAc = null;
   		 security =null;
        }
        
        @AfterTest
        public void closedBrower()
        {
        	System.out.println("After Test");
        	driver.close();
        	driver =null;
        	System.gc();
        }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
