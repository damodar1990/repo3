package Scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll21 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		
		List<WebElement> count=driver.findElements(By.xpath("//table[@id='product'] //td[2]"));
		
		int count1= driver.findElements(By.xpath("//table[@id='product'] //td[2]")).size();
		
		for(int i=0;i<count1;i++)
		{
			//System.out.println( count.get(i).getText());
			System.out.println(count.size());
		}
		
		
		
		
	}

}
