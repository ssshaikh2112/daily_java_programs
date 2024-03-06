class Example5
{
	/*
		Static blocks are executed during class loading time and non static blocks are executed during object creation
		Static blocks are execute first.

		1. To initialize the static members variables during class loading time.
		2. To implements bussiness logic during class loader.
	*/
	
	static int number;
	static
	{
		System.out.println("These is static block : "+ number);
		number = 10;
	}

	static void method()
	{
		System.out.println("Value of number is : "+number);
	}

	public static void main(String[] args)
	{
		System.out.println("These is Main block...");
		method();
	}
}