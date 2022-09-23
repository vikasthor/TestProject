package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaBrokragecalC {

	@FindBy (xpath="(//a[text()='Brokerage calculator'])[2]")
	private WebElement BrokragecalC ;
	

	@FindBy (xpath="//a[text()='Downloads & resources']")
	private WebElement downloadresources ;
	
	public ZerodhaBrokragecalC (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void brokrageCalcopen() {
		BrokragecalC .click();
}

}