class RBI
{
	final void activationCharges()
	{
		System.out.println("RBI @ Activation charge shoild be 1%");

	}
	void personalLoan()
	{
		System.out.println("RBI @ Personal Loan should be 8%");
	}
}
class ApnaBank extends RBI
{
	void personalLoan()
	{
		System.out.println("Apna Bank @ Personal Loan should be 15%");
	}
}
class SapnaBank extends RBI
{
	void personalLoan()
	{
		System.out.println("Sapna Bank @ Personal Loan should be 12%");
	}
}
class Mybank extends RBI
{

}
class Example34
{
	public static void main(String[] args)
	{
		RBI cust1 = new ApnaBank();
		cust1.personalLoan(); 
		cust1.activationCharges();
		System.out.println("--------------------------------------");
		RBI cust2=new SapnaBank();
		cust2.personalLoan();
		cust2.activationCharges();
		System.out.println("--------------------------------------");
		RBI cust3 =new Mybank();
		cust3.personalLoan();
	}
}