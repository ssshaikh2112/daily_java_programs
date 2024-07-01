package collections;

import java.util.LinkedHashMap;

public class LinkedHashMap2 {

	public static void main(String[] args) 
	{
		LinkedHashMap lhm1=new LinkedHashMap();
		lhm1.put(101, "oggy");
		lhm1.put(102, "jack");
		lhm1.put(103, "motu");
		lhm1.put(104, "patlu");
		System.out.println(lhm1); 		// insertion order is maintained
		
		//Constructor Base Approach
		LinkedHashMap lhm2=new LinkedHashMap(lhm1);		// add one LinkedHashMap to another LinkedHashMap
		lhm2.put(105, "chingum");
		lhm2.put(106, "jhatka");
		lhm2.put(107, "ghasita");
		System.out.println(lhm2);
		
		LinkedHashMap lhm3=new LinkedHashMap();
		//addAll() method
		lhm3.putAll(lhm2);						// add one LinkedHashMap to another LinkedHashMap
		lhm3.put(108, "bheem");
		lhm3.put(109, "chutki");
		lhm3.put(110, "jaggu");
		System.out.println(lhm3);
		

	}

}
