package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
//	@FindBy (xpath = "//input[@id='email']")
//	private WebElement userName;
//	
//	@FindBy (xpath = "//input[@id='pass']")
//	private WebElement password;
//	
//	@FindBy (xpath = "//button[@id='loginbutton']")
//	private WebElement loginButton;
//	
//	@FindBy (xpath = "//a[text()='Messenger']")
//	private WebElement messagener;
//	
//	
	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
    
//	public void loginToApplication() {
//		userName.sendKeys("priyanka.patil@gmail.com");
//		password.sendKeys("priya123");
//		loginButton.click();
//		
//	}
//	
//	public void openMessenger() {
//		messagener.click();
//		
//	 }
		
	}
