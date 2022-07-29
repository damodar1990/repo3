package Http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brken2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		
	
		String url=	driver.findElement(By.cssSelector("a[href*='jmeter']")).getAttribute("href");
		
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
	    System.out.println(conn.getResponseCode());
	    System.out.println(conn.getURL());
		
	}
	

	}


