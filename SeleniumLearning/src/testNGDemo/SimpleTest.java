package testNGDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class SimpleTest {
  	
  	WebDriver driver;
  	
  	@DataProvider(name = "test-data")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{
              	{"Lambda Test"},{"Automation"}
        	};
  	}
  	
  	@BeforeMethod
  	  public void setUp() {
        	 
        	  System.out.println("Start test");
        	  System.setProperty("webdriver.chrome.driver", "webdriver.chrome.driver");
        	  driver = new ChromeDriver();
        	  String url = "https://www.google.com";
        	  driver.get(url);
        	  driver.manage().window().maximize();
        	 
  	  }
  	//Passing the dataProvider to the test method through @Test annotation
  	@Test(dataProvider ="test-data")
  	public void search(String keyWord){
        	WebElement txtBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        	  txtBox.sendKeys(keyWord);
        	  Reporter.log("Keyword entered is : " +keyWord);
        	  txtBox.sendKeys(Keys.ENTER);
        	  Reporter.log("Search results are displayed.");
  	}
  	
  	@AfterMethod
  	public void burnDown(){
        	driver.quit();
  	}
 
}