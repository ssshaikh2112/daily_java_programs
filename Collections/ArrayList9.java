package collections;

import java.util.ArrayList;

public class ArrayList9 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println("Collection : ArrayList berfore add another constructor");
		System.out.println(al);
		
		//ways to add one collection in other collection
		// 1st Approach	--> Constructor Base Approach
		
		ArrayList al2=new ArrayList(al);
		al2.add(1000);
		al2.add(2000);
		al2.add(3000);
		System.out.println("Collection : ArrayList after add another constructor by Constructor base approach");
		System.out.println(al2);
		
		// 2nd Approach --> al3.addAll(object) method
		ArrayList al3=new ArrayList();
		al3.addAll(al2);
		al3.add(10000);
		al3.add(20000);
		al3.add(30000);
		System.out.println("Collection : ArrayList after add another constructor by addAll() method");
		System.out.println(al3);
		
	}

}
