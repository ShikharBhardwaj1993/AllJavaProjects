package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Microsoftweb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Edge driver\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.manage().window().maximize();
		wd.get("http://sampleapp.tricentis.com/101/");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
