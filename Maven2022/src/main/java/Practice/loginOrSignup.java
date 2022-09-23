package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginOrSignup {

		@FindBy (xpath="//input[@type='text']")
		private WebElement userName ;

		@FindBy (xpath="//input[@type='password']")
		private WebElement password ;
		
		@FindBy (xpath="//a[text()='Messenger']")
		private WebElement Messenger ;
		
		
		public loginOrSignup (WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		public void sendusername() {
			userName.sendKeys("thoratvikas@gmail.com");
		}
		
	
		
		public void clickOnMesseneger() {
			Messenger.click();
		}

	}


