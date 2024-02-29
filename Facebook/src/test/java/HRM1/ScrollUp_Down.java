package HRM1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  // Thread.sleep(3000);
		   driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		  
		   WebElement Try = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		   Thread.sleep(5000);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].scrollIntoView(true)",Try );
		 //  Try.click();

	}

}
