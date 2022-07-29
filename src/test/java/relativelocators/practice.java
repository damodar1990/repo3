package relativelocators;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice");
		WebElement wb=driver.findElement(By.id("inlineRadio2"));
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(wb)).getText());
	    
	    // WebElement wb1= driver.findElement(By.id("exampleInputPassword1"));
	     WebElement wb1= driver.findElement(By.className("form-check"));
	      driver.findElement(with(By.tagName("input")).below(wb1)).click();
	}

}
