package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class visitHelpCenter {

	@FindBy (xpath="//body/div //a[2]")
	private WebElement visitHelpCenter ;

	
	public visitHelpCenter (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void toVisitHelpCenter() {
		 visitHelpCenter.click();
	}
	

	}


