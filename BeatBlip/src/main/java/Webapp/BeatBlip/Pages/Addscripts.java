package Webapp.BeatBlip.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addscripts {

	
	////*[@ng-click='toggleCheckInner(node, $event)' and @class='fa fa-check-square-o']
	@FindBy(xpath="(//a[@ng-click='expandNodeWithoutPropgation(this, $event)'])[15]/i[1]")
	WebElement click1 ;
	
	@FindBy(xpath="//*[@id='test-tree-root']/ol/li[15]/ol/li/div/span[1]/a")
	WebElement click2 ;
	
	@FindBy(xpath="//span[@class='tree-node-content ng-binding' and @title='Test Suite']")
	WebElement click3 ;
	
	@FindBy(id="testCase61a48c1668b4d67eb853c2bc")
	WebElement click4 ;
	
	@FindBy(xpath="//td[@title='OPEN']")
	WebElement clearDefaulturl ;
	
	@FindBy(xpath="//*[@id='page-wrapper']/div[2]/data-ui-view/div/div/div[2]/div/div/div/div[2]/div/table/tbody/tr/td[2]/div/a/i")
	WebElement clicktoaddturl ;
	
	@FindBy(xpath="//textarea[@placeholder='Please provide parameter arguments']")
	WebElement cleartext ;
	
	@FindBy(xpath="//i[@ng-class='saveImage']")
	WebElement saveurl ;
	
	//Add test step
	
	@FindBy(xpath="//i[@ng-class='addRowImage']")
	WebElement addteststep ;
	
	//Select action
	
	@FindBy(xpath="//i[@title='clear data']")
	WebElement clearactiondata ;
	
	@FindBy(xpath="//i[@class='caret pull-right']")
	WebElement selectactiondata ;
	
	@FindBy(xpath="//*[text()='CLICK']")
	WebElement clickoption ;
	
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[2]")
	WebElement screenname ;
	
	@FindBy(xpath="//span[@class='ui-select-choices-row-inner']")
	WebElement screenoption ;
	
	@FindBy(xpath="(//span[@class='btn btn-default form-control ui-select-toggle'])[3]")
	WebElement elementkey ;
	
	@FindBy(xpath="(//span[@class='ng-binding ng-scope'])[4]")
	WebElement clickcontact ;
	
	@FindBy(xpath="(//i[@ng-class='deleteImage'])[2]")
	WebElement deleteelement ;
	
	@FindBy(xpath="(//button[@type='button'])[13]")
	WebElement deletebutton ;
	
	private WebDriver Driver;

	public Addscripts(WebDriver driver){
		
		this.Driver = driver ;
		PageFactory.initElements(Driver,this) ;
		
	}
	

	

	public void Action(){
		
		clicktoaddturl.click();
		clearactiondata.click();
		Driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		selectactiondata.click();
		Driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		clickoption.click();
		screenname.click();
		screenoption.click();
		elementkey.click();
		clickcontact.click();
		saveurl.click();
		
		//Select sel = new Select(selectactiondata) ;
		//sel.selectByValue("CLICK");
		
	}

	public void opentestsuite() {
		// TODO Auto-generated method stub
		JavascriptExecutor jse = (JavascriptExecutor)Driver;
		jse.executeScript("scroll(-2, 330)");
		click1.click();
		click2.click();
		click3.click();
		click4.click();
		
	}



	public void Url() {
		// TODO Auto-generated method stub
		/*Actions act = new Actions(Driver);
		act.doubleClick(clearDefaulturl).perform();*/
		clicktoaddturl.click();
		//cleartext.clear();
		cleartext.sendKeys("https://agreeya.com/");
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		saveurl.click();
	}
	
	public void deletescript() {
		
		if(deleteelement.isDisplayed()){
			
			try {
				Thread.sleep(5000) ;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			deleteelement.click();
			deletebutton.click();
			}
		
	}
	
	
	
	
}
