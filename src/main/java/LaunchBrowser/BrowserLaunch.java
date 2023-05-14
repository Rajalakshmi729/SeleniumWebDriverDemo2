package LaunchBrowser;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {



	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		   
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	driver.manage().window().maximize();	driver.get("http://demo.guru99.com/popup.php");			
		driver.manage().window().maximize();	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		// will return the id of the window where the driver focus is on.
//		String MainPage=driver.getWindowHandle();	
//		Set  s = driver.getWindowHandles();
//		for(String i:s){
//		if(i.equals(MainPage)
//		{
//		 driver.close();}
//		}
		
	}
	}