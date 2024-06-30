package collections;

import java.util.HashSet;

public class HashSet4 {
	public static void main(String[] args) {
		HashSet hs1=new HashSet(10,0.5f);	// load Factor 
								// default capacity is 0.75
		// load factor range 0.0 --> 1.0 so we need to defined the defined load factor
		
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);		
		hs1.add(40);
		System.out.println(hs1);		// insertion order is not maintain
		
		
	}

}
