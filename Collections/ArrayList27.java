package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList27 {

	public static void main(String[] args) {

		ArrayList<SwiggyItemIdComparable> al=new ArrayList<SwiggyItemIdComparable>();
		
		al.add(new SwiggyItemIdComparable(101,"pizza"));
		al.add(new SwiggyItemIdComparable(401,"burger"));
		al.add(new SwiggyItemIdComparable(301,"paneer"));
		al.add(new SwiggyItemIdComparable(201,"nan"));
		
		System.out.println(al);
		for(SwiggyItemIdComparable snc : al)
		{
			System.out.println(snc.itemId+" "+snc.itemName);
		}
		System.out.println("----------");
		Collections.sort(al);	// Sort alphabetically
		
		for(SwiggyItemIdComparable snc : al)
		{
			System.out.println(snc.itemId+" "+snc.itemName);
		}
		// TODO Auto-generated method stub

	}

}
