package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class insta {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			  WebDriver driver= new ChromeDriver();
			    
			  driver.get("https://about.instagram.com/");  
			  
			  Thread.sleep(3000);
			  {
				  System.out.println("hii");  }
			 
			  WebElement Business = driver.findElement(By.xpath("//a[text()='Business'] "));
			    
			     JavascriptExecutor js =  (JavascriptExecutor) driver;
			     
			     Thread.sleep(3000);
			     
			     js.executeScript("arguments[0].scrollIntoView(true);", Business);
			     {
					  System.out.println("bye");  }
				 
				 
			 
	}
	
}
