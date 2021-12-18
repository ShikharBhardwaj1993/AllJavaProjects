package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\91\\61\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
		//System.out.print(driver.getTitle());
		String d = driver.getTitle();
		
		System.out.print(d);
		
		
		
	}

}
