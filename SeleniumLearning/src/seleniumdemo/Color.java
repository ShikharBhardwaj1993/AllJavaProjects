package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\91\\61\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com/search?q=how+can+we+switch+multiple+windows+using+selenium&tbm=vid&sxsrf=AOaemvJNXc2QMEF0pJo7461QF28bxKh1vA:1633013032394&ei=KM1VYby4F5H50ASgo6yQBw&start=20&sa=N&ved=2ahUKEwi87NXN96bzAhWRPJQKHaARC3I4ChDy0wN6BAgBEFE&biw=1366&bih=568&dpr=1");
		driver.findElement(By.xpath("//a[@aria-label='Page 2']")).click() ;
		driver.findElement(By.xpath("//a[@aria-label='Page 3']")).click() ;
		driver.findElement(By.xpath("//a[@aria-label='Page 4']")).click() ;
		driver.findElement(By.xpath("//a[@aria-label='Page 5']")).click() ;
		
		
		for(int i =0;i<3;i++){
		driver.navigate().back();
		}
	
	}

}
