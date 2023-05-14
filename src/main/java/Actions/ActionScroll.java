package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionScroll {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      //URL launch
	      driver.get("https://www.tutorialspoint.com/index.htm");
	      // object of Actions class to scroll up and down
	      Actions at = new Actions(driver);
	      at.sendKeys(Keys.PAGE_DOWN).build().perform();
	      //identify element on scroll down
//	      WebElement l = driver.findElement(By.linkText("Latest Courses"));
//	      String strn = l.getText();
	  System.out.println("Text obtained by scrolling down is :");
	//
	      at.sendKeys(Keys.PAGE_UP).build().perform();
//	      //identify element on scroll up
//	      WebElement m = driver.findElement(By.tagName("h4"));
//	      String s = m.getText();
	      System.out.println("Text obtained by scrolling up is :");
	     // driver.quit();
	   }
	}