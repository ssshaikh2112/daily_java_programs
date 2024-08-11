package collections;

import java.util.LinkedList;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {


		Vector v=new Vector();
		v.add(100);
		v.add(244);
		v.add("motu");
		System.out.println(v);
		
		v.add(100);			// dupliacte objects are allowed
		v.add("patlu");
		System.out.println(v);
		
		v.add(null);			// null insertion is possible
		v.add(null);
		System.out.println(v);
		
								// maintain the insertion order
	}

}
