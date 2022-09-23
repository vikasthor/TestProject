package Practice12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestClass2.TwitterAcSecurity;
import TestClass2.TwitterCompromisedAccount;
import TestClass2.TwitterSafety;

public class Twitter {

	public static void main(String[] args) 
	{
		 //System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		//  WebDriver driver= new ChromeDriver();
		  
		  System.setProperty ("webdriver.gecko.driver","C:\\Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver  driver= new FirefoxDriver();
		  
		// System.setProperty ("webdriver.gecko.driver","C:\\Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 //WebDriver driver= new FirefoxDriver();
		  
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
		   driver.get("https://help.twitter.com/en/managing-your-account"); 
		   driver.manage().window().maximize();
		   
		  // TwitterHelp hlp= new TwitterHelp (driver);
		  // hlp.ClickOnHelp();
		   
		   
		   String URL1= driver.getCurrentUrl(); 
		 if ( URL1.equals("https://help.twitter.com/en/managing-your-account")) {
			 System.out.println("Before-1 PASS"); }
		 else{
			 System.out.println("Before-1 FAIL");}
		 
		 
		 TwitterSafety safe = new   TwitterSafety (driver);
		safe.ClickOnSefety();

		 String URL2= driver.getCurrentUrl(); 
		 if ( URL2.equals("https://help.twitter.com/en/safety-and-security")) {
			 System.out.println("Before-2 PASS"); }
		 else{
			 System.out.println("Before-2 FAIL");}
		 
		 TwitterCompromisedAccount cmpAc = new TwitterCompromisedAccount (driver);
		cmpAc.ClickOnComproAccount();
		 
		 String URL3= driver.getCurrentUrl(); 
		 if ( URL3.equals("https://help.twitter.com/en/safety-and-security/twitter-account-compromised")) {
			 System.out.println("Before-3 PASS"); }
		 else{
			 System.out.println("Before-3 FAIL");}
		 
		  driver.get("https://help.twitter.com/en/managing-your-account");  
		  safe.ClickOnSefety();
		 TwitterAcSecurity security = new TwitterAcSecurity  (driver);
		security.ClickOnAccountSecurity();
		 String URL4= driver.getCurrentUrl(); 
		 if ( URL4.equals("https://help.twitter.com/en/safety-and-security/account-security-tips")) {
			 System.out.println("Before-4 PASS"); }
		 else{
			 System.out.println("Before-4 FAIL");}
	}

}
