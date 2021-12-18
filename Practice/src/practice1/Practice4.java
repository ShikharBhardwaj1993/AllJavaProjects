package practice1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Set<String> hok = new TreeSet<>();
		
		hok.add("Ashis");
		hok.add("Amit");
		hok.add("Kunal");
		hok.add("Harish");
		hok.add("Ashis");
		
		System.out.println(hok);
		
		Iterator<String> item = hok.iterator();
		
		while(item.hasNext()){
		
		System.out.println (item.next());
		}*/
		
		String name = "aish";
		
		char[] don = name.toCharArray();
		
		Set<Character> fou = new HashSet<>();
		int y=0;
		for(char r : don){
			
			if((fou.add(r)==false)){
				
				y=y+1;
				System.out.print("Contains duplicate");
				break;
			}
			
		
		}
		if(y==0){
		System.out.print("Its no duplicate");
		}
	}

}
