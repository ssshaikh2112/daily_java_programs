package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList25 {

	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(50);
		al.add(400);
		al.add(25);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		// At any point of time we can sort based on one object at a time
		// To overcome thise problem we go for Comparator.
	}

}
