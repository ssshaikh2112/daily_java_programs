class Amazon
{
	void payment(float debitCreditCard)
	{
		System.out.println("Logic to implements transaction of Debit / Credit card --- 1");
	}
	void payment(String upi)
	{
		System.out.println("Logic to implements upi id --- 2");
	}
	void payment(int cash)
	{
		System.out.println("Logic to implements transaction of cash --- 3");
	}
}

class Example4
{

	/*
		Q. Why it is called compile time polymorphism?
		Ans: Because The binding call which method is done during compilation process.
	*/

	public static void main(String[] args)
	{
		Amazon custmer = new Amazon();
		custmer.payment("sahil@123");	// it decide which method is to be call by passing the argumnets.
	}
}