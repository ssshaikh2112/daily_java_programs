interface PhonePay
{
	int getAmoutBalance();
	void setAmountBalance(int amountDeposite);
	void transferAmout(int amountTransfer);
}

// Java Bean Class

/*
	A class can contain private members and have public getters and setters
	is called as Java Bean class.

	# Java Bean Class also called 
		1.value object class.
		2.bussiness object class 
		3.data transfer object class

	A class contains private properties or private data members
	such classes called typely encapsulated class.

*/

class BankServer implements PhonePay
{
	private int amountBalance;		//0


	BankServer(int amountDeposite)
	{
		amountBalance = amountBalance+amountDeposite;
		System.out.println("Total Amount is "+amountBalance);
	}


	// Getters Method
	public int getAmoutBalance()
	{
		return amountBalance;
	}


	// Setters Method
	public void setAmountBalance(int amountDeposite)
	{
		this.amountBalance = this.amountBalance+amountDeposite;
		System.out.println("Total Amount is "+amountBalance);
	}


	public void transferAmout(int amountTransfer)
	{
		if(amountTransfer<=amountBalance)
		{
			System.out.println("You transfered "+amountTransfer);
			System.out.println("Transaction Successfull...");
			amountBalance=amountBalance-amountTransfer;
			System.out.println("The total amount balance is "+amountBalance);
		}
		else
		{
			System.out.println("Insuficient Amount...");
		}
	}


}

class Example2
{
	public static void main(String args[])
	{
		BankServer cust1 =new BankServer(19980);
		cust1.getAmoutBalance();
		cust1.setAmountBalance(0);
		cust1.transferAmout(3500);
		cust1.transferAmout(117);
		cust1.transferAmout(50);
		cust1.transferAmout(500);

	}
}