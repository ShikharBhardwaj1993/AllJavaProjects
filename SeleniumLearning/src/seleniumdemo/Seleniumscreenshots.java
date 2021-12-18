package seleniumdemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Seleniumscreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.youtube.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/");
		
		try{
		driver.findElement(By.name("DownloadTrial3")).click();
		
		}catch (Throwable t){
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(screenshotFile, new File("C:\\Java Workspace\\SeleniumLearning\\Screenshots\\firstscreenshot1.png"));
		
			
		}
		
		
		
		
		
	}

}
