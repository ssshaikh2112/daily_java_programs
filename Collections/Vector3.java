package collections;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//					Vector(userDefinedCapacity , IncreamentByGivenValue)
		Vector v=new Vector(7,5);
		v.add(100);
		v.add(244);
		v.add("motu");
		v.add("patlu");
		System.out.println(v);	
		System.out.println("size is : "+v.size());				//4
		System.out.println("Capacity is : "+v.capacity());		//7	User Define Capacity
		
		v.add(100);
		v.add(244);
		v.add("motu");
		v.add("patlu");
		System.out.println(v);	
		System.out.println("size is : "+v.size());				 // 8
		System.out.println("Capacity is : "+v.capacity());		// 12	7+5=12 capacity crosses limit so capacity + userDefinedCapacity
		
		v.add(100);
		v.add(244);
		v.add("motu");
		v.add("patlu");
		v.add(100);
		v.add(244);
		v.add("motu");
		v.add("patlu");
		System.out.println(v);	
		System.out.println("Size is : "+v.size());				// 16
		System.out.println("capacity is : "+v.capacity());		// 17	12+5=17 capacity crosses limit so capacity + userDefinedCapacity

	}

}
