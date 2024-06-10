package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList16 {

	public static void main(String[] args) 
	{
		// Normal Collection
		ArrayList al=new ArrayList();
		al.add("101");
		al.add("sahil");
		al.add("prog");
		System.out.println(al);
		Iterator i=al.iterator();
		while (i.hasNext()) 
		{
			String s = (String) i.next();
			System.out.println(s);
			
		}
		
		
		
		// Generic Collection
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("100");
		a2.add("shaikh");
		a2.add("dev");
		System.out.println(a2);
		Iterator ii=a2.iterator();
		while (ii.hasNext()) {
			System.out.println((String)ii.next());
		}
		
	}

}
