package collections;

import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {

		TreeMap tm=new TreeMap();
		tm.put(102, "oggy");
		tm.put(103, "jack");
		tm.put(101, "motu");
		tm.put(null, "patlu");			// null key is not applicable
		System.out.println(tm);			// Error	
	}

}
