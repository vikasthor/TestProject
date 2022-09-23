package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class w3schoolREF {

	@FindBy (xpath="//a[@id='navbtn_references']")
	private WebElement referances ;
	


	
	public w3schoolREF (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void referncescopen() {
		referances .click();
}

}