package Practice12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.w3schoolJavascriptREF;
import Practice.w3schoolREF;

public class W3school {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  driver.get("https://www.w3schools.com/");
		 
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		  w3schoolREF referenecs = new  w3schoolREF (driver);
		  referenecs.referncescopen();
		  
		  String REFpageURL= driver.getCurrentUrl();
		  
		 if ( REFpageURL.equals("https://www.w3schools.com/")) 
		 {
			 System.out.println("Messenger url is verified/PASS");
		 }
		 else
		 {
			 System.out.println("Messenger url is wrong/FAIL");
		 }
		 
		 
		 w3schoolJavascriptREF  javascriptREf = new w3schoolJavascriptREF (driver);
		 javascriptREf.JavaScriptreferncescopen();
		 
		 String JSrfUrl = driver.getCurrentUrl();
		 String JStitle= driver.getTitle();
		 
		  
		 if ( JSrfUrl.equals("https://www.w3schools.com/") && JStitle.equals("W3Schools Online Web Tutorials")) {
			 System.out.println("PASS");
		 }
		 else
		 {
			 System.out.println("FAIL");
			 
		  
	}

}
}