package LaunchBrowser;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {
	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				// open webpage
				driver.get("https://selenium:webdriver@chercher.tech/auth");
				// verify the title
				if(driver.getTitle().equals("Your authentication test is successful...!")){
					System.out.println("Test Passed");
				}else{
					System.out.println("Test failed");
				}
			}
		}