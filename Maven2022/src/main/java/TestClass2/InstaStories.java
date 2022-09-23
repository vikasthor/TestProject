package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstaStories {
	@FindBy (xpath = "(//div[@class='jroqu855 nthtkgg5'])[8] ")
	private WebElement story;
	

      public InstaStories (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnstoreis ()
      { 
    	 
    		story.click();
      }
      
}
