package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage
{
	
	@FindBy (xpath = "//a[text()='Login']")
     private WebElement homelogin;
	
	@FindBy (xpath = "//input[@class='_2IX_2- VJZDxU']")
    private WebElement mobileNu;
	
	@FindBy (xpath = "//input[@type='password']")
    private WebElement pswd;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
    private WebElement login;
	
	public loginpage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ClickonHomeLogin()
	{
		homelogin.click();
		
		
	}
	
	public void clickonMobNu()
	{
		mobileNu.click();
		 mobileNu.sendKeys("9022191041");
	}
	public void clickonPasswd()
	{
		pswd.click();
		pswd.sendKeys("9022191041");
	}
	public void clickonLogin()
	{
		login.click();
	}

}
