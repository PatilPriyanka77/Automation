package Test_Packages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableTilele {
	

	     public static void main(String[] args) {


        // Set the path to chromedriver executable
	    		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();


         // Navigate to the webpage
        driver.get("https://www.w3schools.com/html/html_tables.asp"); // Replace with your URL

        // Locate the table
        WebElement table = driver.findElement(By.id("customers"));

        // Find all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Loop through each row
        for (WebElement row : rows) {
            // Find all cells in the row
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Loop through each cell and print the text
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + "\t");
            }
            System.out.println(); // Print a new line after each row
        }

        // Close the browser
        driver.quit();
    }


	}


