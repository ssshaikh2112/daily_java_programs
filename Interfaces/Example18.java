interface ApnaBankAccount
{
	void bankAccount();
}
interface ApnaBankLoan extends ApnaBankAccount		// interface --> interface == extends
{
	void apnaLoan();
}
class Custemer1 implements ApnaBankAccount		// interface --> class == implements
{
	public void bankAccount()		// public because give the acccessibility more to child than parent
	{
		System.out.println("Open Saving Account......");
	}
}
class Custemer2 implements ApnaBankLoan		// interface --> class == implements
{
	public void bankAccount()		// public because give the acccessibility more to child than parent
	{
		System.out.println("Open Current Account......");
	}
	public void apnaLoan()			// public because give the acccessibility more to child than parent
	{
		System.out.println("Apply for loan ata Apna Bank......");
	}
}
class Example18
{
	public static void main(String args[])
	{
		//  Custemer1 open saving account for their basic needs
		//Upcasting 
		ApnaBankAccount cust1 = new Custemer1();
		cust1.bankAccount();
		System.out.println("------------------------------------");

		// Custemer2 open current account for loan purpose
		// Upcasting
		ApnaBankLoan cust2 = new Custemer2();
		cust2.bankAccount();
		cust2.apnaLoan();
	}
}