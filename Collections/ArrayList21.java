package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList21 {

	public static void main(String[] args)
	{
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(101,"motu"));
		al.add(new Emp(102,"patlu"));
		al.add(new Emp(103,"jhataka"));
		al.add(new Emp(104,"ghasita"));
		
		System.out.println("Before remove ArrayList is : ");
		for(Emp ee:al)
		{
			System.out.println(ee.empId+" - "+ee.empName);
		}
		System.out.println("-----------------");
		ListIterator<Emp> ie=al.listIterator();
		while(ie.hasNext())
		{
			Emp e1=ie.next();
			//System.out.println(e1.empId+" - "+e1.empName);
			if (e1.empName.equals("ghasita")) 
			{
				ie.remove();
				ie.add(new Emp(105,"chingum"));
			}
		}
		System.out.println("After remove  and Add ArrayList is : ");
		for(Emp ee:al)
		{
			System.out.println(ee.empId+" - "+ee.empName);
		}
		
	}

}
