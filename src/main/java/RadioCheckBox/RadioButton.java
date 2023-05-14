package RadioCheckBox;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {
	

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		   
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	              driver.get("http://sites.ecanarys.com/Nopcommercesite/");

	              driver.manage().window().maximize();

	              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	             

	              //Clicking on the Register link on the Home page

	              driver.findElement(By.linkText("Register")).click();

	             

	              //Identifying Male radio button using its ID as an locator

	              WebElement maleRadioBtn = driver.findElement(By.id("gender-male"));

	             

	              //Checking if the Male Radio button is displayed on the Webpage and printing the status

	              boolean radioBtnIsDisplayed = maleRadioBtn.isDisplayed();

	              System.out.println("Is Male radio button displayed: "+radioBtnIsDisplayed);

	             

	              //Checking if the Male Radio button is enabled on the webpage and printing the status

	              boolean radioBtnIsEnabled = maleRadioBtn.isEnabled();

	              System.out.println("Is Male radio button enabled: "+radioBtnIsEnabled);

	             

	              //Checking the default radio button selection status

	              boolean radioBtnIsSelected = maleRadioBtn.isSelected();

	              System.out.println("Default Radio button selection Status: "+radioBtnIsSelected);

	             

	              //Selecting male radio button

	              maleRadioBtn.click();

	             

	              //rechecking the male radio button selection status and printing it..

	              boolean radioBtnNewSelectionStatus = maleRadioBtn.isSelected();

	              System.out.println("Male radio Selection status after perform click() event: "+radioBtnNewSelectionStatus);

	              driver.quit();

	       }

	}