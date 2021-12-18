package Webapp3.FacebookAutomation3.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

import Webapp3.FacebookAutomation3.Utility.Xls_Reader;

public class webBase3 {

	
	public WebDriver driver ;
	
	Xls_Reader excel ;
	
	Logger log = Logger.getLogger("devpinoyLogger");
	
	//Logger log ;
	
	Properties config = new Properties() ; 
	
	@BeforeMethod
	public void init() throws IOException {
		
		BasicConfigurator.configure() ;
		File file = new File("C:\\Java Workspace\\FacebookAutomation3\\Config\\env") ;
		
		FileInputStream fis = new FileInputStream(file) ;
		
		config.load(fis) ;
		
		//System.out.println(config.getProperty("browser"));
		
		if(config.getProperty("browser").equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Java Workspace\\FacebookAutomation3\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Chrome browser");
			
			
		}
		
		else if(config.getProperty("browser").equalsIgnoreCase("firefox")){
			
			System.setProperty("WebDriver.chrome.driver", "C:\\Java Workspace\\FacebookAutomation3\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(config.getProperty("browser").equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "C:\\Java Workspace\\FacebookAutomation3\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			log.info("Internet Explorer");
		}
		
		
		driver.get(config.getProperty("url")) ;
	
		log.info("Url working");
		/*8driver = new ChromeDriver() ;
		log = Logger.getLogger("devpinoyLogger");
		excel = new  Xls_Reader("") ;
		*/
		
		
		
	}
	
	
	
}
