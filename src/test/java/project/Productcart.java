package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productcart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
		String name=products.get(i).getText();
		
		if(name.contains("Cucumber"))
		{
			driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			
		}
		if(name.contains("Brocolli"))
		{
			driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
			driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
			
			
		}
		driver.findElement(By.cssSelector("img[src='https://res.cloudinary.com/sivadass/image/upload/v1493548928/icons/bag.png']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		}

	}

}
