package collections;

import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		
		// Treeset class implements by Comparable
		TreeSet ts=new TreeSet();
		ts.add(101);
		ts.add(100);
		//ts.add("oggy");
		ts.add(150);					// compareTo() is used to sort the object
		System.out.println(ts); 		// print sorted order
	}
}
