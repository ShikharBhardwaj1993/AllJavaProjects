package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice434 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Java Workspace\\Amazon\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");		
		
		Actions action = new Actions(driver) ;
		WebElement link = driver.findElement(By.xpath("//*[text() = 'Prime']")) ;
		action.moveToElement(link).click().perform();
		
		
		driver.findElement(By.id("a-autoid-0-announce")).click();
				
	}

}
