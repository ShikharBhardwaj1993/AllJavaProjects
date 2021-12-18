package Limepay.Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	
	@FindBy(xpath ="//*[text() = 'Prime']")
	public WebElement joinprime ;
	
	public WebDriver Driver ;
	
	public homepage(WebDriver driver){
		
		this.Driver = driver ;
		 PageFactory.initElements(driver, this);
	
			}
		
	public void joinamazonprime(){
	
		Actions action = new Actions(Driver) ;
		
		action.moveToElement(joinprime).click().perform();
	
	}
	

}
