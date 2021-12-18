package Webapp.BeatBlip.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class baseclass {

	
	public WebDriver driver ;
	
	public Logger log = Logger.getLogger("devpinoyLogger") ;
	
	Properties config = new Properties() ;
	
	@BeforeClass
	public void setupwebpage() throws IOException{
		
		BasicConfigurator.configure();
		
		File file = new File("C:\\Java Workspace\\BeatBlip\\config\\env") ;
		
		FileInputStream fis = new FileInputStream(file) ;
		
		config.load(fis);
		
		if(config.getProperty("browser").equalsIgnoreCase("chrome")){
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Desktop doc\\Driver new\\chromedriver.exe") ;
			driver = new ChromeDriver();
			log.info("Chrome browser");
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.get(config.getProperty("url"));
		log.info("Url working");
		
	}
	
}
