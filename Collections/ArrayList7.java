package collections;
import java.util.ArrayList;
	
public class ArrayList7 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("Sahil");
		al.add(200.5f);
		al.add(true);
		System.out.println(al);
		
		//al.add(int index, object element);
		
		al.add(2, "Shaikh");				// it add the element at specific index within the ArrayList
		System.out.println(al);
		System.out.println(al.isEmpty());	//To check collection is empty or not
		
		al.clear();							//To clear the all elements within the ArrayList
		System.out.println(al);
		
		System.out.println(al.isEmpty());
		
	}

}
