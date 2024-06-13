package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList20 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sahil");
		al.add("shaikh");
		al.add("dev");
		System.out.println(al);
		
		// extract data from ArrayList from start to end
		ListIterator<String> li=al.listIterator();
		while(li.hasNext())
		{
			//System.out.println(li.next());
			if (li.next().equals("shaikh"))
			{
				li.remove();	//Manupulatuion is possible using cursor
								// remove is used to remove item
				
			}
		}
		System.out.println(al);
	}

}
