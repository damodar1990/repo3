import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//links in whole page
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		//total link 
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//display the links in footer section

		 WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		 
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//total link in discount coupons
	    System.out.println(driver.findElement(By.xpath("//a[text()='Discount Coupons']")).getText());
		WebElement cldriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(cldriver.findElements(By.tagName("a")).size());
		int coun1=cldriver.findElements(By.tagName("a")).size();
		
		//4.click 
		
		for(int i=1;i<coun1;i++)
		{
			String clinkLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			cldriver.findElements(By.tagName("a")).get(i).sendKeys(clinkLink);
			Thread.sleep(1000L);
		}
		
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		{
			while(it.hasNext())
			{
			
				driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}}
