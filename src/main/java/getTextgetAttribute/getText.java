package getTextgetAttribute;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getText {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		   
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	  
	            driver.get("https://www.facebook.com/");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	            String FacebookText = driver
	                                    .findElement(By.xpath("//*[@class = '_8eso']")).getText();
	            System.out.println("Text on Facebook Site:- " + FacebookText);
	         //driver.close();
	      }
	  
	}


