package Webapp.BeatBlip.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	
	@FindBy(xpath="//*[@formcontrolname='userName']")
	WebElement ID ;
		
	@FindBy(xpath="//*[@formcontrolname='password']")
	WebElement Password ;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginclick ;
	
	public WebDriver Driver ;
	
	public login(WebDriver driver){
		
		this.Driver=driver;
		PageFactory.initElements(Driver,this) ;
		
	}
	
	public void loginBB(){
		
		ID.sendKeys("shikhar.bhardwaj@agreeya.com");
		Password.sendKeys("test@123");
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		loginclick.click();
	}	
	
}
