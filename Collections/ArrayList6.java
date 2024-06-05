package collections;

import java.util.ArrayList;

public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("sahil");
		al.add('s');
		al.add(100.5f);
		System.out.println(al);
		
		// remove() is overloaded method and it accept the index
		al.remove(0);
		
		System.out.println(al);
		
		//al.remove(100.5f);	--> could not convert to the index	
		// remove() method directly can not accept the object value 
		// 1st convert it to object and pass to remove()
		
		Float f=100.5f;
		al.remove(f);
		System.out.println(al);
	}

}
