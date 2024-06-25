package collections;

import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101, "bheem");
		hm.put(106, "chutaki");
		hm.put(105, "jaggu");
		hm.put(102, "raju");
		hm.put(106, "Indumati");	// key duplicate --> it accept last entry's value
		System.out.println(hm);		// print sorted order (Insertion Order is not Maintain)
	}
}
