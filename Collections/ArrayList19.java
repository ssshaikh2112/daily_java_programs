package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList19 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sahil");
		al.add("shaikh");
		al.add("dev");
		System.out.println(al);
		
		// extract data from ArrayList from start to end
		ListIterator<String> li=al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("----------");
		// extract data from ArrayList from end to start	-->reverse
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	} 

}
/*
 * To use list iterator in reverse direction we need to get cursor at bottom of ArrayList
 * And then only it is possible to move in reverse direction
 * 
 * without sending cursor at bottom at the first element there is no any previous element , 
 * so it can not perform reverse or previous operation
 * */
 