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

import Pages.LoginOrSignUpPage;
import Pages.MessengerPage;

public class TestNg {
    private	WebDriver driver;
    private  LoginOrSignUpPage loginOrSignUpPage;
    private MessengerPage messangerpage;
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
	       }
		  	    }
	@BeforeClass
	public void createPOMobject() {
		 loginOrSignUpPage = new LoginOrSignUpPage(driver);
		 messangerpage = new MessengerPage(driver);
		
	}
	@BeforeMethod
	public void goToMessangerPage()
	{     
	       driver.get("https://www.facebook.com/");
		  // loginOrSignUpPage = new LoginOrSignUpPage(driver);
		   loginOrSignUpPage.openMessenger();
		    soft = new SoftAssert();
		   
	}
	
	@Test
	public void verifytheTitleofCurrentPage()
	{
        	System.out.println("test");	
	        String url=driver.getCurrentUrl();
	        String title =driver.getTitle();
	        soft.assertEquals(url, "https://www.messenger.com/");
	        soft.assertEquals(title, "Messenger");
	        soft.assertAll();
	}
	        
	   
//	        if(url.equals("https://www.messenger.com/") && title.equals("Messenger") ) {
//		    System.out.println("Pass");
//	         }
//	        else {
//		    System.out.println("Fail");    
//		   
	      
	
	
	       @Test 
	       public void verifyFeatureLinkt() {
		  // messangerpage = new MessengerPage(driver);
		   messangerpage.openFeaturelink();
		   
		   String url1=driver.getCurrentUrl();
		   String title1 =driver.getTitle();
		   
	        soft.assertEquals(url1, "https://www.messenger.com/features");
	        soft.assertEquals(title1, "Messenger features");
	        soft.assertAll();
	        
		   
//		   if(url1.equals("https://www.messenger.com/") && title1.equals("Messenger") ) {
//			   System.out.println("Pass");
//		   }
//		   else {
//			   System.out.println("Fail");    
//			   
//		   }
		   
		  
			   

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
		    	loginOrSignUpPage = null;
				 messangerpage = null;
		    	
		        System.out.println("After class");	
		  
		    }
		    @AfterTest
		    public void closeBrowser() {
		     //  driver.close();
		       driver=null;
		       System.gc();
		    	
		    }
		    
}


