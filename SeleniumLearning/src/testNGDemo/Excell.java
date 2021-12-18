package testNGDemo;

import java.io.File;
import java.io.FileNotFoundException;

//import seleniumdemo.Xls_Reader;


public class Excell {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Xls_Reader excel = new Xls_Reader("C:\\Users\\HP\\Desktop\\test.xlsx");
		
		String value = excel.getCellData("ABCD","Boss", 3 );
		
	
		System.out.print(value);
		
		
	}

	
	
	
}
