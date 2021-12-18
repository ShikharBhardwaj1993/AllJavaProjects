package Webapp.BeatBlip;

import org.testng.annotations.Test;

import Webapp.BeatBlip.Base.baseclass;
import Webapp.BeatBlip.Pages.Homepage;
import Webapp.BeatBlip.Pages.Addscripts;
import Webapp.BeatBlip.Pages.login;

public class TS005_Deleteclickscript extends baseclass {

	
	
	
	
	@Test
	public void deleteprojectscript(){
	
		login logn4 = new login(driver);
		logn4.loginBB();
		Addscripts open2 = new Addscripts(driver);
		open2.deletescript();
		//log.info("Project Deleted");
	}
	
	
	
	
	
	
	
	
	
	
}
