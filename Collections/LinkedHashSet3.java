package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet3 {

	public static void main(String[] args) {
		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);		
		lhs1.add(40);
		System.out.println(lhs1);		// insertion order is not maintain
		
		Iterator ii=lhs1.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}
	}
}
