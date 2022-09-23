package TestClass2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuList

{
	@FindBy (xpath ="//a[text()='Log in']")
	private WebElement menulist;
	
	@FindBy (xpath ="//button[@id='Features-section']")
	private WebElement feature;
	
	
	
	public MenuList (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnMenulist()
	{
	menulist.click();	}
	
	public void ClickOnFeature()
	{
	feature.click();	}


}


