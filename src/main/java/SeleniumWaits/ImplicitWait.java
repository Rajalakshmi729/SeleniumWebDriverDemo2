package SeleniumWaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	static WebDriver driver;


	    public static void main(String s[]) {
	    	
	   	 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();

	driver.manage().window().maximize();
	 
	       
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
	 
	        driver.get("http://google.com");
	 
	        driver.findElement(By.name("q")).sendKeys("Selenium");
	 
	        driver.findElement(By.xpath("//div[@class='sbic sb43']//ul/li[4]")).click();
	 
	        driver.close();
	    }
}