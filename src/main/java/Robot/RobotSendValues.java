package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager

public class RobotSendValues {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
	    
	    
		 WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com/");
	    
	   //Enter username 
	   driver.findElement(By.name("email")).sendKeys("Selenium123@gmail.com");
	    
	   //create object of Robot class
	   Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_SHIFT);  
	    
	   //Enter password
	   driver.findElement(By.name("pass")).sendKeys("Selenium123");
	    
	   //Hit Enter of keyboard using Robot Class
	    r.keyPress(KeyEvent.VK_ENTER);
	    
	   //Release Enter
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    

	   }

	}

