package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForCreatorPage {   
	
	@FindBy (xpath ="")
	private WebElement forCreator;
	
	public ForCreatorPage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnForcreator()
	{
		forCreator.click();	}

}
