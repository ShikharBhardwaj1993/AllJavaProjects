package WebApp.FacebookAutomation.BaseClass;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
//import org.junit.Test;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import Utility.Xls_Reader;

public class webBaseTest {
		
	//Driver,Excel,Logger.....
	
	WebDriver driver; 
	
//	Xls_Reader excel ;
	
	Logger log ;
	
	Properties config = new Properties();//inorder to configure env.properties file we need call properties class and create object 
	
	@Test
	public void init() throws IOException{  //A method which will initialize all of them
		
		
	//Now we have to get env.properties file read
		
		File file = new File("C:\\Java Workspace\\FacebookAutomation\\Config\\env.properties");
		FileInputStream fis = new FileInputStream(file) ;
		config.load(fis);
		
		System.out.println(config.getProperty("browser"));
		
		/*driver = new ChromeDriver() ;
		excel = new Xls_Reader("");
		log = Logger.getLogger("devpinoyLogger");
		*/
		
		
		
		
		
	}
	
	
	
	
	//}
}
