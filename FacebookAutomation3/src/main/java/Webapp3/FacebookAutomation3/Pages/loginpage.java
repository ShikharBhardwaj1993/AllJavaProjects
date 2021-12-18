package Webapp3.FacebookAutomation3.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginpage {

	@FindBy(id="email")
	public WebElement Emailid;
	@FindBy(id="pass")
	public WebElement Password;
	@FindBy(name="login")
	public WebElement LoginButton;
	@FindBy(xpath="//div[text()='आप अभी लॉग इन नहीं कर सकते']")
	public WebElement wrong;
	
			public WebDriver driver ;
	
		public loginpage(WebDriver driver){
			
			this.driver = driver ;
			PageFactory.initElements(driver, this);			
		}
	
	public void InvalidLoginFacebook(){
		
		Emailid.sendKeys("abc@gmail.com");
		Password.sendKeys("qwerr");
		LoginButton.click();
		
	}
	
	public void verifyinvalidlogin(){
		
		
		boolean iswrong = wrong.isDisplayed();
		Assert.assertTrue(iswrong);
	}
	
}
