package collections;

import java.util.Iterator;
import java.util.Vector;

public class Vector4 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(244);
		v.add("motu");		
		v.add(100);		
		v.add("patlu");
		System.out.println(v);
		
		// Extract data
		Iterator ii=v.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
		
		
	}

}
