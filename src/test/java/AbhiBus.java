import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.abhibus.com");
		driver.findElement(By.id("source")).click();
		driver.findElement(By.id("source")).sendKeys("Ban");
		
		List<WebElement> options=driver.findElements(By.className("ui-menu-item"));
		
		for(WebElement opt:options)
		{
			if(opt.getText().equalsIgnoreCase("Bangalore"))
			{
				opt.click();
				
			}
		}
			driver.findElement(By.id("destination")).click();
			driver.findElement(By.id("destination")).sendKeys("Mys");
			
			List<WebElement> options1=driver.findElements(By.className("ui-menu-item"));
			
			for(WebElement opt1:options1)
			{
				if(opt1.getText().equalsIgnoreCase("Mysore"))
				{
					opt1.click();
					
					
				}
			}
			
			
			
			/*while(!driver.findElement(By.cssSelector("div[id='ui-datepicker-div'] div[class='ui-datepicker-title']")).getText().contains("August 2022"));
			{
				driver.findElement(By.cssSelector("div[id='ui-datepicker-div'] a[title='Next']")).click();
			}*/
			
			driver.findElement(By.id("datepicker1")).click();
			List<WebElement> date1=driver.findElements(By.xpath("//a[@class='ui-state-default']"));
			
			int count=driver.findElements(By.className("ui-state-default")).size();
			
			for(int i=0;i<count;i++)
			{
				String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
				if(text.equalsIgnoreCase("25"))
				{
					driver.findElements(By.className("ui-state-default")).get(i).click();
					break;
				}
			}
			
			
				
		
		}
		
	
	}	
		
		

	


