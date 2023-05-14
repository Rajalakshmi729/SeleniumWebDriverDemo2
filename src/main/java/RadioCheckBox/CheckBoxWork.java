package RadioCheckBox;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;

public class CheckBoxWork {
 
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		
		driver.manage().window().maximize();
                    

	                // Launch website

	                driver.get("https://www.tools4testing.com/contents/selenium/testpages/registration-form-testpage");
              

	                //Select checkbox

	                driver.findElement(By.id("newsletter")).click();

	                //Check is radio is selected

	                Assert.assertTrue(driver.findElement(By.id("newsletter")).isSelected());               
               

	 

	                //wait some time before closing

	                try {

	                        Thread.sleep(7000);

	                } catch (InterruptedException ie) {

	                }

	               

	                //close the driver

	                //driver.quit();

	        }

	}