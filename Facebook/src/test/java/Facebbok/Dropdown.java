package Facebbok;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	       WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	         
	       driver.get("https://www.facebook.com/");
	       Thread.sleep(5000);
	       
	       WebElement CeateNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
	       CeateNewAccount.click();
	       Thread.sleep(5000);
	       
	       WebElement birthdate = driver.findElement(By.xpath("//select[@id='day']"));
           Select s= new Select(birthdate);
           s.selectByIndex(17);
           System.out.println(s);

	}

}
