package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uron {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://www.facebook.com/");
		  
		  WebElement crNwAc=d.findElement(By.xpath("//a[text()='Create New Account']"));
		  crNwAc.click();
		  
		  
		 



	}

}
