package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000L);
		/*driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);

		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();*/
		
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
	    driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		

}
}