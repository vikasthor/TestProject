package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AngleMarket {
	
	@FindBy (xpath="//a[@id='mnMarkets']")
	private WebElement market ;

	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement searchBox ;

	@FindBy (xpath="(//span[@class='header'])[2]")
	private WebElement sharename ;
	
	@FindBy (xpath="//a[text()='Buy']")
	private WebElement buy ;
	
	@FindBy (xpath="(//button[text()='SUBMIT'])[3]")
	private WebElement submit ;
	
	@FindBy (xpath="//button[text()='CONFIRM']")
	private WebElement confirm ;

	

	
	public  AngleMarket(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMarket() {
		market.click();
		
	}
	
	public void clickOnsearchBox()
	{
		searchBox.click();
		searchBox.sendKeys("BHEL");
	     
	}
	public void clickOnshare()
	{
		sharename.click();
	     
	}
	
	

	
	public void clickOnbuy() {
		buy.click();
	}
	
		public void submt() {
			submit.click();
	}
		public void cnf() {
			confirm.click();
	}

		
}


