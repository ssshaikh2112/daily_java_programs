package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList26 {

	public static void main(String[] args) 
	{
		ArrayList<SwiggytemNameComparable> al=new ArrayList<SwiggytemNameComparable>();
		
		al.add(new SwiggytemNameComparable(101,"pizza"));
		al.add(new SwiggytemNameComparable(401,"burger"));
		al.add(new SwiggytemNameComparable(301,"paneer"));
		al.add(new SwiggytemNameComparable(201,"nan"));
		
		System.out.println(al);
		for(SwiggytemNameComparable snc : al)
		{
			System.out.println(snc.itemId+" "+snc.itemName);
		}
		System.out.println("----------");
		Collections.sort(al);	// Sort alphabetically
		
		for(SwiggytemNameComparable snc : al)
		{
			System.out.println(snc.itemId+" "+snc.itemName);
		}
	}

}
