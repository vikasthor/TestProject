package flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpage {
	@FindBy (xpath = "//body//div//a//div")
    private WebElement cart;
	
	@FindBy (xpath = "//a[text()='RASCO BLACK CITY WITH FOOTBALL PUMP Football - Size: 5']")
   private WebElement cityball;
	
	@FindBy (xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
   private WebElement addtocart;
	
	@FindBy (xpath = "(//button[@type='submit'])[2]")
   private WebElement login;
	
	public cartpage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonCart()
	{
		cart.click();		
	}
	public void clickonCityball()
	{
		 cityball.click();
		 
	}
	public void clickonAddtoCart()
	{
		addtocart.click();
		
	}
	
}
