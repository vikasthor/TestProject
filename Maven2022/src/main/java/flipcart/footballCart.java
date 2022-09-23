package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class footballCart {

	@FindBy (xpath = "//a[text()='XXUMA Free Kick Football - Size: 5']")
    private WebElement football;
	
	@FindBy (xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
   private WebElement addtocart;
	
	@FindBy (xpath = "//input[@type='password']")
   private WebElement pswd;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
   private WebElement login;
	
	public footballCart (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonfootball()
	{
		football.click();
		
		
	}
	public void clickonfootballaddcart()
	{
		addtocart.click();
		
	}
	
}
