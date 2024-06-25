package collections;

import java.util.HashMap;

public class HashMap3 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(101, "bheem");
		hm.put(106, "bheem");
		hm.put(105, "bheem");
		hm.put(102, "bheem");		// multiple duplicate values are allowed
		System.out.println(hm);		// print sorted order (Insertion Order is not Maintain)
	
	}

}
