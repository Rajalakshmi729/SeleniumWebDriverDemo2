package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotMouseScroll {
			static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver(); 
	driver.get("https://www.facebook.com");
	 
	// Create object of Robot class
	Robot robot = new Robot();
	 
	// Scroll MouseWheel
	robot.mouseWheel(5);
	 
	}
	 
	}