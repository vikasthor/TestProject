package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterSafety 
{
	@FindBy (xpath = "//a[text()='Safety and security'] ")
	private WebElement safety;
	

      public TwitterSafety (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnSefety()
      { 
    	 
    		 safety.click();
      }
      

}