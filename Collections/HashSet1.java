package collections;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);		
		hs.add(40);
		System.out.println(hs);		// insertion order is not maintain
		
		hs.add(30);
		hs.add(10);
		System.out.println(hs); 	// HashSet do not allow duplicate value
									// but when we add duplicate it return the same value Once
		
		hs.add(null);
		//hs.add(null);
		System.out.println(hs); 	// null is applicable to add
	}

}
