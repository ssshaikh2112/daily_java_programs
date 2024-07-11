package collections;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(102, "oggy");
		tm.put(103, "jack");
		tm.put(101, "motu");
		tm.put(104, "patlu");
		System.out.println(tm);			// print in sorted order
	}
}
