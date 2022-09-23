package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteDashboard {
	
	@FindBy (xpath="//button[text()='Start investing ']")
	private WebElement startInvesting ;

	@FindBy (xpath="//input[@ icon='search']")
	private WebElement search ;
	
	@FindBy (xpath="(//button[@ type='button'])[4]")
	private WebElement buytab  ;
	
	@FindBy (xpath="(//label[@class='su-radio-label'])[5]")
	private WebElement AMO ;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement buy  ;
	
	

	
	public kiteDashboard (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void startInvesting () {
		startInvesting.click();
		
	}
	
	public void searchShare () {
		search.click();
		search.sendKeys("BHEL");
		search.clear();
	}
	
	public void clickOnBbuyTab()
	  {
		buytab.click();
	  }
	
	public void clickOnAMO()
	  {
		AMO.click();
	  }
		
	
	public void clickOnBuy()
	  {
		buy.click();
	  }
}

		
		