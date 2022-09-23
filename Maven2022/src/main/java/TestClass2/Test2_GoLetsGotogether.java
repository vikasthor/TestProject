package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test2_GoLetsGotogether {
	
	@FindBy (xpath = "")
	private WebElement letsGotogether;
	
	
	public Test2_GoLetsGotogether (WebDriver driver)
	{
		PageFactory.initElements(driver, this) ;
	}
	
	public void openLetsGopage()
	
	{
		letsGotogether.click();
	}
	
	

}
