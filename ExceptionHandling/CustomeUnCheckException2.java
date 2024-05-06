class InvalidAmountTransfer extends RuntimeException
{
	InvalidAmountTransfer(String exceptionInfo)
	{
		super(exceptionInfo);
	}
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
			throw new InvalidAmountTransfer("Amount transfer Fail...");
		}
	}
}


/*
	 args Uncheck exception	
*/

class CustomeUnCheckException2
{
	public static void main(String[] args) throws InvalidAmountTransfer
	{
		Flipkart cust1=new Flipkart();
		cust1.byProduct(2000);
	}
}