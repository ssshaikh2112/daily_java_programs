class InvalidAmountTransfer extends RuntimeException
{
	
}

class Flipkart
{
	int productPrice=5000;
	void byProduct(int custemerPrice) throws InvalidAmountTransfer
	{
		if (productPrice==custemerPrice) 
		{
			System.out.println("Amount transfer Successfull...");
		}
		else
		{
			System.out.println("Fail...");
			throw new InvalidAmountTransfer();
		}
	}
}


/*
	 args Uncheck exception	
*/

class CustomeUnCheckException1
{
	public static void main(String[] args) throws InvalidAmountTransfer
	{
		Flipkart cust1=new Flipkart();
		cust1.byProduct(2000);
	}
}