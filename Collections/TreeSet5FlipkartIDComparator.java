package collections;

import java.util.Comparator;

public class TreeSet5FlipkartIDComparator implements Comparator<TreeSet5Flipkart>
{
	
	int status;

	@Override
	public int compare(TreeSet5Flipkart o1, TreeSet5Flipkart o2) {
		// TODO Auto-generated method stub
		
		if(o1.productId==o1.productId)
		{
			status= 0;
		}
		else if(o1.productId<o1.productId)
		{
			status= 1;
		}
		else if(o1.productId>o1.productId)
		{
			status= -1;
		}
		return status;
	}
	

}
