package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://www.facebook.com/");
		  
		  WebElement crNwAc=d.findElement(By.xpath("//a[text()='Create New Account']"));
		  crNwAc.click();
		  Thread.sleep(3000);
		  
		  WebElement day= d.findElement(By.xpath("//select[@aria-label='Day']"));
		  Select p= new Select (day);
		  p.selectByVisibleText("27");
		  Thread.sleep(3000);
		  
		  WebElement month = d.findElement(By.xpath("//select[@aria-label='Month']"));  
		  Select q= new Select(month);
		  q.selectByVisibleText("May");  
		  Thread.sleep(3000);
		  
		  WebElement year = d.findElement(By.xpath("//select[@aria-label='Year']"));  
		  Select r= new Select(year);
		  r.selectByVisibleText("2020");  
		  Thread.sleep(3000);
		  
		  WebElement name= d.findElement(By.xpath("(//input[@type='text'])[2]"));  
		 name.sendKeys("vikas"); 
		  Thread.sleep(3000);
		  
		  WebElement surName= d.findElement(By.xpath("(//input[@type='text'])[3]"));  
		 surName.sendKeys("thorat"); 
		  Thread.sleep(3000);
		  
		  WebElement mobile= d.findElement(By.xpath("(//input[@type='text'])[4]"));  
		  mobile.sendKeys("9022191041");  
		  Thread.sleep(3000);
		  
		  
		  
		  WebElement signUp=d.findElement(By.xpath(" (//button[@type='submit'] )[2]"));
		  signUp.click(); 
		 
	}

}
