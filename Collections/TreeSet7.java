package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet7 {

	public static void main(String[] args) {
		TreeSet ts1= new TreeSet();
		ts1.add(25);
		ts1.add(15);
		ts1.add(10);
		System.out.println(ts1);
		SortedSet s1=ts1.headSet(15);		// print all  before the Given Object of headSet();
		System.out.println(s1);

		
		
		TreeSet ts2= new TreeSet(ts1);
		ts2.add(35);
		ts2.add(5);
		System.out.println(ts2);
		
		SortedSet s2=ts2.tailSet(15);		// print all after and with the Given Object of headSet();
		System.out.println(s2);

	}
}
