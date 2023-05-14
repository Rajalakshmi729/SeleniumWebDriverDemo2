package getTextgetAttribute;


import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class getTextgetAttribute {


		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		
		driver.manage().window().maximize();

	 
	             driver.get("https://www.amazon.com/");
	             driver.manage().window().maximize();
	 
	             WebElement AmazonSearchBox = driver.findElement(By.name("field-keywords"));
	             System.out.println("Name of the Email Textbox is:- " + AmazonSearchBox.getAttribute("name"));
	 
	             System.out.println("Class of the Email Textbox is:- " + AmazonSearchBox.getAttribute("class"));
	 
	             System.out.println("Value of the Email Textbox is:- " + AmazonSearchBox.getAttribute("tabindex"));
	 
	             System.out.println("Type of the Email Textbox is:- " + AmazonSearchBox.getAttribute("type"));
	 
	             System.out.println("Id of the Email Textbox is:- " + AmazonSearchBox.getAttribute("id"));
	 
	             // getAttibute() returns 'null' if there no such attribute
	 
	             System.out.println("Value of nonExistingAttribute is:- " + AmazonSearchBox.getAttribute("test"));
	 
	           // driver.close();
	       }
	 
	}
