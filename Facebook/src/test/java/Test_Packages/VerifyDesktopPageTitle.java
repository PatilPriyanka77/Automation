package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Desktop_Pages;
import Pages.LoginOrSignUpPage;

public class VerifyDesktopPageTitle {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   driver.get("https://www.facebook.com/");
		   
		 //  LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		 //  loginOrSignUpPage.openMessenger();
		   
		   Desktop_Pages desktop_Pages = new Desktop_Pages(driver);
		   desktop_Pages.openDesktoplink();
		   
		   String url=driver.getCurrentUrl();
		   String title =driver.getTitle();
		   
		   if(url.equals("https://www.messenger.com/") && title.equals("Messenger") ) {
			   System.out.println("Pass");
		   }
		   else {
			   System.out.println("Fail");    
			   
		   }
		  driver.close();	   

	}

}
