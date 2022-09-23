package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTestcases {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
        WebElement crenwAcc =driver.findElement(By.xpath("//a[text()='Create New Account']"));
		  
        crenwAcc.click();
	     
	     Thread.sleep(3000);
	     
	     WebElement custom= driver.findElement(By.xpath("(//input[@type='radio'])[3]")); 
	    WebElement pronoun= driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
	     
	    boolean result = pronoun.isDisplayed();
	     
	    System.out.println(result);
	     
	     Thread.sleep(3000);
	    
	     custom.click();
	     
	     boolean re= pronoun.isDisplayed();
	     
	     
	     if (re==true)
	      {
	   	  System.out.println("fail");
	     }
	    else
	    {
	     System.out.println("pass");
	    }
	     
	     
	}
	
	
	      
	}
		  
		  
		