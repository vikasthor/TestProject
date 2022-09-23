package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rooms {

	@FindBy (xpath="//a[text()='Rooms']")
	private WebElement room ;

	
	public Rooms (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRoom() {
		room.click();
	}
	}


