package TestClass2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BusinessPage {
	
	
	@FindBy (xpath = "//a[text()='Business'] ")
	private WebElement business;
	

      public BusinessPage (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnBusiness ()
      { 
    	 
    		 business.click();
      }
      
      
      
}
