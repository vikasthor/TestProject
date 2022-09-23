package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhhaSignup {

	@FindBy (xpath="(//a[text()='Signup'])[1]")
	private WebElement signup ;
	
	public ZerodhhaSignup (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void zerodhasignupopen() {
		 signup.click();
}

}
