package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bestsellers {

	
		@FindBy (xpath="(//a[text()='Best Sellers'])[1]")
		private WebElement bestseller ;
		
		public bestsellers (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void clickOnMesseneger() {
			bestseller.click();
	}

}

	
