package flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import flipcart.cartpage;
import flipcart.footballCart;
import flipcart.loginpage;

public class testflipcart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		 // System.setProperty ("webdriver.gecko.driver","C:\\Automation\\Firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		 // WebDriver driver= new FirefoxDriver();
		  
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		   driver.get("https://www.flipkart.com/");  
		  driver.manage().window().maximize();
		   //loginpage homelogin = new loginpage (driver);
		//  homelogin.ClickonHomeLogin();
		  
		  loginpage entermob = new loginpage (driver);
		  entermob.clickonMobNu();
		  
		  loginpage pwd = new loginpage (driver);
		  pwd.clickonPasswd();
		  
		  loginpage submit = new loginpage (driver);
		  submit.clickonLogin();
		  
		   String url = driver.getCurrentUrl();
		   if (url.equals("https://www.flipkart.com/"))
		   {
			   System.out.println("test 1=pass");
		   }
		   else
		   {
			   System.out.println("test1 =fail");
		   }
		   
		   
		   Thread.sleep(3000);
		   cartpage cart = new cartpage (driver);
		   cart.clickonCart();
		   
		   cartpage cityball = new cartpage (driver);
		  cityball.clickonCityball();
		  
		  cartpage cityballaddcart = new cartpage (driver);
		  cityballaddcart.clickonAddtoCart();
		  
		  String url1 = driver.getCurrentUrl();
		   if (url1.equals("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART"))
		   {
			   System.out.println("test 2=pass");
		   }
		   else
		   {
			   System.out.println("test 2 =fail");
		   }
		   Thread.sleep(3000);
		   cart.clickonCart();
		   
		 
		  
		   //cart.clickonCart();
		  // JavascriptExecutor js = (JavascriptExecutor)driver;
		   
		   //WebElement ftbremo= driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[4]"));
		   
		  // js.executeScript("arguments[0].scrollIntoView", ftbremo );
		  
		   
		   footballCart football = new footballCart (driver);
		   football.clickonfootball();
		   
		   Thread.sleep(3000); 
		   
		   footballCart footballaddcart = new footballCart (driver);
		   footballaddcart.clickonfootballaddcart();
		   
		   String url2 = driver.getCurrentUrl();
		   if (url2.equals("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART"))
		   {
			   System.out.println("test 3=pass");
		   }
		   else
		   {
			   System.out.println("test 3 =fail");
		   }
	} 

}
