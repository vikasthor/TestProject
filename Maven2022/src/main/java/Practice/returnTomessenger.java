package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class returnTomessenger {

	@FindBy (xpath="//a[text()=' Return to messenger.com ']")
	private WebElement returntopage ;

	
	public returnTomessenger (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Returnbackpage() {
		returntopage.click();
	}
	

	}


