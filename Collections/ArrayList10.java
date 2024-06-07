package collections;

import java.util.ArrayList;

public class ArrayList10 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		System.out.println("ArrayList -- 1");
		System.out.println(al1);
		
		ArrayList al2=new ArrayList(al1);
		al2.add(100);
		al2.add(200);
		System.out.println("ArrayList -- 2");
		System.out.println(al2);
		
		//return boolean value
		System.out.println("Return true if all objects of  ArrayList1 is contain in ArrayList2 : ");
		System.out.println(al2.containsAll(al1));	// Checks one collection is present in another or not and return boolean value
		
		System.out.println("remove object at a index  : ");
		al2.remove(0);								// remove object at a index
		System.out.println(al2);
		System.out.println("Return true if all objects of ArrayList1 is contain in ArrayList2 : ");		
		System.out.println(al2.containsAll(al1));	// Checks one collection is present in another or not and return boolean value	
		
		System.out.println("remove all object from ArrayList and return true if remove given collection ");
		System.out.println(al2.removeAll(al1));		// remove entire collection present in another collection
		System.out.println(al2);
		
		al2.retainAll(al1);		 //it will retake value of one collection and will delete values of another collection
		System.out.println(al2); // retail will retake value of one collection and will delete values of another collection
	}

}
