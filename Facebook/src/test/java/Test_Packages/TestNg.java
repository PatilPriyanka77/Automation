package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;

public class TestNg {
    private	WebDriver driver;
    private  LoginOrSignUpPage loginOrSignUpPage;
    private MessengerPage messangerpage;
	
	@BeforeClass
	public void launchBrowser()
	{
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   System.out.println("Before class");
	}
	
	@BeforeMethod
	public void goToMessangerPage()
	{      System.out.println("Before Method");	
	       driver.get("https://www.facebook.com/");
		   loginOrSignUpPage = new LoginOrSignUpPage(driver);
		   loginOrSignUpPage.openMessenger();
		   
	}
	
	@Test
	public void verifytheTitleofCurrentPage()
	{
        	System.out.println("test");	
	        String url=driver.getCurrentUrl();
	        String title =driver.getTitle();
	   
	        if(url.equals("https://www.messenger.com/") && title.equals("Messenger") ) {
		    System.out.println("Pass");
	         }
	        else {
		    System.out.println("Fail");    
		   
	   }
	}
	
	@Test 
	public void verifyFeatureLinkt() {
		   messangerpage = new MessengerPage(driver);
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
			
			
			@AfterMethod
			public void aftermethod()
			{ 
				System.out.println("After Method");	
				System.out.println("Logout Browser");
			}
		    @AfterClass
		    public void afterclass()
		    {
		    System.out.println("After class");	
		    driver.close();
		    }
		    
}


