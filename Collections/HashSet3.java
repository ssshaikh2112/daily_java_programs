package collections;

import java.util.HashSet;

public class HashSet3 {
	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);		
		hs1.add(40);
		System.out.println(hs1);		// insertion order is not maintain
		
		HashSet hs2=new HashSet(hs1);	// add one HashSet to another using Constructor based approach
		hs2.add(100);
		hs2.add(200);
		hs2.add(300);		
		hs2.add(400);
		System.out.println(hs2);
		
		HashSet hs3=new HashSet();
		hs3.addAll(hs1);				// Using addAll();
		hs3.add(1000);
		hs3.add(2000);
		hs3.add(3000);		
		hs3.add(4000);
		System.out.println(hs3);
	}

}
