package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		
		LinkedList<Emp> llEmp=new LinkedList<Emp>();
		llEmp.add(new Emp(101,"oggy"));
		llEmp.add(new Emp(102,"motu"));
		llEmp.add(new Emp(103,"bheem"));
		llEmp.add(new Emp(104,"patlu"));
		
		// Iterator and ListIterator Cursor are applicable to LinkedList
		Iterator<Emp> ii=llEmp.iterator();
		
		while(ii.hasNext())
		{
			Emp ee=ii.next();
			System.out.println(ee.empId+" - "+ee.empName);
			
		}
		

	}

}
