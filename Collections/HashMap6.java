package collections;

import java.util.HashMap;

public class HashMap6 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "bheem");
		hm.put(106, "jaggu");
		hm.put(105, "raju");
		
		System.out.println(hm);
		
		HashMap hm1=new HashMap(hm);
		hm1.put(102, "chutaki");
		hm1.put(108, "indu");
		hm1.put(103, "kalia");
		System.out.println(hm1);
		
		HashMap hm2=new HashMap();
		hm2.putAll(hm);
		hm2.put(102, "dhollu");
		hm2.put(108, "bhollu");
		hm2.put(103, "laddu");
		System.out.println(hm2);
	}
}
