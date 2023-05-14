package Frame;


import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FrameAssign1 {
	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	 
		   
		   driver.manage().window().maximize();
		   driver.get("https://developer.mozilla.org/en/docs/Web/HTML/Element/iframe");

		   // switching by index
		   driver.switchTo().frame(0);

		   driver.switchTo().defaultContent();

		   System.out.println("H1 content of main page : "
		   + driver.findElement(By.tagName("h1")).getText());

		   // switching by id
		   driver.switchTo().frame("frame_Example1");

		   driver.switchTo().defaultContent();
		   System.out.println("H1 content of main page : "
		   + driver.findElement(By.tagName("h1")).getText());

		   WebElement frameElement = driver.findElement(By.id("frame_Example2"));

		   // switching by WebElement
		   driver.switchTo().frame(frameElement);

		   driver.switchTo().defaultContent();
		   System.out.println("H1 content of main page : "
		   + driver.findElement(By.tagName("h1")).getText());

		   }
		   }

