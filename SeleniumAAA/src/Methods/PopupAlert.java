package Methods;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static void main(String[] args)
	{
		System.setProperty ("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d = new ChromeDriver();
		  
		  d.get("https://www.w3schools.com/js/js_popup.asp");
		  
		  WebElement alert= d.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		  WebElement confirm = d.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		  WebElement prompt= d.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		  WebElement line= d.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		  
		  alert.click();
		  confirm.click();
		  prompt.click();
		  line.click();
		  
		  
		  String mainPage= d.getWindowHandle();
		  System.out.println(mainPage);
		  
		  ArrayList<String> listofAdd = new ArrayList<String>(d.getWindowHandles());
		/*
		  System.out.println(listofAdd.get(0));
		  System.out.println(listofAdd.get(1));
		  System.out.println(listofAdd.get(2));
		  System.out.println(listofAdd.get(3));
		  System.out.println(listofAdd.get(4));
	*/
		  
		  d.switchTo().window(listofAdd.get(1));
		  System.out.println(d.getCurrentUrl());
		/* 
		  d.switchTo().window(listofAdd.get(1));
		  System.out.println(d.getCurrentUrl());
		  
		  d.switchTo().window(listofAdd.get(2));
		  System.out.println(d.getCurrentUrl());
		  
		  d.switchTo().window(listofAdd.get(3));
		  System.out.println(d.getCurrentUrl());
		  
		  d.switchTo().window(listofAdd.get(4));
		  System.out.println(d.getCurrentUrl());
		*/  
	} 

}
