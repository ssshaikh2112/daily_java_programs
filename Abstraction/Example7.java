abstract class ApnaBankServices
{
	// method is abstract so class also abstract
	abstract void banking();
	abstract void insurance();
	abstract void finance();
}
abstract class ApnaBanking extends ApnaBankServices
{
	// method is abstract so class also abstract and out of 3 only 1 is completed till now
	void banking()
	{
		System.out.println("Logic for Banking Services...");
	}
}
abstract class ApnaInsurance extends ApnaBanking
{
	// method is abstract so class also abstract and out of 3 only 2 is completed till now
	void insurance()
	{
		System.out.println("Logic for Insurance in Apna Bank...");
	}
}
class ApnaFinance extends ApnaInsurance
{
	// Now 3 methods are completed now
	void finance()
	{
		System.out.println("Logic for Finance ...");
	}
}
class Example7
{
	public static void main(String args[])
	{
		// Normal Object Creation
		ApnaFinance custmer1 = new ApnaFinance();
		custmer1.banking();
		custmer1.insurance();
		custmer1.finance();

		System.out.println("--------------------------------------");

		//Upcasting
		ApnaBankServices custmer2 = new ApnaFinance();
		custmer2.banking();
		custmer2.insurance();
		custmer2.finance();
	}
}