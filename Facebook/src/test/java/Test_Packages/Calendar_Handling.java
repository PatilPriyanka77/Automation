package Test_Packages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;


public class Calendar_Handling {

        static WebDriver driver;

	    public static void main(String[] args) {
	        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-notification"); // Corrected this line
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();

	        driver.get("https://www.redbus.in/");

	        // Assuming getweekEnddates() is a method you have defined elsewhere
	        List<String> weekendDates = getweekEnddates("March 2024");
	        System.out.println(weekendDates);
	    }

	    // Placeholder for the getweekEnddates() method
	    public static List<String> getweekEnddates(String monthYear) {
	        // Implement your logic to get weekend dates for the given month and year
	    	
	    	 List<String> weekendDates = getweekEnddates("March 2024");
		        System.out.println(weekendDates);
	        return null;
	    }
	}


