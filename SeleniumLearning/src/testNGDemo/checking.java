package testNGDemo;



	
	
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	//import java.io.File;
	//import java.io.FileNotFoundException;
		

	public class checking {
		
		
		public Xls_Reader excel = new Xls_Reader("C:\\Users\\HP\\Desktop\\test.xlsx");
		

		@Test
		public void testFacebookLogin(){
			
			System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			//driver.findElement(By.id("email")).click();
			driver.findElement(By.id("email")).sendKeys("sadadsd");
			//driver.findElement(By.id("pass")).click();
			driver.findElement(By.id("pass")).sendKeys("asasasa");
			driver.findElement(By.name("login")).click();
		
		}
		
	
	
}
