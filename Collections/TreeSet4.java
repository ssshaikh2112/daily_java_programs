package collections;

import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add("oggy");
		ts1.add("jack");
		System.out.println(ts1);
		
		TreeSet ts2=new TreeSet(ts1);		// add one TreeSet to another
		ts2.add("motu");
		ts2.add("patlu");
		System.out.println(ts2);
	}
}
