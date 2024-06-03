package collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		// Arraylist is a homogeneous as well as hetrogeneous data structure
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("sahil");
		System.out.println(al);
		al.add(201.5f);
		al.add('s');
		System.out.println(al);
		al.add(1001);
		al.add(null);
		System.out.println(al);
		
	}

}
