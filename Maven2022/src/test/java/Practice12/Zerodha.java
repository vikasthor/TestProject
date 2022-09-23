package Practice12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.ZerodhaBrokragecalC;
import Practice.ZerodhhaSignup;

import Practice.zerodhdownloadresources;

public class Zerodha {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  driver.get("https://zerodha.com/");
		 
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		   ZerodhhaSignup  zerodhsignup = new  ZerodhhaSignup (driver);
		   zerodhsignup.zerodhasignupopen();
		  
		  String signupUrl= driver.getCurrentUrl();
		  
		 if ( signupUrl.equals("https://zerodha.com/")) 
		 {
			 System.out.println("Messenger url is verified/PASS");
		 }
		 else
		 {
			 System.out.println("Messenger url is wrong/FAIL");
		 }
		 
		 
		 zerodhdownloadresources dwlnresrc = new  zerodhdownloadresources(driver);
		 dwlnresrc.downloadresourcespagetOpen();
		 String Url = driver.getCurrentUrl();
		 String title= driver.getTitle();
		 
		  
		 if ( Url.equals("https://signup.zerodha.com/") 
	&& title.equals("Zerodha - Online stock trading at lowest prices from India's biggest stock broker")) {
			 System.out.println("PASS");
		 }
		 else
		 {
			 System.out.println("FAIL");
			 
		  
	     }
		 
		 ZerodhaBrokragecalC brkgcalC = new  ZerodhaBrokragecalC(driver);
		 brkgcalC.brokrageCalcopen();
		 
		 String url = driver.getCurrentUrl();
		 String titles = driver.getTitle();
		 
		  
		 if ( url.equals("https://zerodha.com/resources") 
	&& titles.equals("Forms, utilities, PDFs and other resources – Zerodha")) {
			 System.out.println("PASS");
		 }
		 else
		 {
			 System.out.println("FAIL");
			 
		  
	     }
		 
		 
		 
		 

}
}