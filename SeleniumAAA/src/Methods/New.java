package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://www.facebook.com/");
		  
		  
		  WebElement crenwAcc=d.findElement(By.xpath("//a[text()='Create New Account']"));
		  
	        crenwAcc.click();
	        
	        WebElement custom = d.findElement(By.xpath("(//input[@type='radio'])[3]"));
			  
			  boolean result= custom.isSelected();
			      
			  
			  System.out.println (result);
			  Thread.sleep(2000);
			  
			      custom.click();
			      
			      boolean re= custom.isSelected();
			     
			    if (re==true)
			      {
			   	  System.out.println("pass");
			     }
			    else
			    {
			     System.out.println("fail");
			    }
	}
}

	
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
