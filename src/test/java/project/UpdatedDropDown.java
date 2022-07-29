
package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.xpath("//*[@id='divpaxinfo']")).getText());
		/*int k=1;
		while(k<5)
		{
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();//if you want to click more than 1 time then use for or whiel loop
			k++;
		}*/
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.cssSelector("span[id='hrefIncAdt']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//*[@id='divpaxinfo']")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		
	}

}
