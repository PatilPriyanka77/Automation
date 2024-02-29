package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;

public class VerifyReturnToMessangerButton {

	public static void main(String[] args) {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   driver.get("https://www.facebook.com/");
		   
		   LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		   loginOrSignUpPage.openMessenger();
		   
		   String url=driver.getCurrentUrl();
		   String title =driver.getTitle();
		   
		   if(url.equals("https://www.messenger.com/") && title.equals("Messenger") ) {
			   System.out.println("Pass");
		   }
		   else {
			   System.out.println("Fail");    
			   
		   }
		   
		   MessengerPage messangerpage = new MessengerPage(driver);
		   messangerpage.openFeaturelink();
		   
		   String url1=driver.getCurrentUrl();
		   String title1 =driver.getTitle();
		   
		   if(url1.equals("https://www.messenger.com/") && title1.equals("Messenger") ) {
			   System.out.println("Pass");
		   }
		   else {
			   System.out.println("Fail");    
			   
		   }
		   
		  
			   

	}

}
