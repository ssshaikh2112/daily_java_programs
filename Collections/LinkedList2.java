package collections;

import java.util.LinkedList;


// Add two LinkedList by 2 ways ie. Constructor based and addAll()

public class LinkedList2 {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		ll.add(100);
		ll.add(244);
		ll.add("motu");
		System.out.println(ll);
		
		LinkedList ll2=new LinkedList(ll);	// add one LinkedList to Another LinkedList
		ll2.add(101);
		ll2.add("patlu");
		System.out.println(ll2);
		
		LinkedList ll3=new LinkedList();
		ll3.addAll(ll2);					// add one LinkedList to Another LinkedList
		ll3.add(102);
		ll3.add("chingum");
		System.out.println(ll3);
	}

}
