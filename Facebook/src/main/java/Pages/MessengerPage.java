package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage {
	
	@FindBy (xpath = "//a[text()='Features']")
	private WebElement featurelink;
	
	public MessengerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void openFeaturelink() {
		featurelink.click();
		
	 }

}
