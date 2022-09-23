package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhdownloadresources  {

	@FindBy (xpath="//a[text()='Careers']")
	private WebElement carrier ;
	

	@FindBy (xpath="//a[text()='Downloads & resources']")
	private WebElement downloadresources ;
	
	public zerodhdownloadresources (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void downloadresourcespagetOpen() {
		downloadresources .click();
}

}