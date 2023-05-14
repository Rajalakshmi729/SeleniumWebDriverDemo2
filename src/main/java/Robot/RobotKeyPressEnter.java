package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent; 
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RobotKeyPressEnter {
	
		static WebDriver driver;
	@Test
	public void TestRobo() throws Exception{
		
		   
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
	     // Open facebook
	     driver.get("http://www.facebook.com");
	     // Enter Username
	     //driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
	     driver.findElement(By.id("email")).sendKeys("abc@gmail.com");//Enter your Email
	     // Enter password
	     driver.findElement(By.id("pass")).sendKeys("abc@12345");//Enter your password
	     // Create object of Robot class
	     Robot r=new Robot();
	     // Press Enter
	     r.keyPress(KeyEvent.VK_ENTER);
	     // Release Enter
	     r.keyRelease(KeyEvent.VK_ENTER);


	}
	}