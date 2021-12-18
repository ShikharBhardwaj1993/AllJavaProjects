package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjwlrqHBhByEiwAnLmYUEMBl16dxkcgjII0hFgVFiH1bQ4_MIui7yv74zhLNysqKew5HTb0KhoCK6IQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwlrqHBhByEiwAnLmYUEMBl16dxkcgjII0hFgVFiH1bQ4_MIui7yv74zhLNysqKew5HTb0KhoCK6IQAvD_BwE");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[text() = 'Prime']"))).perform();
		
		
		
		
		
		
		
	}

	private static void Action(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
