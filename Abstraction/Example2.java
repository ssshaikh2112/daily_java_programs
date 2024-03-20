abstract class ApnaBankNetBanking
{
	abstract void moneyTransfer();					// To achieve abstraction there should be concept of overriding which is concept of potymorphism
}

class ApnaBankServer extends ApnaBankNetBanking		// To achieve abstraction we require 2 class
													//	Between two class there should be concept of inheritance
{
	void moneyTransfer()							// To achieve abstraction there should be concept of overriding which is concept of potymorphism
	{
		System.out.println("Logic for transfer money...");
	}
}

class Example2
{
	public static void main(String args[])
	{
		ApnaBankServer custmer=new ApnaBankServer();
		custmer.moneyTransfer();
	}
	
}