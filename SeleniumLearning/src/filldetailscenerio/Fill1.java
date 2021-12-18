package filldetailscenerio;

import org.testng.annotations.Test;

public class Fill1 {

	@Test(priority=1,description="Test case 1",groups = "Sanity",enabled=true) //Annotation
	public void fill11(){
		
		System.out.print("Hi fill11");
		
	}

	@Test(priority=2,description="Test case 1",groups = "Regression",enabled=true) //Annotation
	public void fill12(){
		
		System.out.print("Hi fill12");
		
	}

	@Test(priority=4,description="Test case 1",groups = "Regression",enabled=true) //Annotation
	public void fill13(){
		
		System.out.print("Hi fill14");
		
	}

	@Test(priority=3,description="Test case 1",groups = "Regression",enabled=true) //Annotation
	public void fill121(){
		
		System.out.print("Hi fill12");
		
	}




}
