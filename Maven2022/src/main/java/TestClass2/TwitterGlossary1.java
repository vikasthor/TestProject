package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterGlossary1 {
	//@FindBy (xpath = "(//a[@class='u01b-02__child-link-href  twtr-type--roman-16  twtr-scribe-clicks'])[2]")
	@FindBy (xpath = "//a[text()='Glossary']")
			
	private WebElement glossery;
	

      public TwitterGlossary1 (WebDriver driver)
      {
    	  
    	  PageFactory.initElements(driver, this);
      }
      
      public void ClickOnGossery ()
      { 
    	 
    	  glossery.click();
      }
      
}
