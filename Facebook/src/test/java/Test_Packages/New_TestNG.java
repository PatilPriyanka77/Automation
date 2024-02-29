package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Desktop_Pages;
import Pages.LoginOrSignUpPage;

public class New_TestNG {
	private WebDriver driver;
	private Desktop_Pages desktop_Pages;
    private  LoginOrSignUpPage loginOrSignUpPage;
	
	
	@BeforeTest
	public void launchBrowser(String BrowserName )
	{
		if(BrowserName.equals("Chrome"))
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   System.out.println("Before class");
	}
	if(BrowserName.equals("Firefox"))
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
			 
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
		   
		   desktop_Pages = new Desktop_Pages(driver);
		   desktop_Pages.openDesktoplink();

	}
		   
		
	       
	       @Test
	   	public void verifytheDesktopPage() {

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
		   // driver.close();
		    }
		    



}

 


