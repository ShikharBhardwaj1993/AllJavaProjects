package Webapp.BeatBlip;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Webapp.BeatBlip.Base.baseclass;
import Webapp.BeatBlip.Pages.Homepage;
import Webapp.BeatBlip.Pages.login;

public class TS001_Createnewproject extends baseclass{

	@Test
	public void login2(){
	
		login logn = new login(driver);
		logn.loginBB();
		log.info("Login funtionality working working");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS) ;
		Homepage hom = new Homepage(driver);
		hom.projectsetup();
		log.info("Open Project option");
		hom.deleteproject();
		driver.close();
	}
		
}
