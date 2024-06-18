package collections;

import java.util.ArrayList;

public class ArrayList23 {

	public static void main(String[] args) 
	{
		// Convert Collection to array
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("motu");
		al.add("patlu");
		al.add("jhataka");
		al.add("ghasita");
		System.out.println(al);
		
		String[] ss=al.toArray(new String[al.size()]);	// method
										// specify the size of array al.size()
		
		for(String s:ss)
		{
			System.out.println(s);
		}
	}

}
