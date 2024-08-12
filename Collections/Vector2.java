package collections;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(100);
		v.add(244);
		v.add("motu");
		v.add("patlu");
		System.out.println(v);	
		System.out.println("size is : "+v.size());				//4
		System.out.println("Capacity is : "+v.capacity());		//10	//The default Capacity of vector is 10.
		
		v.add(100);
		v.add(244);
		v.add("motu");
		v.add("patlu");
		System.out.println(v);	
		System.out.println("size is : "+v.size());				 // 8
		System.out.println("Capacity is : "+v.capacity());		// 10	//The default Capacity of vector is 10.
		
		v.add(100);
		v.add(244);
		v.add("motu");
		v.add("patlu");
		System.out.println(v);	
		System.out.println("Size is : "+v.size());				// 12
		System.out.println("capacity is : "+v.capacity());		// 20	// If capacity is cross then it will go and double it

		
		//The default Capacity of vector is 10.
		// If capacity is cross then it will go and double it
	}

}
