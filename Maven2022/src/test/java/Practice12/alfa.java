package Practice12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice.amazonbaby;
import Practice.bestsellers;


public class alfa {

	public static void main(String[] args) {
		
			
			System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  driver.get("https://www.amazon.in/");
		 
		   //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
		  bestsellers sale = new  bestsellers(driver);
		  sale.clickOnMesseneger();
		  
		  String saler= driver.getCurrentUrl();
		  
		 if ( saler.equals("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers")) 
		 {
			 System.out.println("Messenger url is verified/PASS");
		 }
		 else
		 {
			 System.out.println("Messenger url is wrong/FAIL");
		 }
		 
		 
	    amazonbaby baby = new amazonbaby(driver);
		 baby.babyproductOpen();
		   
		 String Url = driver.getCurrentUrl();
		 String title= driver.getTitle();
		 
		  
		 if ( Url.equals("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers")
	&& title.equals("Amazon.in Bestsellers: The most popular items on Amazon")) {
			 System.out.println("PASS");
		 }
		 else
		 {
			 System.out.println("FAIL");
			 
			 
			 
		  
	}


	}
}


