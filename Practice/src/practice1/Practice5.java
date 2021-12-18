package practice1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> dos = new HashMap<>() ;
		
		dos.put(3, "Abjit") ;
		dos.put(6, "Amit") ;
		dos.put(4, "Shivam") ;
		dos.put(9, "Shshank") ;
		dos.put(14, "karthik") ;
		dos.put(12, "Anil") ;
		
		System.out.println(dos);
		
		System.out.println(dos.keySet());
		System.out.println(dos.values());
		
		Set<Entry<Integer,String>>  ufo = dos.entrySet();
		
		//System.out.print(ufo.getvalue());
		
		//for(Entry<Integer,String> d : ufo){
			
		//	System.out.println(d.getKey());
			
		//}
		
		//System.out.print(dos.get(0));
		
		System.out.print(ufo.hashCode());
		
	}

}
