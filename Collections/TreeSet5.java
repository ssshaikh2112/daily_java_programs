package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet5 {

	public static void main(String[] args) 
	{
																	// sort by according to name and logic is write in that class
		TreeSet<TreeSet5Flipkart> tsf=new TreeSet<TreeSet5Flipkart>(new TreeSet5FlipkartNameComparator());
		tsf.add(new TreeSet5Flipkart(104, "gogle"));
		tsf.add(new TreeSet5Flipkart(101, "cover"));
		tsf.add(new TreeSet5Flipkart(103, "shoes"));
		tsf.add(new TreeSet5Flipkart(108, "mobile"));
		tsf.add(new TreeSet5Flipkart(102, "laptop"));

		//System.out.println(tsf);
		Iterator<TreeSet5Flipkart> ii=tsf.iterator();
		while(ii.hasNext())
		{
			TreeSet5Flipkart ff=ii.next();
			System.out.println(ff.productId+" - "+ff.productName);
		}
	}
}
