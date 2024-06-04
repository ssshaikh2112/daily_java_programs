package collections;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		// creating a ArrayList
		ArrayList al=new ArrayList();
		System.out.println(al);
		al.add(100);	// int --> Integer --> toString()
		al.add(100.5f);	// float --> Float --> toString()
		System.out.println(al);
		System.out.println("-------------");
		
		
		TestClass tc=new TestClass();
		al.add(tc);	// tc--> ref --> toString --> Object --> address
		System.out.println(al);	// address
		
	}

}
