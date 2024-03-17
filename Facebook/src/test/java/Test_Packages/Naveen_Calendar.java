package Test_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naveen_Calendar {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");			 
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		   driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		   Thread.sleep(3000);
		    WebElement monthTitle =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		    System.out.println(monthTitle);
		    
		   
		   

	}

}
