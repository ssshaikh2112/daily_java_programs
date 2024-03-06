class Example4
{
	/*
		Static blocks are executed during class loading time and non static blocks are executed during object creation
		Static blocks are execute first.
		Non static blocks and constructor are executed how many times object is created...
	*/

	static
	{
		System.out.println("These is static block ");
	}

	{
		System.out.println("These is non static block ");
	}
	Example4()
	{
		System.out.println("These is 0 Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("These is Main block...");
		Example4 obj1= new Example4();
		Example4 obj2= new Example4();
	}
}