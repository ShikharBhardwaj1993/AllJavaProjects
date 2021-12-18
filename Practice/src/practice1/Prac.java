package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args){
		
		
		//Scanner eor = new Scanner(System.in);
		
		//int input = eor.nextInt();
		
		//String stu = eor.next();
		
	//	System.out.print("sdsdfgghgff"+stu +"zxxxxzxzxx");
		
/*		switch(input){
		
		case 1: System.out.print("mon");
		break;
		case 2: System.out.print("tue");
		break;
		
		}*/
		
		
		
		/*char  df = stu.charAt(3);
		
		System.out.print(df);*/
		
		/*String g = "Aotumation";
		String k = "";
		
		for(int i=g.length()-1;i>=0;i--){
			
			k = k + g.charAt(i);
		}
		//char h = g.charAt(0);
		
		System.out.println(k);
		*/
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter array size");
		int w = inp.nextInt();
		//System.out.println("Enter the size"+ inp.nextInt());
		
		int[] f = new int[w];
		
		for(int i=0;i<w;i++){
			
			
			f[i] = inp.nextInt();
			
		}
		
		System.out.println("Array values are"+ Arrays.toString(f));
		
		
		 for(int j=w-1;j>=(w/2);j--){
			 
			 int a = f[j];
			 
			 f[j] = f[w-j-1];
			 f[w-j-1] = a;
			 
		 }
		
		System.out.print(Arrays.toString(f));
		
		
	}
	
	
	
	
	
	
}
