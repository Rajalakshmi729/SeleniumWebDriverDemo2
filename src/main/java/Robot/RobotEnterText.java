package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotEnterText {
	
	     
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	     driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	         
	        WebElement ele = driver.findElement(By.name("email"));
	         
	        int xaxis = ele.getLocation().x;
	        int yaxis = ele.getLocation().y;
	         
	        int width = ele.getSize().width;
	        int height = ele.getSize().height;
	         
	         
	        Robot r = new Robot();
	         
	        r.mouseMove(xaxis+width/2, yaxis+height/2);
	         
	        r.mousePress(KeyEvent.BUTTON1_DOWN_MASK);   // Mouse left button press
	        r.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);  // mOUSE left button release
	         
	        r.keyPress(KeyEvent.VK_CAPS_LOCK);
	        r.keyRelease(KeyEvent.VK_CAPS_LOCK);
	        Thread.sleep(2000);
	         
	        ele.sendKeys("Rajalakshmi"); // type name
	         
	         
	         
	         
	         
	 
	}
	     
	}
