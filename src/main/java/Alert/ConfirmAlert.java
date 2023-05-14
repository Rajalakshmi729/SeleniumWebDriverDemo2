package Alert;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;



public class ConfirmAlert {

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		
		driver.manage().window().maximize();


		                // Launch website

		                driver.get("https://www.tools4testing.com/contents/selenium/testpages/handling-javascript-pop-ups-testpage");


	               

	                	               

	                driver.findElement(By.id("confirm")).click();               

	                Alert confirmAlert = driver.switchTo().alert();

	                confirmAlert.accept();

	               

	                //wait some time before closing

	                try {

	                        Thread.sleep(7000);

	                } catch (InterruptedException ie) {

	                }

	               

	               

	                //close the driver

	               // driver.quit();

	       

	        }

	}