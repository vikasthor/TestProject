package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test1 {
	@FindBy (xpath ="//a[text()='Stories']")
	private WebElement stories;
	
	@FindBy (xpath ="//a[text()='Messenger']]")
	private WebElement messenger;
	
	
	
	public Test1 (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnmess()
	{
	messenger.click();	}
	
	public void ClickOnstories()
	{
	stories.click();	}


}

