package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonbaby {

		
		@FindBy (xpath="//a[text()='Baby Products']")
		private WebElement babyproduct ;
		
		public amazonbaby (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		
		public void babyproductOpen() {
			 babyproduct.click();
	}

}
