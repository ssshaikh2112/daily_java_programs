package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap7 {

	public static void main(String[] args) 
	{
		HashMap hs1=new HashMap();
		hs1.put(new Amazon(105,"Mobile"), new Flipkart(1003,"PC"));
		hs1.put(new Amazon(103,"Buds"), new Flipkart(1001,"laptop"));
		hs1.put(new Amazon(102,"Charger"), new Flipkart(1005,"ipad"));
		hs1.put(new Amazon(104,"Glass"), new Flipkart(1002,"cpu"));
		hs1.put(new Amazon(101,"Memory"), new Flipkart(1004,"monnitor"));

		Set ss= hs1.entrySet();
		Iterator ii=ss.iterator();
		while(ii.hasNext())
		{
			Map.Entry me=(Map.Entry)ii.next();
			Amazon aa=(Amazon)me.getKey();
			Flipkart ff=(Flipkart)me.getValue();
			System.out.println("Amazon Product is : "+ff.productId+" - "+ff.productName);
			System.out.println("Flipkart Product is : "+aa.productId+" - "+aa.productName);
			System.out.println();

		}
	}

}
