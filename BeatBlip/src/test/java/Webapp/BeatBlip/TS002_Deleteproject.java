package Webapp.BeatBlip;

import org.testng.annotations.Test;

import Webapp.BeatBlip.Base.baseclass;
import Webapp.BeatBlip.Pages.Homepage;
import Webapp.BeatBlip.Pages.login;

public class TS002_Deleteproject extends baseclass {

	@Test
	public void deleteprojectscript(){
	
		login logn2 = new login(driver);
		logn2.loginBB();
		Homepage hom2 = new Homepage(driver);
		hom2.deleteproject();
		log.info("Project Deleted");
	}
	
	
	
}
