package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotDownload {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();

				driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
				Thread.sleep(3000);
				// open web page
				driver.get("https://chercher.tech/files/minion.zip");
				Thread.sleep(3000);
				// create object to robot class
				Robot robot = new Robot();
				// press tab first time
				robot.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(3000);
				// press tab second time
				robot.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(3000);
				// press enter key
				robot.keyPress(KeyEvent.VK_ENTER);
		}
	}