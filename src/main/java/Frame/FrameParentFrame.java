package Frame;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameParentFrame {
			static WebDriver driver;
		public static void main(String[] args) throws InterruptedException, AWTException {
		    
		    
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	         driver.manage().window().maximize();

			// open webpage
			driver.get("https://chercher.tech/practice/frames");
			//find the frame1 and store it in webelement
			WebElement frame1 = driver.findElement(By.id("frame1"));
			// switch to frame1
			driver.switchTo().frame(frame1);
			// find the frame 3
			WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
			// switch to frame 3
			driver.switchTo().frame(frame3);
			// find the checkbox
			WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
			// if checkbox is not selected then click the checkbox
			if(! checkbox.isSelected()){
				checkbox.click();
			}
			// navigate to parent frame, which is frame 1
			driver.switchTo().parentFrame();
			// set the value of the textbar to the value stored
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
			// navigate to parent, which is page
			driver.switchTo().parentFrame();
			// store the text value
			String textValue = driver.findElement(By.xpath("//label/span")).getText();
			if(textValue.equals("selenium webdriver")){
				System.out.println("Topic value is equal to 'selenium webdriver'");
			}
			//switch to frame2
			driver.switchTo().frame("frame2");
			//find the dropdown
			WebElement dropdown = driver.findElement(By.tagName("select"));
			//Create object for select class
			Select sel = new Select(dropdown);
			//select the 'avatar' option
			sel.selectByVisibleText("Avatar");
		}
	}
