package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	
	driver.manage().window().maximize();
		// Open URL
		driver.get("https://www.techlistic.com/p/selenium-tutorials.html");

		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Users\\Admin\\TestingAssignment\\SeleniumAssignments\\target\\ScreenShot\\google.png"));
			
	  }
	}