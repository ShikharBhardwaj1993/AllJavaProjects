package Webapp.BeatBlip.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage {
	
	Select select ;
		
	@FindBy(xpath="//*[@id='projectCreation']")
	WebElement clickfile ;

	@FindBy(xpath="//*[@id='openProjectMenu']")
	WebElement clickfile2 ;

	@FindBy(xpath="//*[@id='projectCreationModal']/div[1]/div/div[2]/div/input")
	WebElement clickfile3 ;
	
	@FindBy(xpath="//*[@id='projectCreationModal']/div[1]/div/div[3]/div/div/div[1]/span/i")
	WebElement clickfile4 ;
	
	@FindBy(xpath="//*[text()='RESTful Web Services ']")
	WebElement clickfile5 ;
	
	@FindBy(id="saveProject")
	WebElement clickfile6 ;

	@FindBy(xpath="(//span[text()='AutomateProject'])")
	WebElement clickfile7 ;
	
	@FindBy(xpath="//a[text()='Remove']")
	WebElement clickfile8 ;
	
	@FindBy(xpath="//button[text()='Delete']")
	WebElement clickfile9 ;
	
	public WebDriver Driver ;
	
	public Homepage(WebDriver driver2) {
	
		this.Driver=driver2;
		PageFactory.initElements(Driver,this) ;
	}

	public void projectsetup(){
		
		
		clickfile.click() ;
		clickfile2.click();
		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickfile3.sendKeys("AutomateProject");
		clickfile4.click();
		clickfile5.click();
		clickfile6.click();
			
	}
		
	public void deleteproject(){
		
		Actions action = new Actions(Driver);
		action.contextClick(clickfile7).perform();
		clickfile8.click();
		clickfile9.click();
	}
	
}
