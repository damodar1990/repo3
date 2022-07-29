package Scroll;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
		List <WebElement> count=driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		int count1=driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]")).size();
		int sum=0;
		for(int i=0;i<count1;i++)
		{
		System.out.println(Integer.parseInt(count.get(i).getText()));
		sum=sum+Integer.parseInt(count.get(i).getText());

		
		}
		
        System.out.println("sum is:"+sum);
      System.out.println(driver.findElement(By.className("totalAmount")).getText());
   int total=  Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
   System.out.println(total);
   Assert.assertEquals(sum, total);
	}

}
