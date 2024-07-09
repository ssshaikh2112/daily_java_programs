package collections;

public class SwiggyItemIdComparable implements Comparable
{
	int itemId;
	String itemName;
	public SwiggyItemIdComparable(int itemId , String itemName) 
	{
		this.itemId=itemId;
		this.itemName=itemName;
	}
	

	@Override
	public int compareTo(Object o) {
		
		SwiggyItemIdComparable sic=(SwiggyItemIdComparable)o;
		int status = 0;
		if (itemId==sic.itemId) 
		{
			return 0;
		}
		else if (itemId>sic.itemId) 
		{
			return 1;
		}
		else if (itemId<sic.itemId) 
		{
			return -1;
		}
		
		return status;
	}

}
