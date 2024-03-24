interface ApnaBankAccount
{
	void bankaccount();
}
interface ApnaBankLoan
{
	void bankLoan();
}

class custemer1 implements ApnaBankAccount		// interface --> class == implements
{
	public void bankaccount()
	{
		System.out.println("Open Saving Account at Apna Bank...");
	}
}

class custemer2 implements ApnaBankLoan			// interface --> class == implements
{
	public void bankLoan()
	{
		System.out.println("Apply for Loan at Apna Bank...");
	}
}

class custemer3 implements ApnaBankAccount , ApnaBankLoan	//Java support the multiple inheritance at interface level but not support at class level
{
	public void bankaccount()
	{
		System.out.println("Open Current account at Apna Bank....");
	}
	public void bankLoan()
	{
		System.out.println("Apply for Loan at Apna Bank...");
	}
}

class Example19
{
	public static void main(String[] args)
	{
		ApnaBankAccount cust1 =new custemer1();
		cust1.bankaccount();
		System.out.println("------------------------------------");
		ApnaBankLoan cust2 = new custemer2();
		cust2.bankLoan();
		System.out.println("------------------------------------");
		custemer3 cust3 = new custemer3();
		cust3.bankaccount();
		cust3.bankLoan();
	}
}