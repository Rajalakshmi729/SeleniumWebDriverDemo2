package FindandFinds;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FindsElement {
	
		
			static WebDriver driver;

		public static void main(String[] args) throws InterruptedException, AWTException {
				   
				 WebDriverManager.chromedriver().setup();
			   driver = new ChromeDriver();
		driver.manage().window().maximize();	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://edition.cnn.com/");
		Thread.sleep(5000);
		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));
		WebElement fifthLinkElement = listOfLinks.get(5);
		System.out.println(fifthLinkElement.getText());
		for(int i=0;i<listOfLinks.size();i++) {
			WebElement link = listOfLinks.get(i);
			System.out.println(link.getText());
			}
		}
		}
	//for(WebElement e:listOfLinks) {
	//System.out.println(e.getText());
	//}


