package JavaScript;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class executeScript {

	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys("Raji@gmail.com");
		driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys("Raji@gmail.com");
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("document.getElementById('ctl00_CPHContainer_chkRememberMe').click()");
		driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']")).click();
		}
		}


