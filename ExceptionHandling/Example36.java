class Hdfc
{
	int amountBalance;
	Hdfc(int amountBalance)
	{
		this.amountBalance=amountBalance;
	}
	void amountTransfer(int amountTran)
	{
		if (amountTran<=amountBalance)
		{
			System.out.println("Remaining amount is : ");
			amountBalance=amountBalance-amountTran;
			System.out.println(amountBalance);
		}
		else
		{
			throw new ArithmeticException("Enter your sufficient amount...");

			/*
				Exception in thread "main" java.lang.ArithmeticException: Enter your sufficient amount...
				at Hdfc.amountTransfer(Example36.java:18)
				 at Example36.main(Example36.java:29)
			*/
		}
	}
}


class Example36
{
	public static void main(String[] args)
	{
		Hdfc cust1=new Hdfc(5000);
		cust1.amountTransfer(70000);
	}
}
/*
	throws keyword is only use for checked exception.
*/