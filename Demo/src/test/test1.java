package test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner inp = new Scanner(System.in) ;
		
		int sum = 0;
		int avg = 0 ;
		for(int i =1 ; i<=3 ; i++){
		
		System.out.print("Enter the no.");
	
		int num = inp.nextInt();
		
		sum = sum + num ; 
		avg = sum/i ; 
		System.out.println(avg) ;
		
	}

		
	}	
}
