class Example3
{
	/*
		Static blocks are executed during class loading time and non static blocks are executed during object creation
		Static blocks are execute first.
	*/

	static
	{
		System.out.println("These is static block ");
	}

	{
		System.out.println("These is non static block ");
	}
	public static void main(String[] args)
	{
		System.out.println("These is Main block...");
		Example3 obj1= new Example3();
	}
}