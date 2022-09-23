package Methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		for (int i=1 ; i<=5; i++)
		{
		
		TakesScreenshot take = (TakesScreenshot)driver;
		
		File src= take.getScreenshotAs(OutputType.FILE);
		
		
		File dest= new File ("C:\\Users\\thora\\OneDrive\\Desktop\\screenshot\\gau"+i+".jpeg");
		
		
		FileHandler.copy(src, dest);
		
		Thread.sleep(1000);
		
		}
		
		
		driver.close();
		
	}

}
