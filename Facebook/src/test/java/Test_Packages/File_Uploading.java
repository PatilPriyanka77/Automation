package Test_Packages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Uploading {

	public static void main(String[] args) {


	           	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

                 // Initialize ChromeDriver
                 WebDriver driver = new ChromeDriver();


		        // Navigate to the webpage
		        driver.get("https://omayo.blogspot.com/"); // Replace with your URL

		        // Locate the file input element
		        WebElement fileInput = driver.findElement(By.id("fileUpload"));

		        // Provide the file path to upload
		        String filePath = "C:\\Users\\SAGAR DESHMUKH\\Downloads"; // Replace with the path to your file
		        fileInput.sendKeys(filePath);

		        // Wait for some time to see the result
		        try {
		            Thread.sleep(3000); // 3 seconds
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Close the browser
		        driver.quit();
		  

	}

}
