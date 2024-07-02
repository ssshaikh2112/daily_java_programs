package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);		
		lhs1.add(40);
		System.out.println(lhs1);		// insertion order is  maintain
		
		lhs1.add(40);
		lhs1.add(null);					// null insertion is allowed
		System.out.println(lhs1);		// insertion order is  maintain
	}
}
