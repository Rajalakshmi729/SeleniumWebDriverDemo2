package RadioCheckBox;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsDisplayed {
//	Launch the web browser and open the application under test – https://duckduckgo.com/
//		Verify the web page title
//		Verify if the “Search Box” is displayed
//		Verify that the “Search Box” is enabled
//		If Search Box is enabled, then search for text – Selenium
//		Close the browser
//	
	 
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		   
			 WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
	
	driver.manage().window().maximize();

	      	        driver.get("https://duckduckgo.com/");
	 
	        // maximize the browser window
	        driver.manage().window().maximize();
	 
	        // declare and initialize the variable to store the expected title of the
	        // webpage.
	        String expectedTitle = "DuckDuckGo — Privacy, simplified.";
	 
	        // fetch the title of the web page and save it into a string variable
	        String actualTitle = driver.getTitle();
	 
	        // compare the expected title of the page with the actual title of the page and
	        // print the result
	        if (expectedTitle.equals(actualTitle)) {
	            System.out.println("Verification Pass- The correct title is displayed on the web page.");
	        } else {
	            System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
	        }
	 
	        // verify that the “Search" Box is displayed
	        WebElement searchBox = driver.findElement(By.id("search_form_input_homepage"));
	        if (searchBox.isDisplayed()) {
	            System.out.println("Search Box is visible. Return: " + searchBox.isDisplayed());
	        } else {
	            System.out.println("Search Box is not visible. Return: " + searchBox.isDisplayed());
	        }
	 
	        // verify that the “Search” Box is enabled
	        if (searchBox.isEnabled()) {
	            System.out.println("Search Box is enabled. Return: " + searchBox.isEnabled());
	            searchBox.sendKeys("Selenium");
	        } else {
	            System.out.println("Search Box is not enabled. Return: " + searchBox.isEnabled());
	        }
	 
	        System.out.println("Successful Execution of Test.");
	 
	        // close the web browser
	      //  driver.close();
	 
	    }
	}
