package Facebbok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchFacebbok {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	         
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(5000);
	       
	       WebElement CeateNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
	       CeateNewAccount.click();
	       Thread.sleep(5000);
	       WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	       custom.click();
	       
	       Boolean abc=custom.isDisplayed();
	       
	       if(abc==true) {
	    	   System.out.println("checkbox is selected");
	       }
	       
	       else {
	    	   custom.click();
	    	   
	       }
	       
	       
	      
	       
	      
	       
	       
	       String Title =  driver.getTitle();
	       System.out.println(Title);
	       
	       String URL =driver.getCurrentUrl();
	       System.out.println(URL);
	        
	       
	       driver.close();
	       
	      // driver.navigate().to("https://www.selenium.dev/");
	      //driver.navigate().back();
	      // Thread.sleep(3000);
	      // driver.navigate().forward();
	      // Thread.sleep(3000);
	       //driver.navigate().refresh();

	}

}
