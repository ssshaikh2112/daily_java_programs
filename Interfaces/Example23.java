interface ApnaBankAccount
{
	void bankAccount();
}
interface ApnaBankLoan
{
	void bankLoan();
}

class KYC
{
	void idProof()
	{
		System.out.println("Upload your Adhar / Pan id...");
	}
}


class Example23 extends KYC implements ApnaBankAccount , ApnaBankLoan	// Class can extends another class and implemenets multiple interfaces
//class Example23  implements ApnaBankAccount , ApnaBankLoan extends KYC		 is not applicable
{
	public void bankAccount()
	{
		System.out.println("Open Your Current account at Apna Bank...");
	}
	public void bankLoan()
	{
		System.out.println("Apply for loan at Apna Bank...");
	}
	public static void main(String[] args)
	{
		Example23 cust1 = new Example23();
		cust1.bankAccount();
		cust1.bankLoan();
		cust1.idProof();
	}
}