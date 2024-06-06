package collections;

import java.util.ArrayList;

public class ArrayList8 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(101);
		al.add("Sahil");
		al.add(250.5f);
		al.add(true);
		System.out.println(al);					// Print the ArrayList
		
		System.out.println(al.contains(al));	// To check object is present or not in the ArrayList
		
		System.out.println(al.size());			// To check the size of the ArrayList
	}

}
