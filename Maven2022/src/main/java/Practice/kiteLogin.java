package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin {
	
	@FindBy (xpath="//input[@type='text']")
	private WebElement userId ;

	@FindBy (xpath="//input[@type='password']")
	private WebElement pwd ;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement login  ;
	
	@FindBy (xpath="//input[@id='pin']")
	private WebElement pin  ;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement continw ;
	
	
	public kiteLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void writeUsername () {
		userId.click();
		userId.sendKeys("FR0533");
	}
	
	public void sendpwd () {
		pwd.click();
		pwd.sendKeys("15451545");
	}
	
	public void clickOnlogin()
	  {
		login.click();
	  }
		
    public void sendpin() {
			pin.click();
			pin.sendKeys("154515");
			
	}
    
    public void clickOnContinw()
	  {
		continw.click();
	  }

    
}





