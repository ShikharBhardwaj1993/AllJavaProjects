package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ESPNlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Chromedriverselenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/vitality-blast-2021-1250122/lancashire-vs-yorkshire-north-group-1250353/full-scorecard");

		
		//(//td[@class = 'text-nowrap'])[1]/following-sibling::td[10]
		
		for(int i=1 ; i<=10 ;i++){
			
			System.out.print(driver.findElement(By.xpath("(//td[@class = 'text-nowrap'])["+i+"]")).getText()+"  ");
			
			//int k = i +1 ; 
			for(int j=1;j<=10 ;j++){
				
				//int f = j + 1;
				
				//System.out.print(driver.findElement(By.xpath("(//td[@class = 'text-nowrap'])["+i+"]")).getText()+"  ");
				
				System.out.print(driver.findElement(By.xpath("(//td[@class = 'text-nowrap'])["+i+"]/following-sibling::td["+j+"]")).getText()+"   ") ;
				
				
				
				
			}
		
			System.out.println();
		}
	}

}
