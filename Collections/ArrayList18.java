package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList18 {

	public static void main(String[] args) 
	{
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(101,"sahil"));
		al.add(new Emp(102,"shaikh"));
		al.add(new Emp(103,"dev"));
		
		//System.out.println(al);		printing the address
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Emp e=(Emp)i.next();
			System.out.println(e.empId+" - "+e.empName);
		}
		System.out.println("-------------");
		Iterator<Emp> ii=al.iterator();
		while(ii.hasNext())
		{
			Emp ee=ii.next();
			System.out.println(ee.empId+" - "+ee.empName);
			
		}
	}

}
