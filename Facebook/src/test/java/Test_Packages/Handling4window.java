package Test_Packages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling4window {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");			 
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.w3schools.com/js/js_popup.asp");
		   WebElement confirm =driver.findElement(By.xpath("(//a[text()='Try it Yourself »' ])[2]")); 
		   WebElement prompt =driver.findElement(By.xpath("(//a[text()='Try it Yourself »' ])[3]"));
		   WebElement link =driver.findElement(By.xpath("(//a[text()='Try it Yourself »' ])[4]"));
		   
		   confirm.click();
		   prompt.click();
		   link.click();
		   String mainAddress=driver.getWindowHandle();
		   System.out.println(mainAddress);
		   
		   ArrayList<String> add= new ArrayList<String>(driver.getWindowHandles());
		   System.out.println(add.get(0));
		   System.out.println(add.get(1));
		   System.out.println(add.get(2));
		   System.out.println(add.get(3));
		   
		   driver.switchTo().window(add.get(0));
		   System.out.println(driver.getCurrentUrl());
		   
		   
		   
		   
		   

	}

}
