interface ApnaBankServices
{
	void banking();
	void finance();
	void insurance();
}

abstract class ApnaBankBanking implements ApnaBankServices		// interface --> class == implements
{
	public void banking()
	{
		System.out.println("Logic for Banking system / Services.....");
	}
}

abstract class ApnaBankFinance extends ApnaBankBanking		// class --> class == extends
{
	public void finance()
	{
		System.out.println("Logic for Finance Services.......");
	}
}

class ApnaBankInsurance extends ApnaBankFinance			// class --> class == extends
{
	public void insurance()
	{
		System.out.println("Logic for Insurance Services.......");
	}
}

class Example17
{
	public static void main(String[] args)
	{
		ApnaBankInsurance cust1 = new ApnaBankInsurance();
		cust1.banking();
		cust1.finance();
		cust1.insurance();
		
		System.out.println("----------------------------------------");

		// Upcasting 
		ApnaBankServices cust2 = new ApnaBankInsurance();
		cust2.banking();
		cust2.finance();
		cust2.insurance();
	}
}