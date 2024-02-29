package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Desktop_Pages {
	
	@FindBy (xpath = "//a[text()='Desktop app']")
	private WebElement desktop;
	
	public Desktop_Pages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void openDesktoplink() {
		desktop.click();
		
	 }

}


