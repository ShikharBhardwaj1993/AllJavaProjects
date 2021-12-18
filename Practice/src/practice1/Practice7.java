package practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class Practice7 {

	public static void main(String[] args) {


	
	Scanner tu = new Scanner(System.in) ;
	
	int num = tu.nextInt() ;
	
	int a=0;
	int b=1;
	int[] wer = new int[num];
	wer[0] = 0;
	wer[1] = 1;
	for(int k=2 ; k<num ; k++){
		
		wer[k] = wer[k-1] + wer[k-2];
		
		//a = a + b	;
		//wer[k] = a ;
		
		
		
	}
		
		
		System.out.print(Arrays.toString(wer));
		
	
	
	}
	
	
	}