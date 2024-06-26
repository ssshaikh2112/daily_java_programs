package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap5 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "bheem");
		hm.put(106, "jaggu");
		hm.put(105, "raju");
		
		System.out.println(hm);
		
		Set ss=hm.entrySet();		// Map is Now in Set	
		
		Iterator ii=ss.iterator();	// Cursor Iterator is applicable now
		while(ii.hasNext())
		{
			Map.Entry me=(Map.Entry)ii.next();
			System.out.println(me.getKey()+" - "+me.getValue());
		}
	}
}
