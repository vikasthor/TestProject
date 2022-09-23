package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1_GoCreate {
	
	@FindBy (xpath= "")
	private WebElement goCreate;
	
	
	public Test1_GoCreate (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void GotoCreatePage()
	{
		goCreate.click();
	}
}
