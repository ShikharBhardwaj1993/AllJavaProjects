package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumproject2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.findElement(By.id("nav_automobile")).click();
//		driver.findElement(By.id("email")).sendKeys("shikharbhardwaj1993@gmail.com");
//		driver.findElement(By.id("pass")).click();
//		driver.findElement(By.id("pass")).sendKeys("@nishub2993");
//		//driver.findElement(arg0)Xpath=//*[@id=’email_01’]);
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
//		
		WebElement sab  = driver.findElement(By.id("make"));
		
		Select select = new Select(sab);
		
		select.selectByValue("Audi");
		
		//driver.findElement(By.xpath("//div[@id='engineperformance']")).click();
		driver.findElement(By.id("engineperformance")).click();
		driver.findElement(By.id("engineperformance")).sendKeys("Good");
		
		driver.findElement(By.xpath("//button[@name='Open Date of Manufacture Calender']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='1']")).click();
		
		
		//WebElement saab  = driver.findElement(By.name("Open Date of Manufacture Calender"));
		
		//saab.click();
		//Thread.sleep(5000);
		
		//driver.close();	
		
		//driver.findElement(By.xpath("//*[@id="ui-datepicker-div"]/table/tbody/tr[4]/td[4]/a")).click();
		
		
		WebElement sab1  = driver.findElement(By.id("numberofseats"));
		
		Select select1 = new Select(sab1);
		
		select1.selectByValue("1");
		
		WebElement sab2  = driver.findElement(By.name("Fuel Type"));
		
		Select select2 = new Select(sab2);
		
		select2.selectByValue("Diesel");
		
		driver.findElement(By.name("List Price")).click();
		
		driver.findElement(By.name("List Price")).sendKeys("500");
		
		driver.findElement(By.xpath("//input[@name='License Plate Number']")).click();
		
		driver.findElement(By.xpath("//input[@name='License Plate Number']")).sendKeys("12345");
	
	
		driver.findElement(By.xpath("//input[@name='Annual Mileage']")).click();
		
		driver.findElement(By.xpath("//input[@name='Annual Mileage']")).sendKeys("10000");
	
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='nextenterinsurantdata' and text()='Next']")).click();
	
		WebElement button = driver.findElement(By.id("nextenterinsurantdata"));
		
		button.click();
		
		
	//Page2
		
		driver.findElement(By.xpath("//input[@name='First Name']")).click();
		
		driver.findElement(By.xpath("//input[@name='First Name']")).sendKeys("Shikhar");
	
		driver.findElement(By.xpath("//input[@name='Last Name']")).click();
		
		driver.findElement(By.xpath("//input[@name='Last Name']")).sendKeys("Bhardwaj");
	
		driver.findElement(By.xpath("//button[@name='Open Date of Birth Calender']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='6']")).click();
		
		WebElement button2 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span"));
		
		button2.click();
	

		driver.findElement(By.xpath("//input[@name='Street Address']")).click();
		
		driver.findElement(By.xpath("//input[@name='Street Address']")).sendKeys("XYZ");
	

		WebElement sab3  = driver.findElement(By.name("Country"));
		
		Select select3 = new Select(sab3);
		
		select3.selectByIndex(1);
		
		
		driver.findElement(By.xpath("//input[@name='Zip Code']")).click();
		
		driver.findElement(By.xpath("//input[@name='Zip Code']")).sendKeys("110006");
		
		driver.findElement(By.xpath("//input[@name='City']")).click();
		
		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("Delhi");
		
		


		WebElement sab4  = driver.findElement(By.name("Occupation"));
		
		Select select4 = new Select(sab4);
		
		select4.selectByIndex(2);
		
		
		WebElement butto = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span"));

		butto.click();
		
	
		driver.findElement(By.xpath("//input[@name='Website']")).click();
		driver.findElement(By.xpath("//input[@name='Website']")).sendKeys("abc@yahoo.com");
	
	
		WebElement button8 = driver.findElement(By.id("nextenterproductdata"));
		
		button8.click();
	
	//Page3
	
		driver.findElement(By.xpath("//input[@name='Start Date']")).click();
		driver.findElement(By.xpath("//input[@name='Start Date']")).sendKeys("07/04/2021");
		
	
		WebElement  sel  = driver.findElement(By.name("Insurance Sum"));
		
		Select select5 = new Select(sel);
		
		select5.selectByIndex(3);
		
		Thread.sleep(2000);
		WebElement  sell  = driver.findElement(By.name("Merit Rating"));
		
		Select selec = new Select(sell);
		
		selec.selectByIndex(4);
		
		Thread.sleep(2000);
		WebElement  selll  = driver.findElement(By.name("Damage Insurance"));
		
		Select select7 = new Select(selll);
		
		select7.selectByIndex(1);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span")).click();
		
		WebElement  sellll  = driver.findElement(By.name("Courtesy Car"));
		
		Select select8 = new Select(sellll);
		
		select8.selectByIndex(2);
		
		WebElement  nex  = driver.findElement(By.name("Next (Select Price Option)"));
		
		nex.click();
		
		
	}

}
