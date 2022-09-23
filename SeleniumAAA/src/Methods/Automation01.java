package Methods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automation01 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://trade.angelbroking.com/Login");
		  
		  
		  //WebElement crNwAc=d.findElement(By.xpath("//a[text()='Messenger']"));
		//  crNwAc.click();
		  
		  WebElement username=d.findElement(By.xpath("//input[@type='text']"));
          username.click();
          username.sendKeys("FRO533");
		  Thread.sleep(3000);
		  
		  WebElement pwd=d.findElement(By.xpath("//input[@type='password']"));
          pwd.click();
          pwd.sendKeys("Vikas@123");
		  Thread.sleep(3000);
		  
		  
		  WebElement sign= d.findElement(By.xpath("//a[@id='loginBtn']"));
		  sign.click();
        
		/* Thread.sleep(3000);
		  
		  Select p= new Select (day);
		  p.selectByVisibleText("27");
		  Thread.sleep(3000);
		  
		  WebElement month = d.findElement(By.xpath("//select[@aria-label='Month']"));  
		  Select q= new Select(month);
		  q.selectByVisibleText("Mar");  
		  Thread.sleep(3000);
		  
		  WebElement year = d.findElement(By.xpath("//select[@aria-label='Year']"));  
		  Select r= new Select(year);
		  r.selectByVisibleText("2020");  
		  Thread.sleep(3000);*/
		  
		 
		 
		    
	}

}
