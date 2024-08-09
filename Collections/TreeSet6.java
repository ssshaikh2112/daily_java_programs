package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet6 {

	public static void main(String[] args) {
		TreeSet ts1=new TreeSet();
		ts1.add("oggy");
		ts1.add("jack");
		ts1.add("motu");
		ts1.add("patlu");
		System.out.println(ts1);			// print in sorted order
		SortedSet s1=ts1.headSet("motu");	// print all  before the Given Object of headSet();
		System.out.println(s1);				
		
		SortedSet s2=ts1.tailSet("motu");	// print all after and with the Given Object of headSet();
		System.out.println(s2);
	}
}
