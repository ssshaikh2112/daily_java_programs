package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList14 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		// Iterator is a universal cursor applicable to all class
		Iterator i=al.iterator();		// cursor
		while(i.hasNext())				// check element present or not
		{
			String s=(String)i.next();	// extract element 
			System.out.println(s);
		}
	}

}
