package RadioCheckBox;

import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Radio {
			
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
			
			   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		//Find the radio button for Gender "Male" by using its ID

		List<WebElement> elements = driver.findElements(By.id("u_0_7"));

		System.out.println("Number of elements:" +elements.size());

		       for(int i=0;  i<elements.size();  i++){

		       System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));

		       }

		  }

		}