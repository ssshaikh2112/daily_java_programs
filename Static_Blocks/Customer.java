class HDFC
{
	int amountBalance;	// initially amountBalance=0
	
	static
	{
		System.out.println("Connect to HDFC SERVER");
	}
	{
		System.out.println("Logic to connect & Verify Adhar/PAN on Server");
	}
	HDFC(int amountBalance)
	{
		System.out.println("Processing your Account details...");
		if(amountBalance>=5000)
		{
			// The this keyword refers to the current object in a method or constructor.
			// this keyword is used to store the current class object address.

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
		HDFC cutomer1 = new HDFC(5500);
		cutomer1.geAmountBalance();
	}
}