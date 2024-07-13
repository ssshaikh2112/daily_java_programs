package collections;

import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		TreeMap tm1=new TreeMap();
		tm1.put(102, "oggy");
		tm1.put(103, "jack");
		tm1.put(101, "motu");
		System.out.println(tm1);
		
		TreeMap tm2=new TreeMap(tm1);		// add one TreeMap to another TreeMap
		tm2.put(106, "chingum");
		tm2.put(105, "jhatka");
		tm2.put(104, "ghasita");
		System.out.println(tm2);
	}

}
