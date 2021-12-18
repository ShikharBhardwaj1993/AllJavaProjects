package practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Count a string using hashmap()
		
		Scanner wer = new Scanner(System.in);
		
		String abc = wer.next();
		
		//System.out.print(abc);
		
		char[] def = abc.toCharArray();
		
		//System.out.print(Arrays.toString(def));
		
		Map<Integer,Character> name = new HashMap<>() ;
		
		int k = 0 ;
		for(char x : def){
			k = k +1;
			name.put(k, x);
		}
		
		System.out.print(name.size());
		
		
	}

}
