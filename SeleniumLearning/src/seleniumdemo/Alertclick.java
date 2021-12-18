package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("(//div[@class = 'col'])/button")).click();
		
		Thread.sleep(2000);
		
		//driver.switchTo().alert().
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().;
		
		
		
		
		
	}

}
