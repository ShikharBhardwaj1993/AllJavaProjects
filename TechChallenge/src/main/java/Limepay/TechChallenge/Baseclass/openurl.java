package Limepay.TechChallenge.Baseclass;

import org.openqa.selenium.By;
//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class openurl {

	public WebDriver driver ;
	
	//Logger log = Logger.getLogger("devpinoyLogger");
	
	@Test
	public void hous() throws InterruptedException{
				
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\91\\61\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://mage2-firecheckout-osc.tst.limep.net/");
		Thread.sleep(4000);
		
	WebElement mkd = driver.findElement(By.id("ui-id-3"));
	
	mkd.click();
	
	driver.findElement(By.xpath("//body[@data-container = 'body']")).click();
	
	//Thread.sleep(3000);
		//Select select = new Select(mkd) ;
		//Thread.sleep(3000);
		//select.selectByVisibleText("Tees");
		
		
	}
			








}
