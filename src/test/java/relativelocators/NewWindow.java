package relativelocators;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindow {

	public static void main(String[] args) throws IOException 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/angularpractice");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.get("https://www.rahulshettyacademy.com");
		String text=driver.findElements(By.cssSelector("a[href*='java-for-automation-testers']")).get(1).getText();
		
		System.out.println(text);
		driver.switchTo().window(parentId);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		//taking screenshot for single elemenr
		name.sendKeys(text);
		File src=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Shubha\\screenshot1.png"));
		int g=name.getRect().getDimension().getHeight();
		int r=name.getRect().getDimension().getWidth();
		System.out.println(g);
		System.out.println(r);
		
		
		
		

	}

}
