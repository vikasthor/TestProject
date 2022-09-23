package Practice12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Practice.Rooms;
import Practice.loginOrSignup;
import Practice.returnTomessenger;
import Practice.visitHelpCenter;

public class demo {

	public static void main(String[] args) // before class
	{
		//System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 // WebDriver driver= new ChromeDriver();
		  
		  System.setProperty ("webdriver.gecko.driver","C:\\Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver= new FirefoxDriver();
		  
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		   driver.get("https://www.facebook.com/");                     //BeforeMethod
		   loginOrSignup loginpage = new  loginOrSignup (driver);  
		  loginpage.clickOnMesseneger();
		  
		   String meesengerpageURL= driver.getCurrentUrl(); 
		 if ( meesengerpageURL.equals("https://www.messenger.com/")) {
			 System.out.println("Messenger url is verified/PASS"); }
		 else{
			 System.out.println("Messenger url is wrong/FAIL");}
		 
	    Rooms room = new  Rooms(driver);                                   //Test-1
		 room.clickOnRoom();
		   String Url = driver.getCurrentUrl();
		 //String title= driver.getTitle();
		 if ( Url.equals("https://www.messenger.com/rooms")) {
			 System.out.println("Test 1-PASS");}
		 else {
			 System.out.println("Test 1-FAIL"); }
		 returnTomessenger returntopage =new returnTomessenger (driver);
		 returntopage.Returnbackpage();
		 
		 String Url99= driver.getCurrentUrl();
				 
				 if( Url99.equals("https://www.messenger.com/"))
				 {
					 System.out.println("Test 2- Pass");
				 }
				 else
				 {
					 System.out.println("Test 2-Fail");
				 }
				 room.clickOnRoom();
		  visitHelpCenter helpCenter= new visitHelpCenter(driver);          //Test-2
		 helpCenter.toVisitHelpCenter();
		  String Url2 = driver.getCurrentUrl();
		 String title2= driver.getTitle();
		  if ( Url2.equals("https://www.messenger.com/help") && title2.equals("Messenger Help Centre")) {
			 System.out.println("Test3-PASS");
		 }
		 else
		 {
			 System.out.println("Test3-FAIL");
          }
		                                                                    //AfterMethod
		   /*
		    * driver.get("https://www.facebook.com/");                     
		   
		   
		  loginpage.clickOnMesseneger();
		  
		   String meesengerpageURL= driver.getCurrentUrl(); 
		   
		 if ( meesengerpageURL.equals("https://www.messenger.com/")) {
			 System.out.println("Before method"); }
		 else{
			 System.out.println("Messenger url is wrong/FAIL");}
		 
	                                      
	    room.clickOnRoom();
	    
	    String Url = driver.getCurrentUrl();
		 String title = driver.getTitle();
		 
		  
		 if ( Url.equals("https://www.messenger.com/rooms") && title.equals("Messenger | Page Not Found")) {
			 
			 System.out.println("Before Method PASS");
		 }
		 else
		 {
			 System.out.println("Before Method FAIL");
		 }
	}                                                                 //AfterClass 
		    */

}
}

