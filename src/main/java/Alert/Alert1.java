package Alert;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;



public class Alert1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		   
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	
	driver.manage().window().maximize();


	                // Launch website

	                driver.get("https://www.tools4testing.com/contents/selenium/testpages/handling-javascript-pop-ups-testpage");

	               

	                driver.findElement(By.id("alert")).click();               

	                Alert alert = driver.switchTo().alert();

	                String textOnAlert = alert.getText();

	                Assert.assertEquals(textOnAlert, "www.tools4testing.com");

	                alert.accept();

	               

	                //wait some time before closing

	                try {

	                        Thread.sleep(7000);

	                } catch (InterruptedException ie) {

	                }



	               

	                //close the driver

	             //   driver.quit();

	       

	        }

	}