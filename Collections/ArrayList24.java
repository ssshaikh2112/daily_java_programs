package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList24 {

	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		al.add("motu");
		al.add("patlu");
		al.add("jhataka");
		al.add("ghasita");
		System.out.println(al);
		
		Collections.sort(al);		// sort the string in a - z manner
		
		// sort() internally responsible to call the compareTo() method from String class.
		// String class implements as interface called Comparable.
		// Comparable interface contains the compareTo()
		// Hence String classes and all wrapper classes implements comparable interface
		
		
		System.out.println(al);
	}

}
