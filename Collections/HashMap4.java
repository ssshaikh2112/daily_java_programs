package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap4 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "bheem");
		hm.put(106, "jaggu");
		hm.put(105, "raju");
		
		Set s1=hm.keySet();			// return the all keys in the set format and set is also contain unique data
		System.out.println(s1);
		
		System.out.println(hm);
		
		Collection cc=hm.values();	// return the all value in the Collection  and Collection is also contain unique data / Duplicate data
		System.out.println(cc);
	}
}
