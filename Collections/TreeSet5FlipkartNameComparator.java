package collections;

import java.util.Comparator;

public class TreeSet5FlipkartNameComparator implements Comparator<TreeSet5Flipkart>
{

	@Override
	public int compare(TreeSet5Flipkart o1, TreeSet5Flipkart o2) {
		return o1.productName.compareTo(o2.productName);
	}

	
}
