package testNGDemo;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import java.io.File;
//import java.io.FileNotFoundException;
	

public class Facebookmultiplelogin {
	
	
	public Xls_Reader excel = new Xls_Reader("C:\\Users\\HP\\Desktop\\test.xlsx");
	

	@Test(dataProvider = "getData")
	public void testFacebookLogin(String fuserid,String fpas){
		
		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\Newdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(fuserid);
		//driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys(fpas);
		driver.findElement(By.name("login")).click();
	
	}
	
	@DataProvider//(name = "dfa")
	public Object[] [] getData() {
		
		int rowNum = excel.getRowCount("ABCD");
		int colCount = excel.getColumnCount("ABCD");
		
		System.out.println(colCount);
		System.out.println(rowNum);
		
		Object[][] data = new Object[rowNum -1][colCount] ; 
		
		for(int i=2;i<=rowNum;i++){
			
			for(int j=0;j<colCount;j++){
				
				data[i-2][j] = excel.getCellData("ABCD", j, i);
				
				//return data;
			}
			
			//return data;
		}
		
		
		return data;
		
		
		
	
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
