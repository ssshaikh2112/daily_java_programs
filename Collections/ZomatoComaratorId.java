package collections;

import java.util.Comparator;

public class ZomatoComaratorId implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Zomato z1=(Zomato)o1;
		Zomato z2=(Zomato)o2;
		
		int status = 0;
		if (z1.itemId==z2.itemId) 
		{
			return 0;
		}
		else if (z1.itemId>z2.itemId) 
		{
			return 1;
		}
		else if (z1.itemId<z2.itemId) 
		{
			return -1;
		}
		
		return status;
		
	}

}
