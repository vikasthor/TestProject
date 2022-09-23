package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterResources{

	@FindBy (xpath="//span[text()='Resources']")
	private WebElement resource ;
	
	
	public  TwitterResources (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnresources() {
		resource.click();
		
	}
	

		
	
	
}
