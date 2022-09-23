package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args)
{
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		  
		  
		  WebElement img =d.findElement(By.xpath("//img[@src='img_w3slogo.gif']"));
		  WebElement box =d.findElement(By.xpath("//div[@id='div2']"));
		 
		  Actions act = new Actions (d);
		  
		  act.dragAndDrop(img, box).build().perform();
		  
		  System.out.println("End");

		
	}

}
