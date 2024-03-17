package Test_Packages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Web_Table {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			 
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   driver.get("https://www.w3schools.com/html/html_tables.asp");
		   
		   List<WebElement>count = driver.findElements(By.xpath("//table[@id='customers']"));
		   
		   for(int i =0;i<count.size();i++) {
			   System.out.println(count.get(i).getText());
		   }
		   
		   System.out.println("Prgramme Excute");
		   
		 //  driver.close();
		  WebElement germany = driver.findElement(By.xpath("//table[@id='customers']//tr//td[1]"));
		  System.out.println(germany);
		  String actualtiltle = driver.getTitle();
		  String expectedTitle = "HTML Tables";
		  Assert.assertEquals(actualtiltle, expectedTitle);
	

	}

}
