package Limepay.Amazon.Common;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class common {
	
	
	public WebDriver Driver ;
	

	public common(WebDriver driver){
		
		this.Driver=driver;
		
	}

	public void screenshot() throws IOException{
		
				
		File screenshotFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(screenshotFile, new File("C:\\Java Workspace\\Amazon\\Screenshots\\firstscreenshot1.png"));
	
		
	}
	
	
	
	
	
}
