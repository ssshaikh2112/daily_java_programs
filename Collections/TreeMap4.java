package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap4 {

	public static void main(String[] args) {
		TreeMap tm1=new TreeMap(new TreeMap4EmployeeComparator());
		tm1.put(new Employee(101, "sahil"), "developer");
		tm1.put(new Employee(103, "jac"), "tester");
		tm1.put(new Employee(105, "lio"), "hr");
		tm1.put(new Employee(104, "sam"), "manager");

		Set ss=tm1.entrySet();
		Iterator ii=ss.iterator();
		while(ii.hasNext())
		{
			Map.Entry me=(Map.Entry)ii.next();
			Employee ee=(Employee)me.getKey();
			System.out.print(ee.empId+" - "+ee.empName+" == ");
			Object value= me.getValue();
			System.out.println(value);
			
		}
}
}
