package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterAcSecurity {

	@FindBy (xpath = "(//a[@class='h03__link twtr-type--roman-300r'])[2]")
	private WebElement acSecurity;
	

      public TwitterAcSecurity  (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnAccountSecurity ()
      { 
    	 
    	  acSecurity.click();
      }
      
}
