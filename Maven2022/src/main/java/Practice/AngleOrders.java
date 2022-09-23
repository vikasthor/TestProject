package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngleOrders {
	@FindBy (xpath="//a[@id='mnOrders']")
	private WebElement order ;
	
	//@FindBy (xpath="//input[@id='chkSelectAll']")
	@FindBy (xpath="	")
	
	private WebElement checkbox ;
	

	@FindBy (xpath="//a[text()='Modify']")
	private WebElement modify;
	
	@FindBy (xpath="//input[@type='number']")
	private WebElement qty ;
	
	
	@FindBy (xpath="(//button[text()='SUBMIT'])[3]")
	private WebElement submit ;
	

	@FindBy (xpath="//button[text()='CONFIRM']")
	private WebElement confirm ;
	
	@FindBy (xpath="//a[text()='Cancel']")
	private WebElement cancel ;
	
	@FindBy (xpath="//button[text()='CONFIRM']")
	private WebElement cnf ;
	
	@FindBy (xpath="//button[text()='Ok']")
	private WebElement ok1 ;
	
	@FindBy (xpath="//button[text()='Ok']")
	private WebElement ok2 ;
	
	

	
	public  AngleOrders (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnOrder() {
		order.click();
		
	}
	public void checkbox12() {
		checkbox.click();
		
	}
	public void clickOnModify() 
	{
		modify.click();
		
	}
	

	
	public void clickOnbuy() {
		qty.click();
		qty.sendKeys("2");
	}
	
		public void submt() {
			submit.click();
	}
		public void cnf2() {
			cnf.click();
	}
		public void clickOnCancel() {
			cancel.click();
		}
		
			public void ok11() {
				ok1.click();
		}
			public void ok22() {
				ok2.click();
		}
		
}



