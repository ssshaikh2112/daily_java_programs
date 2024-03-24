abstract class ApnaAtm
{
	abstract void banking();
	abstract void estatements();
	void enterPin()
	{
		System.out.println("Enter your pin...");
	}
}
class ApnaServer extends ApnaAtm
{
	void banking()
	{
		System.out.println("Services for  Banking Atm...");
	}
	void estatements()
	{
		System.out.println("Services for eStatements......");
	}
	void eVerify()
	{
		System.out.println("Verify the custmer here ....");
	}
}
class Example9
{
	public static void main(String[] args)
	{
		// Normal Object creation
		ApnaServer cust1 = new ApnaServer();
		cust1.enterPin();
		cust1.banking();
		cust1.estatements();
		cust1.eVerify();

		System.out.println("--------------------------------------");
		
		// Upcasting [ child behave like a Parent ]
		ApnaAtm cust2 = new ApnaServer();
		cust2.enterPin();
		cust2.banking();
		cust2.estatements();
		//cust2.eVerify();		not accessible because  child behave like a Parent 

	}
}