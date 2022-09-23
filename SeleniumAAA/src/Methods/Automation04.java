package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://outlook.live.com/owa/");
		  
		  WebElement createFreeAcc=d.findElement(By.xpath("(//a[text()='Create free account'])[2]"));
		  createFreeAcc.click();
		  
		     Thread.sleep(2000);
		  
		  WebElement email=d.findElement(By.xpath("	//input[@class='ltr_override liveDomainInput col-xs-14']"));
		  
		  email.sendKeys("vikas4216");
		  
              Thread.sleep(2000);
		  
		  WebElement next=d.findElement(By.xpath("(//input[@type='submit'])[2]"));
		  
		      next.click();
		
		  
		  
	
		  
		  
		  
		  
		  
		  
		  
		  
		  //WebElement yourOrder=d.findElement(By.xpath("//span[text()='Your Orders']"));
		 
		 //Actions act = new Actions (d);
		  
		  //act.moveToElement(signIn).moveToElement(yourOrder).click().build().perform();
		 // WebElement email = d.findElement(By.xpath("//input[@type='email']"));  
		// email.sendKeys("vikasthorat4216@gmail.com");  
		 // Thread.sleep(3000);
		  
		 // WebElement continew=d.findElement(By.xpath("//input[@id='continue']"));
		 // continew.click();
	}

}
