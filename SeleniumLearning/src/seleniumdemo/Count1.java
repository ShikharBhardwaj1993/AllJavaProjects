package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/");
		
		List<WebElement>  linke = driver.findElements(By.tagName("a"));
		
		
		//System.out.print(linke.size());
		
		for (WebElement x : linke){
			
			System.out.println(x.getText());
			
			
		}
		
		
		
		
		
		
		
	}

}
