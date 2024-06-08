package collections;

import java.util.ArrayList;

public class ArrayList12 {

	public static void main(String[] args) 
	{
		// generic collection	-->	no need to upcast and downcast
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(101,"sahil"));
		
		//1st approach --> for each loop
		for(Emp e:al)
		{
			System.out.println(e.empId+" - "+e.empName);
		}
		
		// 2nd approach --> get(index)
		Emp e=al.get(0);
		System.out.println(e.empId+" - "+e.empName);
	}

}
