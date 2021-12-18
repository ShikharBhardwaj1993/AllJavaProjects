package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Prac1 {

	
	@Test()
	public void testcase3(){
	
		
		int a=2;
		int b=1;
		
		
		if(a<b){
		
		Assert.assertFalse(a<b);
		
	}
	
	
	
	
	
	}	
	
	
	
}
