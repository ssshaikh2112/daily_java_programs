package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap6 {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(103, "oggy");
		tm.put(102, "jack");
		tm.put(105, "motu");
		tm.put(101, "ghasita");
		tm.put(104, "chingum");
		
		System.out.println(tm);
		
		SortedMap sm=tm.headMap(103);
		TreeMap tm1=new TreeMap(sm);
		System.out.println(tm1);			// print all before 103
		
		SortedMap sm2=tm.tailMap(103);
		TreeMap tm2=new TreeMap(sm2);
		System.out.println(tm2);		// print all after and with 103
	}

}
