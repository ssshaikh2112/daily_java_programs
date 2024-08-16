package collections;

import java.util.Comparator;

public class ZomatoNameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Zomato z1=(Zomato)o1;
		Zomato z2=(Zomato)o2;
		return z1.itemName.compareTo(z2.itemName);
	}
	

}
