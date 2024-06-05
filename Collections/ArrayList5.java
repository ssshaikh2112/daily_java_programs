package collections;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		
		// By using the generic data we do not need to use instanceof and no need to upcasting and downcating
		
		ArrayList<Emp> al=new ArrayList<Emp>();
		al.add(new Emp(101,"sahil"));
		al.add(new Emp(102,"jon"));
		al.add(new Emp(103,"Deo"));
		
		//System.out.println(al);  	not extract the data it print the address
		
		for(Emp ee:al) {
			System.out.println(ee.empId+" - "+ee.empName);
		}
	}

}
