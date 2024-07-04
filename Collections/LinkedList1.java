package collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(244);
		ll.add("motu");
		System.out.println(ll);
		
		ll.add(100);			// dupliacte objects are allowed
		ll.add("patlu");
		System.out.println(ll);
		
		ll.add(null);			// null insertion is possible
		ll.add(null);
		System.out.println(ll);
		
								// maintain the insertion order
	}

}
