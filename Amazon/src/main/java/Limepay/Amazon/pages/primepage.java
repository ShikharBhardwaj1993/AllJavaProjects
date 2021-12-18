package Limepay.Amazon.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Limepay.Amazon.Common.common;
import Limepay.Amazon.utilities.Xls_Reader;

public class primepage {
	
	//@FindBy(id ="multiasins-img-link")
	//public WebElement signin ;
	
	Xls_Reader excel = new Xls_Reader("C:\\Java Workspace\\Amazon\\src\\main\\java\\Limepay\\Amazon\\utilities\\Sample Excel File Shikhar.xlsx") ;
	
	@FindBy(id ="a-autoid-0-announce")
	public WebElement logbut ;

	@FindBy(xpath ="//input[@type='email']")
	public WebElement id ;

	@FindBy(xpath ="//input[@id='continue']")
	public WebElement but ;
	
	public WebDriver Driver ;
	
	public primepage(WebDriver driver){
		
		this.Driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void signn(){
	
	//signin.click();
	//Driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS) ;
	logbut.click();
	
	
	
	}
	
	public void signn2() throws IOException{
	
	try{
		id.sendKeys(excel.getCellData("Sheet1", "Name", 2));	
	}
		
	catch(Exception e){
	common srce = new common(Driver);
	srce.screenshot();
	}
	
	but.click();
		
	}
	
}
