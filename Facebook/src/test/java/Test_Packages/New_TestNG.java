package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.Desktop_Pages;
import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;

public class New_TestNG {
	private WebDriver driver;
	private Desktop_Pages desktop_Pages;
    private LoginOrSignUpPage loginOrSignUpPage;
    private SoftAssert soft;
	
	@Parameters("Browser")
	@BeforeTest
	public void launchBrowser(String browserName )
	{
		if(browserName.equals("Chrome")) {
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   System.out.println("Before class");
	}
	       if(browserName.equals("Firefox")) {
	       System.setProperty("webdriver.gecko.driver","C:\\New folder\\geckodriver-v0.34.0-win32\\geckodriver.exe");
			 
		   driver = new FirefoxDriver();
		   driver.manage().window().maximize();
		   System.out.println("Before class");
	}
	}
	@BeforeClass
	public void createPOMobject() {
		 loginOrSignUpPage = new LoginOrSignUpPage(driver);
		 desktop_Pages = new Desktop_Pages(driver);
		
	}
	@BeforeMethod
	public void goToMessangerPage()
	{      System.out.println("Before Method");	
	       driver.get("https://www.facebook.com/");
		  // loginOrSignUpPage = new LoginOrSignUpPage(driver);
		   loginOrSignUpPage.openMessenger();
		   
		  // desktop_Pages = new Desktop_Pages(driver);
		   desktop_Pages.openDesktoplink();
		   soft = new SoftAssert();
		   

	}
		   
		
	       
	       @Test
	   	public void verifytheDesktopPage() {

		        String url=driver.getCurrentUrl();
		        String title =driver.getTitle();
		    
		        soft.assertEquals(url, "https://www.messenger.com/desktop");
		        soft.assertEquals(title, "Download Messenger for PC/Mac – text, audio and video calls");
		        soft.assertAll();
		   
//		        if(url.equals("https://www.messenger.com/") && title.equals("Messenger") ) {
//			     System.out.println("Pass");
//		         }
//		       else {
//			    System.out.println("Fail");    
//			   
//		         }
//		      
	    	   
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
		      desktop_Pages=null;
		      loginOrSignUpPage=null;
		   // driver.close();
		    }
		    
		    @AfterTest
		    public void closeBrowser() {
		   //    driver.close();
		       driver=null;
		       System.gc();
		    	
		    }
		    



}

 


