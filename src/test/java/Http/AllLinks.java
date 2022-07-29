package Http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,2000)");
		
	List<WebElement>links=driver.findElements(By.xpath("//li[@class='gf-li'] //a"));
	

	
	
	for(WebElement link:links)
	{
		String url=link.getAttribute("href");
	
	HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
    int resp=conn.getResponseCode();
    System.out.println(resp);
    if(resp>400)
    {
    	System.out.println(link.getText());
    }
   
    
	
	}}

}
