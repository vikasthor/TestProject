package Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableFormatPrint {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  Thread.sleep(3000);
		
		  List <WebElement> col = driver.findElements(By.xpath("//table[@id='customers']//th"));
		  List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr")); 
		  System.out.println("Number of columns:"+col.size());
		  System.out.println("---------");
		  System.out.println("Number of rows:"+row.size());
		  System.out.println("---------");
		  System.out.println("TablePrint:");
		  System.out.println("---------");
		  
		  
		  
		  for (int i=0; i<row.size(); i++)
		  {
				System.out.println(row.get(i).getText()+" ");
				 }
				
			
		  }
	}


	
	


	

