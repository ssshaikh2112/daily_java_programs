package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList28 {

	public static void main(String[] args) 
	{

		ArrayList<Zomato> al=new ArrayList<Zomato>();
		
		al.add(new Zomato(101,"pizza"));
		al.add(new Zomato(401,"burger"));
		al.add(new Zomato(301,"paneer"));
		al.add(new Zomato(201,"nan"));
		
		System.out.println(al);
		for(Zomato snc : al)
		{
			System.out.println(snc.itemId+" "+snc.itemName);
		}
		System.out.println("----------");
		Collections.sort(al , new ZomatoNameComparator());	// Sort alphabetically
		
		for(Zomato z1 : al)
		{
			System.out.println(z1.itemId+" "+z1.itemName);
		}
	}

}
