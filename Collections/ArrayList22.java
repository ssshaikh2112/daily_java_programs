package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList22 {

	public static void main(String[] args) 
	{
		// convert Array to Collection
		
		// 1st Approach by asList() method	--> List
		
		String[] arr= {"motu","patlu","jhatka","ghasita"};
		List<String> ls=Arrays.asList(arr);
		
		for(String s: arr)
		{
			System.out.println(s);
		}
		
		// 2nd approach constructor base	--> ArrayList
		String[] arr2= {"bheem","jaggu","raju","kalia"};
		ArrayList<String> al= new ArrayList<String>(Arrays.asList(arr2));
		System.out.println(al.size());
		
		for(String s: arr2)
		{
			System.out.println(s);
		}
	}

}
