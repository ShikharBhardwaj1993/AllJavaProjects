package testNGDemo;

import org.testng.annotations.Test;

public class Excellfetchingpractice {

	@Test
	public void fetchsheet(){
		
		
		Xls_Reader exc = new Xls_Reader("C:\\Users\\HP\\Desktop\\dataset_selfmade.xlsx") ;
		
		System.out.print("The number is" + exc.getRowCount("sheet1")) ;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
