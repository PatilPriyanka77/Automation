package Test_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthecticationPoP_up {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");			 
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
           System.out.println("Pass");
          String text =  driver.findElement(By.xpath("//div[@class=\"example\"]//p")).getText();
          System.out.println(text);
          driver.close();
	}

}
