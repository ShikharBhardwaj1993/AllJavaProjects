package seleniumdemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowswitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://sampleapp.tricentis.com/101/");
		
		driver.findElement(By.name("Download Trial")).click();
		
		Thread.sleep(4000);
		
		String ID1 = driver.getWindowHandle();
		
		Set<String> IDs = driver.getWindowHandles();
		
		//System.out.println(IDs);
		
		for (String x : IDs){
			
			if(!x.equals(ID1)){
				
				//System.out.print("1");
				driver.switchTo().window(x) ;
				driver.close();
			}
			
		}
		
		/*boolean IST = driver.findElement(By.xpath("//*[contains(text(),'Request a Demo')]")).isDisplayed();
		
		//System.out.print(IST);
		
		if(IST){
			
			System.out.print("Pass");
		}
		
		else{
			
			System.out.print("Fail");
			
		}*/
		
	}

}
