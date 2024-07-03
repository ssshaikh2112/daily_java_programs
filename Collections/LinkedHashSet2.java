package collections;

import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {

		LinkedHashSet lhs1=new LinkedHashSet();
		lhs1.add(10);
		lhs1.add(20);
		lhs1.add(30);		
		lhs1.add(40);
		System.out.println(lhs1);		// insertion order is not maintain
		
		LinkedHashSet lhs2=new LinkedHashSet(lhs1);	// add one HashSet to another using Constructor based approach
		lhs2.add(100);
		lhs2.add(200);
		lhs2.add(300);		
		lhs2.add(400);
		System.out.println(lhs2);
		
		LinkedHashSet lhs3=new LinkedHashSet();
		lhs3.addAll(lhs1);				// Using addAll();
		lhs3.add(1000);
		lhs3.add(2000);
		lhs3.add(3000);		
		lhs3.add(4000);
		System.out.println(lhs3);
	}

}
