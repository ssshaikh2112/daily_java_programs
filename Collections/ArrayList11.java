package collections;

import java.util.ArrayList;

public class ArrayList11 {

	public static void main(String[] args) 
	{
		// Normal Collection
		ArrayList al=new ArrayList();
		al.add(new Emp(101,"sahil"));
		//System.out.println(al);	print the address
		
		// There are two ways to extract data 
		
		// 1 approach
		
		for(Object o:al)
		{
			Emp e=(Emp)o;
			System.out.println(e.empId+" - "+e.empName);
		}
		
		// 2nd approach		-- get(index)
		
		Object o=al.get(0);
		Emp e=(Emp)o;
		System.out.println(e.empId+" - "+e.empName);
	}

}
