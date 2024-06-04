package collections;

import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) 
	{
		Emp e=new Emp(101, "Jon");
		Stud s=new Stud(1001,"Deo");
		Integer i=100;
	
		ArrayList al =new ArrayList();
		al.add(e);
		al.add(s);
		al.add(i);
		//System.out.println(al);
		
		for(Object o : al)
		{
			// instanceof checks tne refence is the type of class or not
			if(o instanceof Emp)
			{
				Emp ee=(Emp)o;
				System.out.println(ee.empId+" - "+ee.empName);
			}
			else if(o instanceof Stud)
			{
				Stud ss=(Stud)o;
				System.out.println(ss.studId+" - "+ss.studName);
			}
			else if(o instanceof Integer)
			{
				Integer ii=(Integer)o;
				System.out.println(ii);
			}
		}
		
	}

}
