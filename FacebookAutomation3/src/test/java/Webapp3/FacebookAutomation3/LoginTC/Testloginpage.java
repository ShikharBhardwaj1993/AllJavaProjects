package Webapp3.FacebookAutomation3.LoginTC;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Webapp3.FacebookAutomation3.Baseclass.webBase3;
import Webapp3.FacebookAutomation3.Pages.loginpage;

public class Testloginpage extends webBase3  {

	@Test
	public void testfacebookinvalidlogin(){
		
		
		loginpage invalidlogin = new loginpage(driver);
		invalidlogin.InvalidLoginFacebook();
		invalidlogin.verifyinvalidlogin();
		
		
	}
	
	

	
}
