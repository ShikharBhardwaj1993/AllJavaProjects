package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdayone {

	private static final By Xpath = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("shikharbhardwaj1993@gmail.com");
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("@nishub2993");
		//driver.findElement(arg0)Xpath=//*[@id=’email_01’]);
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
	}

}
