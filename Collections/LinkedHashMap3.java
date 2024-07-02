package collections;

import java.util.LinkedHashMap;

public class LinkedHashMap3 {
	public static void main(String[] args) {
		LinkedHashMap lhm1=new LinkedHashMap(10,0.75f,false	);
		lhm1.put(101, "oggy");
		lhm1.put(102, "jack");
		lhm1.put(103, "motu");
		lhm1.put(104, "patlu");
		System.out.println("Before : "+lhm1); 		
		lhm1.get(103);
		System.out.println("After : "+lhm1);
		
		LinkedHashMap lhm2=new LinkedHashMap(10,0.75f,true	);
		lhm2.put(101, "bheem");
		lhm2.put(102, "chutki");
		lhm2.put(103, "jaggu");
		lhm2.put(104, "raju");
		System.out.println("Before : "+lhm2); 		
		lhm2.get(101);							// print at the last 101 - bheem
		System.out.println("After : "+lhm2);	
	}

}
