package JavaScript;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExecuteSync {
	
		
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.testyou.in/Login.aspx");
		driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys("ramansiva57@gmail.com");
		driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id='ctl00_CPHContainer_btnLoginn']")).click();
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeAsyncScript("window.setTimeout(function(){alert('Selected');},1000);alert('Please select Stay Signed In box');");
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		if(text.equals("Please select Stay Signed In box")){
		System.out.println("Valid message on the alert box");
		System.out.println(text);
		}
		else{
		System.out.println("Invalid message");
		}
		alert.accept();
		
		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		if(text1.equals("Selected")){
		System.out.println("Valid message on the alert box");
		System.out.println(text1);
		}
		else{
		System.out.println("Invalid message");
		}
		alert1.accept();
		}
		}