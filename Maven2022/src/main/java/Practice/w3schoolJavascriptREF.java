package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3schoolJavascriptREF {

	@FindBy (xpath="(//a[text()='JavaScript Reference'])[1]")
	private WebElement javascriptREf ;
	


	
	public w3schoolJavascriptREF (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void JavaScriptreferncescopen() {
		javascriptREf .click();
}
}

