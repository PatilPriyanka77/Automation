package HRM1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Public {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

          WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.get("https://www.facebook.com/");
         
         WebElement messager = driver.findElement(By.xpath("//a[@title='Take a look at Messenger.\']"));
         messager.click();
         String title = driver.getTitle();
            System.out.println(title);
              
         String title1 = driver.getCurrentUrl();
             System.out.println(title1);
             
             driver.quit();

	}

}
