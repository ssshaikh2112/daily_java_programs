package collections;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		// only homogeneous type data store
		TreeSet ts=new TreeSet();
		ts.add(101);
		ts.add(100);
		ts.add(55);
		ts.add(150);
		System.out.println(ts); 		// print sorted order
	}
}
