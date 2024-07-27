package collections;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(101);
		ts.add(100);
		ts.add(55);
		ts.add(150);
		System.out.println(ts); 		// print sorted order
		
		ts.add(55);
		System.out.println(ts); 		// duplicates are not allowed it return same object
		
		ts.add(null);
		System.out.println(ts); 		// null is not allowed to store / add	--> Error

	}
	
}
