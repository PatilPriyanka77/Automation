package Test_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class WebTableCompare {
       
	
	

	
	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.w3schools.com/html/html_tables.asp");

	        // Find the table
	        WebElement table = driver.findElement(By.id("customers"));

	        // Get all rows
	        List<WebElement> rows = table.findElements(By.tagName("tr"));

	        // Skip the first row as it contains header cells
	        for (int i = 1; i < rows.size(); i++) {
	            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
	            String actualData = cells.get(0).getText(); // Assuming first cell contains the data you want to compare
	            String expectedData = "Your expected data"; // Define your expected data here

	            // Perform comparison
	            if (actualData.equals(expectedData)) {
	                System.out.println("Data in row " + i + " matches the expected data: " + actualData);
	            } else {
	                System.out.println("Data in row " + i + " does not match the expected data. Actual: " + actualData + ", Expected: " + expectedData);
	            }
	        }

	        // Close the browser
	        driver.quit();
	    }
	



	}


