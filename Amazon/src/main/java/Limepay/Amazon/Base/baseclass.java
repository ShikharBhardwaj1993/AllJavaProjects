package Limepay.Amazon.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class baseclass {

	public WebDriver driver ;
	
	Logger log = Logger.getLogger("devpinoyLogger") ;
	
	Properties config = new Properties() ;
	
	//Actions action = new Actions(driver) ;
	
	@BeforeClass
	public void openurl() throws IOException{
		
		File file = new File("C:\\Java Workspace\\Amazon\\config\\env") ;
		
		FileInputStream fis = new FileInputStream(file) ;
		
		config.load(fis);
		
		if(config.getProperty("browser").equalsIgnoreCase("chrome")){
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Java Workspace\\Amazon\\Driver\\chromedriver.exe") ;
			driver = new ChromeDriver();
			log.info("Chrome browser");
			
		}
		
		
		driver.get(config.getProperty("url"));
		log.info("Url working");
		
	/*	Actions action = new Actions(driver) ;
		WebElement link = driver.findElement(By.xpath("//*[text() = 'Prime']")) ;
		action.moveToElement(link).click().perform();
		*/
					}
		
}
