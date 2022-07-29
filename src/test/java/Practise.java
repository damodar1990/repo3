import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    WebElement linkDriver=  driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	    System.out.println(linkDriver.findElements(By.tagName("a")).size());
	    WebElement linkDriver1=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(linkDriver1.findElements(By.tagName("a")).size());
	    for(int i=1;i<=linkDriver1.findElements(By.tagName("a")).size();i++)
        {
	       String clickString=Keys.chord(Keys.CONTROL,Keys.ENTER);
	       linkDriver1.findElements(By.tagName("a")).get(i).sendKeys(clickString);
	    		   
        }
	    
	   Set<String>set1= driver.getWindowHandles();
	    Iterator<String>it= set1.iterator();
	    
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	    }
	    
		

	}

}
