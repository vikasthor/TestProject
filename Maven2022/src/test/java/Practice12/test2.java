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


import TestClass2.TwitterAccessibility1;

import TestClass2.TwitterGlossary1;
import TestClass2.TwitterHelp;
import TestClass2.TwitterResources;


public class test2 {
	
	private WebDriver driver;
	private TwitterHelp hlp;
	private TwitterGlossary1 gls;
	private  TwitterResources rec;
	private TwitterAccessibility1 accss;
	private SoftAssert soft;
	
	
	@BeforeClass
	public void createPOMobject ()
	{

		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		// driver.manage().window().maximize();
			
	}
	
	@BeforeMethod
	public void openTwitterHelpCenter()
	{
		driver.get("https://help.twitter.com/en/managing-your-account");    
		
		hlp= new TwitterHelp (driver);
		
		
		
		hlp.ClickOnHelp();
	
		 rec = new  TwitterResources (driver); 
		 
		
		 rec.clickOnresources(); 
				
				
           
	}
		 
		 @Test
			public void verifyTwitterAAGlosseryShop()
			{  
			 rec.clickOnresources(); 
			 gls = new TwitterGlossary1 (driver); 
			 gls.ClickOnGossery();
			 
			 String URL3= driver.getCurrentUrl(); 
			 
		
	soft.assertEquals(URL3, "https://help.twitter.com/en/resources/glossary");
		soft.assertAll();
			 
			 System.out.println("Glossery");
	}

        @Test 
	public void verifyTwitterAccessibility()
	{        
        	rec.clickOnresources(); 
        	 accss = new TwitterAccessibility1 (driver);
		     accss.ClickOnAccessibility();
		 
	     String URL4 = driver.getCurrentUrl();
	     
	     soft = new SoftAssert();
	     soft.assertEquals(URL4,"https://help.twitter.com/en/resources/accessibility");     
	     soft.assertAll();
	     
	     System.out.println("Accessibility");
	
      }

        @AfterMethod 
        public void logout()
        {
        	System.out.println("After Method");
        }
        
        @AfterClass
        public void cleanPOMobject()
        {
        	System.out.println("After Class");
        	driver.close();
        }
        
    
}
        
        


