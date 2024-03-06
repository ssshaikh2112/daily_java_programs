class HDFC
{
	int amountBalance;
	HDFC(int amountBalance)
	{
		System.out.println("Processing your Account details...");
		if(amountBalance>=5000)
		{
			this.amountBalance=this.amountBalance+amountBalance;
			System.out.println("Your account is Successfully Created...");
		}
		else
		{
			System.out.println("Please deposit Sufficient Amount...");
		}

	}

	void geAmountBalance()
	{
		System.out.println("Your account balance is : "+amountBalance);
	}
}
class Customer
{

	public static void main(String[] args)
	{
		HDFC cutomer1 = new HDFC(5000);
		cutomer1.geAmountBalance();
	}
}