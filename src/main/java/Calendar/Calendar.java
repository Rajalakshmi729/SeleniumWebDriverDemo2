package Calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Calendar {
	
		static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");

	driver.findElement(By.cssSelector(".text.form-control")).click();

	List<WebElement> dates = driver.findElements(By.className("day"));

	int count = driver.findElements(By.className("day")).size();

	for(int i=0;i<count;i++)
	{
	String text=driver.findElements(By.className("day")).get(i).getText();
	if(text.equalsIgnoreCase("23"))
	{
	driver.findElements(By.className("day")).get(i).click();
	break;
	}
	}
	}

	}