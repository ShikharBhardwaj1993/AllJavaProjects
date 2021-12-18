package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDayoneproject {

	@Test(priority=1,description="Test case 1",enabled=false) //Annotation
	public void varifyFacebooklogin(){
		
		System.out.println("SuccessfullyLogin");
		/*
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("shikharbhardwaj1993@gmail.com");
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("@nishub2993");
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		
		boolean deb = driver.findElement(By.xpath("//div[@class = '_9ay7']")).isDisplayed() ;
		
		if(!deb){
			
			Assert.assertTrue(true);
			//System.out.println("Pass1");
		}
		else{
			
			Assert.assertTrue(false);
			//System.out.println("Fail1");
		}
		
		*/
	}
	
	
	@Test(priority=2,description="Test case 2",enabled=false) //Annotations
	public void Alogin2(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("shikharbhardwaj1993@gmail.com");
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("@nishub2993");
		driver.findElement(By.xpath("//button[@name = 'login']")).click();
		driver.findElement(By.xpath("//a[@class = '_97w4']")).click();
		
	}
	
	//_9ay7
	
	
	
	@Test(priority = 3,description = "asdffgghh",enabled = true)
	public void testcase3(){
	

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\91\\61\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_CjwKCAjwlrqHBhByEiwAnLmYUEMBl16dxkcgjII0hFgVFiH1bQ4_MIui7yv74zhLNysqKew5HTb0KhoCK6IQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwlrqHBhByEiwAnLmYUEMBl16dxkcgjII0hFgVFiH1bQ4_MIui7yv74zhLNysqKew5HTb0KhoCK6IQAvD_BwE");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[text() = 'Prime']"))).perform();

		
		
	}
	
	
	
	 
}
