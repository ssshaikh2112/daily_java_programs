package collections;

import java.util.Enumeration;
import java.util.Vector;

public class ArrayList13 {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		System.out.println(v);
		
		//Enumeration cursor only perform read operation . It does not perform set or remove methods
			
		Enumeration e=v.elements(); 	// Cursor	
		while(e.hasMoreElements())		// hasMoreElements() check element present or not
		{
			System.out.println(e.nextElement());	// extract elements.
		}
	}

}
