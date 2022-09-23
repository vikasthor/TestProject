package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation03 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://www.amazon.in/");
		  
		  WebElement signIn=d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		  WebElement yourOrder=d.findElement(By.xpath("//span[text()='Your Orders']"));
		 
		  Actions act = new Actions (d);
		  
		  act.moveToElement(signIn).moveToElement(yourOrder).click().build().perform();
		  
		  WebElement email = d.findElement(By.xpath("//input[@type='email']"));  
		 email.sendKeys("vikasthorat4216@gmail.com");  
		  Thread.sleep(3000);
		  
		  WebElement continew=d.findElement(By.xpath("//input[@id='continue']"));
		  continew.click();
		  
		
		  
		
	}

}
