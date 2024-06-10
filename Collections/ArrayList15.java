package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList15 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(al);
		
		// ListIterator is only applicable to the list classes
		// Operations -- >	read() , remove() , set , add operations
		
		ListIterator li=al.listIterator();	// cursor	bidirectional cursor
		while(li.hasNext())					// check element present or not
		{
			String ss=(String)li.next();	// extract element 
			System.out.println(ss);
		}
	}

}
