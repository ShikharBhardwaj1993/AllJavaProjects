package practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String d = "Anish";
		
		StringBuffer s=new StringBuffer(d);
		
		System.out.print(s.reverse());
		*/
		
		
		List<String> abc = new ArrayList<>() ;
		
		abc.add("Harmit");
		abc.add("Parmit");
		abc.add("Amit");
		abc.add("Navneet");
		abc.add("Nishu");
		abc.add("Tango");
		
		
		//System.out.print(abc.indexOf("Navneet"));
		
		/*for(int i=0;i<abc.size();i++){
			
			System.out.println(abc.get(i));
			  
		}*/
		
		Iterator<String> iter = abc.iterator();
		
		while(iter.hasNext()){
		
		//System.out.println(iter.next());
		//System.out.print(iter.next());
		
		String y = iter.next();
		
		System.out.println(y.concat(" Singh"));
		
		}
	}

	

}
