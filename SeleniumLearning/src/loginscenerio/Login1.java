package loginscenerio;

import org.testng.annotations.Test;

public class Login1 {


	@Test(priority=3,description="Test case 1",groups = "Regression",enabled=true) //Annotation
	public void varifylogin(){
		
		System.out.print("Hi ops");
		
	}

	@Test(priority=1,description="Test case 1",groups = "Sanity",enabled=true) //Annotation
	public void varifylogin2(){
		
		System.out.print("Hi ops2");
		
	}

	@Test(priority=2,description="Test case 1",groups = "Regression",enabled=true) //Annotation
	public void varifylogin3(){
		
		System.out.print("Hi ops3");
		
	}






}
