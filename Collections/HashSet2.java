package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);		
		hs.add(40);
		System.out.println(hs);		// insertion order is not maintain
		
		// Only Cursor Iterator is applicable for HashSet
		Iterator i=hs.iterator();	// Only Cursor Iterator is applicable for HashSet
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
