package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterCompromisedAccount {
	@FindBy (xpath = "(//a[@class='h03__link twtr-type--roman-300r'])[1]")
	private WebElement compAc;
	

      public TwitterCompromisedAccount  (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnComproAccount ()
      { 
    	 
    		 compAc.click();
      }
      
      
      
}