package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterHelp {
	
	@FindBy (xpath = "//div[@class='u01b-04__menu-toggle-icon '] ")
	private WebElement help;
	

      public  TwitterHelp (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnHelp()
      { 
    	 
    		 help.click();
      }
      

}
