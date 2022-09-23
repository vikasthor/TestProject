package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterAccessibility1 {
	//@FindBy (xpath = "(//a[@class='u01b-02__child-link-href  twtr-type--roman-16  twtr-scribe-clicks'])[5]")
	@FindBy (xpath = "//a[text()='Accessibility']")
	private WebElement accessibility;
	

      public TwitterAccessibility1 (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnAccessibility ()
      { 
    	 
    	  accessibility.click();
      }
      
}
