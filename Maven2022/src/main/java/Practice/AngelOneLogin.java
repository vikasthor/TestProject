package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelOneLogin {

	
	@FindBy (xpath="//input[@type='text']")
	private WebElement userName ;

	@FindBy (xpath="//input[@type='password']")
	private WebElement password ;
	
	@FindBy (xpath="//a[@id='loginBtn']")
	private WebElement signin ;
	
	@FindBy (xpath="(//button[@aria-label='Close'])[9]")
	private WebElement popup ;
	
	
	
	public AngelOneLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername() {
		userName.click();
		userName.sendKeys("S1629703");
	}
	
	public void sendPwd() 
	{
		password.click();
		password.sendKeys("Siddhant@123");
	}
	

	
	public void clickSignIn() {
		signin.click();
	}
	
		public void popup() {
			popup.click();
	}

}

