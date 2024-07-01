package collections;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {

	public static void main(String[] args) 
	{
		LinkedHashMap lhm=new LinkedHashMap();
		lhm.put(101, "oggy");
		lhm.put(102, "jack");
		lhm.put(103, "motu");
		lhm.put(104, "patlu");
		System.out.println(lhm); 		// insertion order is maintained
		
	}

}
