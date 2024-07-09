package collections;

public class SwiggytemNameComparable implements Comparable
{

	int itemId;
	String itemName;
	public SwiggytemNameComparable(int itemId , String itemName) 
	{
		this.itemId=itemId;
		this.itemName=itemName;
	}
	
	
	@Override
	public int compareTo(Object o)	//swiggy
	{
		SwiggytemNameComparable s=(SwiggytemNameComparable)o;
		return itemName.compareTo(s.itemName);	// return int
		
	}
	
	

}
