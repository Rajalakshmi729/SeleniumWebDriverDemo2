package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotFileUpload {
		 
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         
	         
	         
	         // Specify the file location
	         StringSelection sel = new StringSelection("E:\\Resume.docx");
	          
	         // Copy to clipboard
	         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	         System.out.println("selection" +sel);
	          
	          
	        // Open naukri.com
	        driver.get("https://www.naukri.com/account/register/basicdetails");
	         
	        //Click on upload resume button
	       // driver.findElement(By.name("userType")).click();
	        //Thread.sleep(3000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,600)","");
	        //Click on upload resume button
	        driver.findElement(By.linkText("Upload Resume")).click();
	         Thread.sleep(1000);
	         
	        // Create object of Robot class
	         Robot robot = new Robot();
	         Thread.sleep(1000);
	               
	          // Press Enter
	         robot.keyPress(KeyEvent.VK_ENTER);
	          
	        // Release Enter
	         robot.keyRelease(KeyEvent.VK_ENTER);
	          
	          // Press CTRL+V
	         robot.keyPress(KeyEvent.VK_CONTROL);
	         robot.keyPress(KeyEvent.VK_V);
	          
	        // Release CTRL+V
	         robot.keyRelease(KeyEvent.VK_CONTROL);
	         robot.keyRelease(KeyEvent.VK_V);
	         Thread.sleep(1000);
	                 
	         //Press Enter 
	         robot.keyPress(KeyEvent.VK_ENTER);
	         robot.keyRelease(KeyEvent.VK_ENTER);
	          
	         
	    }
	}