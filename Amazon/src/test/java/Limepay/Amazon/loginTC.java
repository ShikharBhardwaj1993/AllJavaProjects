package Limepay.Amazon;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Limepay.Amazon.Base.baseclass;
import Limepay.Amazon.pages.homepage;
import Limepay.Amazon.pages.primepage;

public class loginTC extends baseclass {

	@Test
	public void joinmembers(){
			
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
		
		homepage pri = new homepage(driver);
		pri.joinamazonprime();
		
		primepage sig = new primepage(driver);
		sig.signn(); 
	
			}
	@Test
	public void joinmembers2() throws IOException{
		
		primepage sig2 = new primepage(driver);
		sig2.signn2();
		
	}

	

}
