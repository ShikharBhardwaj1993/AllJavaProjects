package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/");
		
		driver.findElement(By.xpath("//*[text() = 'Automobile']")).click();
		//driver.findElement(By.xpath("//*[text() = 'Next »']")).click();
		
		//driver.findElement(By.xpath("(//span[@class = 'ideal-radio'])[2]")).click();
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all'")).click();
		
		driver.findElement(By.xpath("//button[@name='Open Date of Manufacture Calender']")).click();
		
		//for (int i =0; i<2;i++){
		
		driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
		//driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
		
		//}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='1']")).click();
		
		
		
		
		//driver.findElement(By.xpath("//button[contains(@class,'ui-datepicker-trigger') and text()='1']")).click();
	
		
	
	
	
	
	}

}
